package com.src.server;

import java.util.ArrayList;
import java.util.List;

import com.src.core.GameSession;
import com.src.core.Player;

public class GameServer {
    private final List<GameSession> activeSessions;

    public GameServer() {
        this.activeSessions = new ArrayList<>();
    }

    public void startSession() {
        GameSession newSession = new GameSession();
        activeSessions.add(newSession);
        newSession.startSession();
    }

    public void addPlayerToSession(Player player, GameSession session) {
        try {
            if (session.addPlayer(player) != 1) {
                System.out.println("Player " + player.getPlayerName() + " added to session.");
            } else {
                System.out.println("Session is full or player cannot join.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while adding player to session: " + e.getMessage());
        }
    }

    public void removePlayerFromSession(Player player, GameSession session) {
        session.removePlayer(player);
        System.out.println("Player " + player.getPlayerName() + " removed from session.");
    }

    public List<GameSession> getActiveSessions() {
        return activeSessions;
    }

    public void stopSession(GameSession session) {
        activeSessions.remove(session);
        session.end();
        activeSessions.remove(session);
        System.out.println("Session ended.");
    }
}