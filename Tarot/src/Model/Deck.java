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
	
	public void addCard(Card c) {
		deckOfCards.add(c); 
	}
	
	public Card searchCard(Card c){
        for(int indice=0;indice<deckOfCards.size();indice++){
            if((deckOfCards.get(indice).getCardNumber()==c.getCardNumber()) && (deckOfCards.get(indice).getCardName()==c.getCardName())){
                return c;
            }
        }
		return null;
    }
	
	public ArrayList<Card> getDeckOfCards() {
		return deckOfCards;
	}
	
	public String toString() {
		return "My deck of cards: " + this.deckOfCards + "\n";
	}
}
