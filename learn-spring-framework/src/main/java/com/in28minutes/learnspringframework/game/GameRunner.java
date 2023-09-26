package com.in28minutes.learnspringframework.game;

public class GameRunner {

	private GamingConsole game;
	
	public GameRunner(GamingConsole superContraGame) {
		this.game = superContraGame;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
}
