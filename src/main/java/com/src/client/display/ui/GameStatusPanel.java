package com.src.client.display.ui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStatusPanel extends JPanel {
    private final JLabel playerScoreLabel;
    private final JLabel timeRemainingLabel;
    private int playerScore;
    private int timeRemaining;

    public GameStatusPanel() {
        setLayout(new GridLayout(2, 1));
        playerScoreLabel = new JLabel("Player Score: 0");
        timeRemainingLabel = new JLabel("Time Remaining: 60");
        
        add(playerScoreLabel);
        add(timeRemainingLabel);
    }

    public void updateScore(int score) {
        this.playerScore = score;
        playerScoreLabel.setText("Player Score: " + playerScore);
    }

    public void updateTime(int time) {
        this.timeRemaining = time;
        timeRemainingLabel.setText("Time Remaining: " + timeRemaining);
    }
}