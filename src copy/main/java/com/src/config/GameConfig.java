package com.src.config;

public class GameConfig {
    private static int maxPlayers;
    private int minigameTimeLimit;
    private int sabotageCooldown;
    private String gameName;

    public GameConfig() {
        this.minigameTimeLimit = 30; // Default time limit for minigames in seconds
        this.sabotageCooldown = 90; // Default cooldown time for sabotages in seconds
        this.gameName = "X.A.N.A. Override"; // Default game name
    }

    public static int getMaxPlayers() {
        return maxPlayers;
    }

    public static void setMaxPlayers(int maxPlayers) {
        GameConfig.maxPlayers = maxPlayers;
    }

    public int getMinigameTimeLimit() {
        return minigameTimeLimit;
    }

    public void setMinigameTimeLimit(int minigameTimeLimit) {
        this.minigameTimeLimit = minigameTimeLimit;
    }

    public int getSabotageCooldown() {
        return sabotageCooldown;
    }

    public void setSabotageCooldown(int sabotageCooldown) {
        this.sabotageCooldown = sabotageCooldown;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}