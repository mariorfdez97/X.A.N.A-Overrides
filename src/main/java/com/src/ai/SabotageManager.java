package com.src.ai;

import java.util.Random;

public class SabotageManager {
    private static final String[] SABOTAGE_TYPES = {
        "Noise", "ScreenChange", "VisualInterference", "TraitorMessage", "AcceleratedTime"
    };

    private final Random random;

    public SabotageManager() {
        this.random = new Random();
    }

    public String triggerRandomSabotage() {
        int index = random.nextInt(SABOTAGE_TYPES.length);
        return SABOTAGE_TYPES[index];
    }

    public void executeSabotage(String sabotageType) {
        switch (sabotageType) {
            case "Noise" -> applyNoiseSabotage();
            case "ScreenChange" -> applyScreenChangeSabotage();
            case "VisualInterference" -> applyVisualInterferenceSabotage();
            case "TraitorMessage" -> applyTraitorMessageSabotage();
            case "AcceleratedTime" -> applyAcceleratedTimeSabotage();
            default -> throw new IllegalArgumentException("Unknown sabotage type: " + sabotageType);
        }
    }

    private void applyNoiseSabotage() {
        // Logic for applying noise sabotage
    }

    private void applyScreenChangeSabotage() {
        // Logic for applying screen change sabotage
    }

    private void applyVisualInterferenceSabotage() {
        // Logic for applying visual interference sabotage
    }

    private void applyTraitorMessageSabotage() {
        // Logic for applying traitor message sabotage
    }

    private void applyAcceleratedTimeSabotage() {
        // Logic for applying accelerated time sabotage
    }
}