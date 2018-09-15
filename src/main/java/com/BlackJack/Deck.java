package com.BlackJack;

import java.util.Random;

public class Deck {
	private int cardNumber;

	private Card[] myCards;
	private Card[] dealerCards;

	public Deck() {
		this(1, false);
	}

	public Deck(int DeckNumber, boolean shuffle) {
		this.cardNumber = DeckNumber * 52;
		this.myCards = new Card[this.cardNumber];

		int card = 0;
		for (int d = 0; d < DeckNumber; d++) {
			for (int s = 0; s < 4; s++) {
				for (int n = 1; n < 14; n++) {
					this.myCards[card] = new Card(Suits.values()[s], n);
					card = card + 1;
				}
			}
		}
		if (shuffle == true) {
			this.shuffle();
		}
	}
	
	public int getCardNumber() {
		return cardNumber;
	}

	public void shuffle() {
		Random card = new Random();

		Card theTemp;
		int k;

		for (int i = 0; i < this.cardNumber; i++) {
			k = card.nextInt(this.cardNumber);

			theTemp = this.myCards[i];
			this.myCards[i] = this.myCards[k];
			this.myCards[k] = theTemp;
		}

	}

	public Card myNextCard() {
		Card firstCard = this.myCards[0];

		for (int i = 1; i < this.cardNumber; i++) {
			this.myCards[i - 1] = this.myCards[i];
		}

		this.myCards[this.cardNumber - 1] = null;
		this.cardNumber = this.cardNumber - 1;
		return firstCard;
	}

	public void print(int num) {
		for (int card = 0; card < num; card++) {
			System.out.println((card + 1) + " " + this.cardNumber + " " + this.myCards[card].toString() + " "
					+ this.myCards[card].theCardNumber());
		}

		System.out.println(this.cardNumber - num);
	}
}
