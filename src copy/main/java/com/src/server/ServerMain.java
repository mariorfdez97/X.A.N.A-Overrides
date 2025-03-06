package com.src.server;

import com.src.config.NetworkConfig;

public class ServerMain {
    public static void main(String[] args) {
        GameServer gameServer = new GameServer();
        gameServer.startSession();
        System.out.println("Game server started on port: " + NetworkConfig.getServerPort());
    }
}
