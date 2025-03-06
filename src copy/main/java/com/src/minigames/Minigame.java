package com.src.minigames;

public abstract class Minigame {
    protected String name;
    protected String description;
    protected int timeLimit;

    public Minigame(String name, String description, int timeLimit) {
        this.name = name;
        this.description = description;
        this.timeLimit = timeLimit;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public abstract void startGame();

    public abstract boolean isGameCompleted();

    public abstract void resetGame();
}