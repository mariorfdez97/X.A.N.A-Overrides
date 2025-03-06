package com.src.client.mobile;

import com.src.config.NetworkConfig;
import com.src.client.mobile.ui.MobileUI;

public class MobileClientMain {
    public static void main(String[] args) {
        // Initialize the mobile user interface
        MobileUI mobileUI = new MobileUI();
        mobileUI.initialize();

        // Connect to the game server
        connectToServer();
    }

    private static void connectToServer() {
        String serverAddress = NetworkConfig.getServerAddress();
        int serverPort = NetworkConfig.getServerPort();

        // Logic to establish a connection to the server
        // This could involve creating a WebSocket connection or similar
        System.out.println("Connecting to server at " + serverAddress + ":" + serverPort);
        // Implement connection logic here
    }
}