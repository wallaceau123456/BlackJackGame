package com.BlackJack;


import org.junit.Assert;
import org.junit.Test;


public class DeckTest {

	@Test
	public void testIs52() {
		Deck deck = new Deck();
		int numOfCards = deck.getCardNumber();
		Assert.assertEquals("Incorrect number of cards", 52, numOfCards);
	}

}
