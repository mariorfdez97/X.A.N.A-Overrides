package com.src.client.mobile.ui;

import minigames.Minigame;
import core.GameState;
import core.Player;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinigameScreen extends JFrame {
    private Minigame currentMinigame;
    private GameState gameState;
    private Player player;

    public MinigameScreen(GameState gameState, Player player) {
        this.gameState = gameState;
        this.player = player;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Minigame Challenge");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Minigame: " + currentMinigame.getName(), SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        JTextArea instructionsArea = new JTextArea(currentMinigame.getInstructions());
        instructionsArea.setEditable(false);
        add(instructionsArea, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Minigame");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startMinigame();
            }
        });
        add(startButton, BorderLayout.SOUTH);
    }

    public void setCurrentMinigame(Minigame minigame) {
        this.currentMinigame = minigame;
        updateUI();
    }

    private void updateUI() {
        if (currentMinigame != null) {
            setTitle("Minigame: " + currentMinigame.getName());
            // Update other UI components as necessary
        }
    }

    private void startMinigame() {
        // Logic to start the minigame
        currentMinigame.start();
        // Update game state and player status
    }
}