package com.adept_hosting.spring_framework;

import com.adept_hosting.spring_framework.game.GameRunner;
import com.adept_hosting.spring_framework.game.MarioGame;
import com.adept_hosting.spring_framework.game.SuperContraGame;
import com.adept_hosting.spring_framework.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
