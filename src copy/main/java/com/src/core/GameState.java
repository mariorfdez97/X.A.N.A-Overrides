package com.src.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GameState {
    private final Map<String, Integer> playerScores;
    private int currentChallengeIndex;
    private boolean isGameActive;

    public GameState() {
        playerScores = new HashMap<>();
        currentChallengeIndex = 0;
        isGameActive = true;
    }

    public void addPlayer(String playerId) {
        playerScores.put(playerId, 0);
    }

    public void updateScore(String playerId, int score) {
        if (playerScores.containsKey(playerId)) {
            playerScores.put(playerId, playerScores.get(playerId) + score);
        }
    }

    public void initialize() {
        // Clear any existing player scores
        playerScores.clear();
        
        // Reset challenge index to starting point
        currentChallengeIndex = 0;
        
        // Set game to active state
        isGameActive = true;
    }

    public void update() {
        // Logic to update the game state based on player actions and X.A.N.A.'s sabotage
        // This is a placeholder for the actual update logic
        // For example, you might check player actions, apply sabotage effects, etc.
        
        // Example: Increment the challenge index as a simple update
        currentChallengeIndex++;
        
        // Example: Check if the game should end
        if (currentChallengeIndex > 10) { // Arbitrary condition for demonstration
            endGame();
        }
    }

    public int getScore(String playerId) {
        return playerScores.getOrDefault(playerId, 0);
    }

    public void setCurrentChallengeIndex(int index) {
        this.currentChallengeIndex = index;
    }

    public int getCurrentChallengeIndex() {
        return currentChallengeIndex;
    }

    public void endGame() {
        isGameActive = false;
    }

    public boolean isGameActive() {
        return isGameActive;
    }

    public Map<String, Integer> getPlayerScores() {
        return playerScores;
    }

    public Set<String> getPlayers() {
        return playerScores.keySet();
    }

    public void removePlayer(String playerId) {
        playerScores.remove(playerId);
    }
}