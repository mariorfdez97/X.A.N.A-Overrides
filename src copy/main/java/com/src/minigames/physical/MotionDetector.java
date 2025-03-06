package com.src.minigames.physical;

import java.util.Random;

public class MotionDetector {
    private boolean isActive;
    private int detectionThreshold;
    private Random random;

    public MotionDetector(int detectionThreshold) {
        this.detectionThreshold = detectionThreshold;
        this.isActive = false;
        this.random = new Random();
    }

    public void activate() {
        isActive = true;
    }

    public void deactivate() {
        isActive = false;
    }

    public boolean detectMotion() {
        if (!isActive) {
            return false;
        }
        // Simulate motion detection with a random value
        int motionValue = random.nextInt(100);
        return motionValue > detectionThreshold;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getDetectionThreshold() {
        return detectionThreshold;
    }

    public void setDetectionThreshold(int detectionThreshold) {
        this.detectionThreshold = detectionThreshold;
    }
}