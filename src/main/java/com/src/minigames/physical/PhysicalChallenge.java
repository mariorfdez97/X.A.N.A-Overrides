package com.src.minigames.physical;

import com.src.minigames.Minigame;

public class PhysicalChallenge extends Minigame {
    private String challengeDescription;
    private int difficultyLevel;

    public PhysicalChallenge(String challengeDescription, int difficultyLevel) {
        this.challengeDescription = challengeDescription;
        this.difficultyLevel = difficultyLevel;
    }

    public String getChallengeDescription() {
        return challengeDescription;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    @Override
    public void startChallenge() {
        // Logic to start the physical challenge
        System.out.println("Starting physical challenge: " + challengeDescription);
    }

    @Override
    public boolean isChallengeCompleted() {
        // Logic to determine if the challenge is completed
        return false; // Placeholder return value
    }
}