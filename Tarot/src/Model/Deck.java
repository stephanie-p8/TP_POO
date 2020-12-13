package Model;

import java.util.ArrayList;

/**
 * Create a deck of cards
 * @author Stephanie PERAFAN
 *
 */
public class Deck {

	private ArrayList<Card> deckOfCards = new ArrayList<Card>(); 
	
	/**
	 * Constructor
	 * @param deckOfCards arrayList with cards
	 */
	public Deck(ArrayList<Card>deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	
	/**
	 * Remove a card
	 * @param number number of card to remove
	 */
	public void removeCard(int number) {
		deckOfCards.remove(number);
	}
	
	/**
	 * Add a card
	 * @param c card to add
	 */
	public void addCard(Card c) {
		deckOfCards.add(c); 
	}
	
	/**
	 * Search a card with two criteria
	 * @param c card to search
	 * @return c card
	 */
	public Card searchCard(Card c){
        for(int indice=0;indice<deckOfCards.size();indice++){
            if((deckOfCards.get(indice).getCardNumber()==c.getCardNumber()) && (deckOfCards.get(indice).getCardName()==c.getCardName())){
                return c;
            }
        }
		return null;
    }
	
	/**
	 * Get arrayList of cards
	 * @return deckOfCards arrayList of cards
	 */
	public ArrayList<Card> getDeckOfCards() {
		return deckOfCards;
	}
	
	public String toString() {
		return "My deck of cards: " + this.deckOfCards + "\n";
	}
}
