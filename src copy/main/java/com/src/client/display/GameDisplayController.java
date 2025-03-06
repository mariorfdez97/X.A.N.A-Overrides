package com.src.client.display;

import com.src.core.GameState;
import com.src.core.Player;
import com.src.ai.XANA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameDisplayController {
    private final GameState gameState;
    private final XANA xana;
    private JFrame frame;
    private JTextArea gameStatusArea;
    private JButton updateButton;

    public GameDisplayController(GameState gameState, XANA xana) {
        this.gameState = gameState;
        this.xana = xana;
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("X.A.N.A. Override: Game Display");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        gameStatusArea = new JTextArea();
        gameStatusArea.setBounds(20, 20, 550, 300);
        gameStatusArea.setEditable(false);
        frame.add(gameStatusArea);

        updateButton = new JButton("Update Status");
        updateButton.setBounds(20, 330, 150, 30);
        updateButton.addActionListener((ActionEvent e) -> {
            updateGameStatus();
        });
        frame.add(updateButton);

        frame.setVisible(true);
    }

    public void updateGameStatus() {
        StringBuilder status = new StringBuilder();
        status.append("Current Players:\n");

        for (Player player : gameState.getPlayers()) {
            status.append(player.getName()).append(" - Score: ").append(player.getScore()).append("\n");
        }
        
        status.append("\nX.A.N.A. Status: ").append(xana.getStatus());
        gameStatusArea.setText(status.toString());
    }
}