package com.src.minigames.audio;

import com.src.minigames.Minigame;
import com.src.core.Player;

import java.util.List;

public class AudioChallenge extends Minigame {
    private String audioClip;
    private List<String> answerOptions;
    private String correctAnswer;

    public AudioChallenge(String name, String description, int difficulty, String audioClip, List<String> answerOptions, String correctAnswer) {
        super(name, description, difficulty);
        this.audioClip = audioClip;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    private void playAudioClip() {
        // Code to play the audio clip
    }

    private void presentAnswerOptions(Player player) {
        // Code to display answer options to the player
    }

    @Override
    public boolean checkAnswer(String playerAnswer) {
        return playerAnswer.equalsIgnoreCase(correctAnswer);
    }

    @Override
    public String getChallengeType() {
        return "Audio Challenge";
    }

    @Override
    public void startGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startGame'");
    }

    @Override
    public boolean isGameCompleted() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isGameCompleted'");
    }

    @Override
    public void resetGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetGame'");
    }
}