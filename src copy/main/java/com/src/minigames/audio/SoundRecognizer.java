package com.src.minigames.audio;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundRecognizer {

    private Clip clip;

    public SoundRecognizer() {
        // Constructor
    }

    public void loadSound(String soundFilePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File soundFile = new File(soundFilePath);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
    }

    public void playSound() {
        if (clip != null) {
            clip.start();
        }
    }

    public void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void close() {
        if (clip != null) {
            clip.close();
        }
    }
}