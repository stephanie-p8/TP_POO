/**
 * Test Deck class
 */
package Tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Model.Card;
import Model.Data;
import Model.Deck;

/**
 * @author Stephanie PERAFAN
 *
 */
class TestDeck {
	
	ArrayList testDeck;
	Deck d;
	
	public TestDeck() {
		testDeck = new ArrayList<Card>();
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			testDeck.add(new Card(i,Data.MAJOR_MYSTERY[i]));
		}
		
		d = new Deck(testDeck);
	}

	@Test
	void testRemoveCard() {
		d.removeCard(3);
		assertEquals(21,d.getDeckOfCards().size());
	}
	
	@Test
	void testAddCard() {
		d.addCard(new Card(23,"test"));
		assertEquals(23,d.getDeckOfCards().size());
	}
	
	@Test
	public void testSearchCard() {
		assertTrue(d.searchCard((Card) testDeck.get(0))!=null);
	}
	
	@Test
	public void testGetDeckOfCards() {
		assertEquals(testDeck,d.getDeckOfCards());
	}

}
