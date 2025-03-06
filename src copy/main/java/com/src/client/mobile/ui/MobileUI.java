package com.src.client.mobile.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MobileUI {
    private JFrame frame;
    private JPanel mainPanel;
    private JLabel statusLabel;

    public MobileUI() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("X.A.N.A. Override: Mobile Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 1));
        frame.add(mainPanel, BorderLayout.CENTER);

        statusLabel = new JLabel("Welcome to X.A.N.A. Override!", SwingConstants.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void addGameElement(JComponent component) {
        mainPanel.add(component);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public void updateStatus(String message) {
        statusLabel.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MobileUI::new);
    }
}