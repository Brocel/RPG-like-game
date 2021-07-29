package com.brocels.rpg.game.server;

import java.io.*;
import java.net.*;

public class GameServer {

	private ServerSocket serverSocket;
	private int numberOfPlayers;
	
	public GameServer() {
		
		System.out.println("___Game Server___");
		numberOfPlayers = 0;
		try {
			serverSocket = new ServerSocket(51734);
		} catch (IOException e) {
			System.out.println("IOException from GameServer Constructor : " + e);
		}
	}
	
	public void acceptConnections() {
		try {
			System.out.println("Waiting for connections...");
			while (numberOfPlayers < 4) {
				Socket socket = serverSocket.accept();
				numberOfPlayers++;
				System.out.println("Player #" + numberOfPlayers + " has connected.");
			}
			System.out.println("We now have " + numberOfPlayers + ", no longer accepting connections.");
		} catch (IOException e) {
			System.out.println("IOException from acceptConnection method : " + e);
		}
	}
}
