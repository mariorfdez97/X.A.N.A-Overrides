package com.src.ai;

import java.util.Random;

public class XANA {
    private int corruptionLevel;
    private final Random random;

    public XANA() {
        this.corruptionLevel = 0;
        this.random = new Random();
    }

    public void evolve() {
        // Logic for X.A.N.A. to evolve and increase its capabilities
        corruptionLevel += random.nextInt(5); // Increase corruption level randomly
        if (corruptionLevel > 100) {
            corruptionLevel = 100; // Cap corruption level
        }
    }

    public void sabotage() {
        
    }

    public int getCorruptionLevel() {
        return corruptionLevel;
    }

    public void resetCorruption() {
        corruptionLevel = 0; // Reset corruption level for a new game session
    }
}