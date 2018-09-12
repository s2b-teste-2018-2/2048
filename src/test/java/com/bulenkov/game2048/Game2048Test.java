package com.bulenkov.game2048;

import static org.junit.Assert.*;

import org.junit.Test;

public class Game2048Test {

	@Test
	public void givenGameStartsWhenGetCanMoveThenReturnsTrue() {
    	Game2048 game = new Game2048();
		assertTrue(game.canMove());		
	}

	
}