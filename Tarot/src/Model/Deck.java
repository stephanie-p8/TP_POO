package Model;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deckOfCards = new ArrayList<Card>(); 
	
	public Deck(ArrayList<Card>deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	
	public void removeCard(int number) {
		deckOfCards.remove(number);
	}
	
	public ArrayList<Card> getDeckOfCards() {
		return deckOfCards;
	}
	
	public String toString() {
		return "My deck of cards: " + this.deckOfCards + "\n";
	}
}
