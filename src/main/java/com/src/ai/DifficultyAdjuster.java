package com.src.ai;

public class DifficultyAdjuster {
    private final int baseDifficulty;
    private int playerCount;
    private int timeElapsed;

    public DifficultyAdjuster(int baseDifficulty) {
        this.baseDifficulty = baseDifficulty;
        this.playerCount = 0;
        this.timeElapsed = 0;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public void updateTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public int calculateDifficulty() {
        int difficulty = baseDifficulty;

        // Adjust difficulty based on player count
        if (playerCount > 3) {
            difficulty += (playerCount - 3) * 2; // Increase difficulty for more players
        }

        // Adjust difficulty based on time elapsed
        if (timeElapsed > 60) {
            difficulty += (timeElapsed / 60); // Increase difficulty for longer games
        }

        return difficulty;
    }
}