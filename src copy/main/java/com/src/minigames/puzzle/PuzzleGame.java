package com.src.minigames.puzzle;

import com.src.minigames.Minigame;
import java.util.List;
import java.util.Random;

public class PuzzleGame extends Minigame {
    private List<String> puzzles;
    private String currentPuzzle;
    private int attempts;

    public PuzzleGame(List<String> puzzles) {
        this.puzzles = puzzles;
        this.attempts = 0;
        selectRandomPuzzle();
    }

    private void selectRandomPuzzle() {
        Random random = new Random();
        currentPuzzle = puzzles.get(random.nextInt(puzzles.size()));
    }

    @Override
    public String getCurrentPuzzle() {
        return currentPuzzle;
    }

    @Override
    public boolean submitAnswer(String answer) {
        attempts++;
        if (isCorrectAnswer(answer)) {
            return true;
        }
        return false;
    }

    private boolean isCorrectAnswer(String answer) {
        // Logic to check if the answer is correct
        return answer.equalsIgnoreCase(currentPuzzle); // Placeholder logic
    }

    public int getAttempts() {
        return attempts;
    }

    @Override
    public void resetGame() {
        attempts = 0;
        selectRandomPuzzle();
    }
}