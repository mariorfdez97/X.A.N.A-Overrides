package com.src.core;

public class Player {
    private final String playerId;
    private final String playerName;
    private int score;
    private boolean isActive;
    private CodeFragment assignedFragment;

    public Player(String playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.score = 0;
        this.isActive = true;
        this.assignedFragment = null;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public boolean isActive() {
        return isActive;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void assignCodeFragment(CodeFragment fragment) {
        this.assignedFragment = fragment;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                ", isActive=" + isActive +
                '}';
    }
}