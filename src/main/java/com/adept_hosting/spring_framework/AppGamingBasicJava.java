package com.adept_hosting.spring_framework;

import com.adept_hosting.spring_framework.game.GameRunner;
import com.adept_hosting.spring_framework.game.MarioGame;
import com.adept_hosting.spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
