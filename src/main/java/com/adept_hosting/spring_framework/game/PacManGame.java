package com.adept_hosting.spring_framework.game;

public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("Move up");
	}
	
	public void down() {
		System.out.println("Move down");
	}
	
	public void left() {
		System.out.println("Move left");
	}
	
	public void right() {
		System.out.println("Move right");
	}
	
}
