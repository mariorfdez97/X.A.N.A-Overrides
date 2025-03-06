package com.src.client.mobile.ui;

import java.util.Random;

public class SabotageEffects {

    private static final String[] SABOTAGE_MESSAGES = {
        "X.A.N.A. ha interferido con tu dispositivo!",
        "Ruido blanco digital activado!",
        "Tus respuestas están siendo distorsionadas!",
        "X.A.N.A. ha cambiado la información que ves!",
        "Mensajes traidores enviados por X.A.N.A.!"
    };

    private Random random;

    public SabotageEffects() {
        this.random = new Random();
    }

    public String getRandomSabotageMessage() {
        return SABOTAGE_MESSAGES[random.nextInt(SABOTAGE_MESSAGES.length)];
    }

    public void applySabotageEffect(String effectType) {
        switch (effectType) {
            case "NOISE":
                // Implementar lógica para ruido blanco
                break;
            case "DISTORTION":
                // Implementar lógica para distorsión de respuestas
                break;
            case "SCREEN_CHANGE":
                // Implementar lógica para cambio de pantalla
                break;
            case "TRAITOR_MESSAGE":
                // Implementar lógica para mensajes traidores
                break;
            default:
                throw new IllegalArgumentException("Tipo de sabotaje desconocido: " + effectType);
        }
    }
}