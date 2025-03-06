package com.src;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.src.client.mobile.MobileClientMain;
import com.src.config.GameConfig;
import com.src.config.NetworkConfig;
import com.src.server.GameServer;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static GameServer gameServer;

    public static void main(String[] args) {
        try {
            initializeConfigurations();
            startGameServer();
            //startMobileClient();
            //addShutdownHook();
            
            LOGGER.info("X.A.N.A. Override game system initialized successfully");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to start the game system", e);
            System.exit(1);
        }
    }

    private static void initializeConfigurations() {
        // Initialize game configurations
        GameConfig gameConfig = new GameConfig();
        GameConfig.setMaxPlayers(4);
        gameConfig.setMinigameTimeLimit(60);
        gameConfig.setSabotageCooldown(30);

        // Initialize network configurations
        NetworkConfig networkConfig = new NetworkConfig("localhost", 8080);
    }

    private static void startGameServer() {
        gameServer = new GameServer();
        gameServer.startSession();
        LOGGER.info("Game server started successfully");
    }

    private static void startMobileClient() {
        if (shouldStartMobileClient()) {
            try {
                MobileClientMain mobileClient = new MobileClientMain();
                // Start mobile client in a separate thread
                new Thread(() -> {
                    try {
                        //mobileClient.initialize();
                        LOGGER.info("Mobile client started successfully");
                    } catch (Exception e) {
                        LOGGER.log(Level.WARNING, "Failed to start mobile client", e);
                    }
                }).start();
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Failed to initialize mobile client", e);
            }
        }
    }

    private static boolean shouldStartMobileClient() {
        // Add logic to determine if mobile client should start
        // For example, based on command line arguments or configuration
        return true;
    }

    private static void addShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            LOGGER.info("Shutting down X.A.N.A. Override game system...");
            if (gameServer != null) {
                gameServer.getActiveSessions().forEach(gameServer::stopSession);
                LOGGER.info("All game sessions terminated");
            }
        }));
    }
}