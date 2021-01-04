package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
	 * Read futur by giving description of selected cards
	 */
	 public void readFutur(){
	        Card c [] = new Card[4];
	        Collections.shuffle(deckOfCards);
	        for(int i=0;i<4;i++){
	            System.out.println("Veuillez entrer le numero de 4 cartes (numero entre 0 et "+(deckOfCards.size()-1)+"):");
	            Scanner scanner = new Scanner(System.in);
	            int index =  scanner.nextInt();
	            if(index>-1 && index<deckOfCards.size()){
	                c[i]= deckOfCards.get(index);
	                this.removeCard(index);
	            }
	        }
	        
	        System.out.println("Vous avez choisi les cartes:\n"+c[0]+"\n"+c[1]+"\n"+c[2]+"\n"+c[3]);
	        System.out.println("Voici l'intrepretation:\n"+c[0].getDescription()+"\n"+c[1].getDescription()+"\n"+c[2].getDescription()+"\n"+c[3].getDescription());

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
