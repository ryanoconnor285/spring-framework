package com.adept_hosting.spring_framework;

import com.adept_hosting.spring_framework.game.GameRunner;
import com.adept_hosting.spring_framework.game.MarioGame;
import com.adept_hosting.spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var game = new MarioGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
