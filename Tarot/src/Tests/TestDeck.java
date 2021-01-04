
package Tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Model.Card;
import Model.Data;
import Model.Deck;

/**
 * 
 * Test Deck class
 * @author Stephanie PERAFAN
 *
 */
class TestDeck {
	
	ArrayList testDeck;
	Deck d;
	
	/**
	 * Instantiates and initialises the deck of cards
	 */
	public TestDeck() {
		testDeck = new ArrayList<Card>();
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			testDeck.add(new Card(i,Data.MAJOR_MYSTERY[i]));
		}
		
		d = new Deck(testDeck);
	}
	
	/**
	 * Test method to remove  a card
	 */
	@Test
	void testRemoveCard() {
		d.removeCard(3);
		assertEquals(21,d.getDeckOfCards().size());
	}
	
	/**
	 * Test method to add a card
	 */
	@Test
	void testAddCard() {
		d.addCard(new Card(23,"test"));
		assertEquals(23,d.getDeckOfCards().size());
	}
	
	/**
	 * Test method to search a card
	 */
	@Test
	public void testSearchCard() {
		assertTrue(d.searchCard((Card) testDeck.get(0))!=null);
	}
	
	/**
	 * Test metod to get the deck of cards
	 */
	@Test
	public void testGetDeckOfCards() {
		assertEquals(testDeck,d.getDeckOfCards());
	}

}
