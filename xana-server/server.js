const express = require("express");
const http = require("http");
const socketIo = require("socket.io");
const cors = require("cors");

const app = express();
app.use(cors());

const server = http.createServer(app);
const io = socketIo(server, {
    cors: {
        origin: "*",
    }
});

let players = [];
let xanaStatus = "Dormida";
let timer = 60;

io.on("connection", (socket) => {
    console.log("Un jugador se ha conectado");

    socket.on("joinGame", (data) => {
        players.push({ id: socket.id, name: data.name, status: "Jugando" });
        io.emit("updatePlayers", players);
    });

    socket.on("startGame", () => {
        xanaStatus = "Activo";
        io.emit("updateXana", xanaStatus);
    });

    setInterval(() => {
        if (timer > 0) {
            timer--;
            io.emit("updateTimer", timer);
        } else {
            xanaStatus = "Hackeando Fragmentos";
            io.emit("updateXana", xanaStatus);
        }
    }, 1000);
});

server.listen(3001, () => {
    console.log("Servidor corriendo en http://localhost:3001");
});
