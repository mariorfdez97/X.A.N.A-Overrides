import React, { useState, useEffect } from "react";
import io from "socket.io-client";

const socket = io("http://localhost:3001");

const GameScreen = () => {
    const [players, setPlayers] = useState([]);
    const [xanaStatus, setXanaStatus] = useState("Dormida");
    const [timer, setTimer] = useState(60);

    useEffect(() => {
        socket.on("updatePlayers", (data) => setPlayers(data));
        socket.on("updateXana", (status) => setXanaStatus(status));
        socket.on("updateTimer", (time) => setTimer(time));
    }, []);

    return (
        <div>
            <h1>Estado de X.A.N.A.: {xanaStatus}</h1>
            <h2>Tiempo Restante: {timer} segundos</h2>
            <h3>Jugadores Conectados:</h3>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>{player.name} - {player.status}</li>
                ))}
            </ul>
        </div>
    );
};

export default GameScreen;
