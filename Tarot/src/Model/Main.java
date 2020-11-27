package Model;

import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Main {
	public static void main(String[]args) {
		
		ArrayList<Card>myCards = new ArrayList<Card>();
		Deck myDeck = new Deck(myCards);
		
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			myCards.add(new Card(i,Data.MAJOR_MYSTERY[i]));
			myCards.get(i).addDescription(Data.MAJOR_MYSTERY_DESC[i]);
			myCards.get(i).addImage(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
		}
		
		System.out.println(myDeck);
		
		myDeck.removeCard(3);
		
		//System.out.println(myDeck.getDeckOfCards());
		
		//search a card
		System.out.println(myDeck.searchCard(myCards.get(5)));
		
		//update a card
		System.out.println(myCards.get(9));
		myCards.get(9).updateCard(3, "La Nature");
		System.out.println(myCards.get(9));
		
	}
}
