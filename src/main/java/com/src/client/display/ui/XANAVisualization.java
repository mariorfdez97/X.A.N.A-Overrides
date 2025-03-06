package com.src.client.display.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class XANAVisualization extends JPanel {
    private final List<String> attackMessages;
    private int currentAttackIndex;

    public XANAVisualization() {
        this.attackMessages = List.of(
            "X.A.N.A. is launching a digital attack!",
            "X.A.N.A. has corrupted a fragment!",
            "X.A.N.A. is sowing chaos among players!",
            "X.A.N.A. is evolving and becoming stronger!"
        );
        this.currentAttackIndex = 0;
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBackground(g);
        drawAttackMessage(g);
    }

    private void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private void drawAttackMessage(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(attackMessages.get(currentAttackIndex), 50, 100);
    }

    public void updateAttackMessage() {
        currentAttackIndex = (currentAttackIndex + 1) % attackMessages.size();
        repaint();
    }
}