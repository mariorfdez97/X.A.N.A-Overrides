package com.src.server;

import java.util.UUID;

import com.src.core.Player;

public class PlayerSession {
    private final UUID sessionId;
    private final Player player;
    private boolean isActive;
    private int score;

    public PlayerSession(Player player) {
        this.sessionId = UUID.randomUUID();
        this.player = player;
        this.isActive = true;
        this.score = 0;
    }

    public UUID getSessionId() {
        return sessionId;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void resetScore() {
        this.score = 0;
    }
}