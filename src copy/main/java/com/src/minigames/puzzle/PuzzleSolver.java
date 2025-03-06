package com.src.minigames.puzzle;

import java.util.List;

public class PuzzleSolver {

    private List<String> puzzlePieces;
    private String solution;

    public PuzzleSolver(List<String> puzzlePieces, String solution) {
        this.puzzlePieces = puzzlePieces;
        this.solution = solution;
    }

    public boolean solvePuzzle(List<String> playerInput) {
        return playerInput.equals(puzzlePieces);
    }

    public String getSolution() {
        return solution;
    }

    public List<String> getPuzzlePieces() {
        return puzzlePieces;
    }

    public void setPuzzlePieces(List<String> puzzlePieces) {
        this.puzzlePieces = puzzlePieces;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}