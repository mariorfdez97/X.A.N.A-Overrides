package com.src.server.websocket;

import javax.websocket.OnMessage;
import javax.websocket.Session;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.src.server.PlayerSession;

public class MessageHandler {

    private static final Gson gson = new Gson();

    @OnMessage
    public void handleMessage(String message, Session session) {
        JsonObject jsonMessage = gson.fromJson(message, JsonObject.class);
        String command = jsonMessage.get("command").getAsString();
        PlayerSession playerSession = getPlayerSession(session);

        switch (command) {
            case "join" -> handleJoinCommand(jsonMessage, playerSession);
            case "answer" -> handleAnswerCommand(jsonMessage, playerSession);
            case "action" -> handleActionCommand(jsonMessage, playerSession);
            default -> sendErrorMessage(session, "Unknown command: " + command);
        }
    }

    private PlayerSession getPlayerSession(Session session) {
        // Logic to retrieve the PlayerSession associated with the WebSocket session
        return null; // Placeholder for actual implementation
    }

    private void handleJoinCommand(JsonObject jsonMessage, PlayerSession playerSession) {
        // Logic to handle player joining the game
    }

    private void handleAnswerCommand(JsonObject jsonMessage, PlayerSession playerSession) {
        // Logic to handle player's answer to a minigame
    }

    private void handleActionCommand(JsonObject jsonMessage, PlayerSession playerSession) {
        // Logic to handle other game actions
    }

    private void sendErrorMessage(Session session, String errorMessage) {
        JsonObject errorResponse = new JsonObject();
        errorResponse.addProperty("error", errorMessage);
        try {
            session.getBasicRemote().sendText(gson.toJson(errorResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}