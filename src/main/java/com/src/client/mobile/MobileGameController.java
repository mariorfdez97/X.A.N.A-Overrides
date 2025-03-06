package com.src.client.mobile;

import com.src.core.GameState;
import com.src.core.Player;
import com.src.ai.XANA;
import com.src.client.mobile.ui.MobileUI;

public class MobileGameController {
    private GameState gameState;
    private Player player;
    private MobileUI mobileUI;
    private XANA xanaAI;

    public MobileGameController(GameState gameState, Player player, MobileUI mobileUI, XANA xanaAI) {
        this.gameState = gameState;
        this.player = player;
        this.mobileUI = mobileUI;
        this.xanaAI = xanaAI;
    }

    public void startGame() {
        mobileUI.displayWelcomeMessage();
        // Additional logic to start the game
    }

    public void handlePlayerAction(String action) {
        // Logic to handle player actions
        switch (action) {
            case "ANSWER" -> {
            }
            case "MINIGAME" -> {
            }
            default -> mobileUI.displayError("Unknown action");
        }
        // Process answer from player
        // Start a minigame
        // Add more cases as needed
            }

    public void updateGameState() {
        // Logic to update the game state based on player actions and X.A.N.A.'s actions
        if (xanaAI.isActive()) {
            xanaAI.performSabotage();
        }
        mobileUI.updateDisplay(gameState);
    }

    public void endGame() {
        mobileUI.displayGameOver();
        // Additional logic to handle end of game
    }
}