package com.src.client.display;

import javax.swing.*;
import java.awt.*;

public class DisplayMain {
    private JFrame frame;
    private final GameDisplayController displayController;

    public DisplayMain(GameDisplayController displayController) {
        this.displayController = displayController;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("X.A.N.A. Override: Cyber Possession");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Create and set up the main components
        JPanel statusPanel = new GameStatusPanel(displayController);
        JPanel visualizationPanel = new XANAVisualization(displayController);

        frame.add(statusPanel, BorderLayout.NORTH);
        frame.add(visualizationPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void updateDisplay() {
        // Update the display based on the game state
        displayController.updateGameStatus();
    }

    public static void main(String[] args) {
        GameDisplayController controller = new GameDisplayController();
        DisplayMain displayMain = new DisplayMain(controller);
        displayMain.updateDisplay();
    }
}