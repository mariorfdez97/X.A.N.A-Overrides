package com.src.minigames;

import com.src.minigames.audio.AudioChallenge;
import com.src.minigames.physical.PhysicalChallenge;
import com.src.minigames.puzzle.PuzzleGame;
import com.src.minigames.trivia.TriviaGame;

public class MinigameFactory {

    public static Minigame createMinigame(String type) {
        switch (type.toLowerCase()) {
            case "trivia":
                return new TriviaGame();
            case "physical":
                return new PhysicalChallenge();
            case "puzzle":
                return new PuzzleGame();
            case "audio":
                return new AudioChallenge();
            default:
                throw new IllegalArgumentException("Unknown minigame type: " + type);
        }
    }
}