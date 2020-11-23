package Model;

import java.util.ArrayList;

public class Main {
	public static void main(String[]args) {
		Card c = new Card(4,Data.MAJOR_MYSTERY[3]);
		System.out.println(c.toString());
		c.addDescription("Papier, cours, idée, projet, élaboration mentale");
		System.out.println(c.toString());
		
		ArrayList<Card>myCards = new ArrayList<Card>();
		Deck myDeck = new Deck(myCards);
		
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			myCards.add(new Card(i,Data.MAJOR_MYSTERY[i]));
		}
		
		//System.out.println(myDeck);
		
		myDeck.removeCard(3);
		
		System.out.println(myDeck.getDeckOfCards());
		
	}
}
