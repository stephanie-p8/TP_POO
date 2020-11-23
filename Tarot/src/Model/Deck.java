package Model;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deckOfCards = new ArrayList<Card>(); 
	
	public Deck(ArrayList<Card>deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	
	public void removeCard(Card c) {
		deckOfCards.remove(c);
	}
}
