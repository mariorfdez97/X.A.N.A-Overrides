import React, { useState, useEffect } from "react";
import { View, Text, TextInput, Button } from "react-native";
import io from "socket.io-client";

const socket = io("http://localhost:3001");

const GameApp = () => {
    const [name, setName] = useState("");
    const [connected, setConnected] = useState(false);

    const joinGame = () => {
        socket.emit("joinGame", { name });
        setConnected(true);
    };

    useEffect(() => {
        socket.on("gameMessage", (message) => {
            alert(message);
        });
    }, []);

    return (
        <View>
            {!connected ? (
                <>
                    <Text>Ingresa tu nombre:</Text>
                    <TextInput value={name} onChangeText={setName} />
                    <Button title="Unirse al juego" onPress={joinGame} />
                </>
            ) : (
                <Text>Conectado a X.A.N.A. Override</Text>
            )}
        </View>
    );
};

export default GameApp;
