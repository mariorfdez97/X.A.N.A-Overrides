package com.src.core;

import java.util.ArrayList;
import java.util.List;

import com.src.config.GameConfig;

public class GameSession {
    private final List<Player> players;
    private final GameState gameState;
    private int currentFragmentIndex;
    private List<CodeFragment> codeFragments;

    public GameSession() {
        this.players = new ArrayList<>();
        this.gameState = new GameState();
        this.currentFragmentIndex = 0;
        this.codeFragments = new ArrayList<>();
    }

    public int addPlayer(Player player) throws Exception {
        if (players.size() < GameConfig.getMaxPlayers()) {
            players.add(player);
            return 1;
        } else {
            throw new Exception("Session is full");
        }
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void startSession() {
        // Initialize game state and distribute code fragments
        gameState.initialize();
        distributeCodeFragments();
    }

    public void end() {
        // End the game session
        players.clear();
        gameState.endGame();
    }

    private void distributeCodeFragments() {
        // Logic to distribute code fragments to players
        for (Player player : players) {
            // Assign a code fragment to each player
            if (currentFragmentIndex < codeFragments.size()) {
                player.assignCodeFragment(codeFragments.get(currentFragmentIndex));
                currentFragmentIndex++;
            }
        }
    }

    public void updateGameState() {
        // Update the game state based on player actions and X.A.N.A.'s sabotage
        gameState.update();
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setCodeFragments(List<CodeFragment> codeFragments) {
        this.codeFragments = codeFragments;
    }
}