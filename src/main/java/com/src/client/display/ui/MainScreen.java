package com.src.client.display.ui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MainScreen extends JFrame {
    
    public MainScreen() {
        setTitle("X.A.N.A. Override: Cyber Possession");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initializeUI();
    }

    private void initializeUI() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to X.A.N.A. Override", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JTextArea instructionsArea = new JTextArea("Instructions:\n- Work together to recover the Code Override.\n- Complete minigames and challenges.\n- Beware of X.A.N.A.'s sabotage!");
        instructionsArea.setEditable(false);
        instructionsArea.setLineWrap(true);
        instructionsArea.setWrapStyleWord(true);
        mainPanel.add(instructionsArea, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> startGame());
        mainPanel.add(startButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void startGame() {
        // Logic to start the game goes here
        System.out.println("Game Started!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainScreen mainScreen = new MainScreen();
            mainScreen.setVisible(true);
        });
    }
}