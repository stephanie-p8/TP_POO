package Tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;


import Model.Card;

public class TestCard {
	
	Card c;
	
	public TestCard() {
		c = new Card(1,"Le Bateleur");
	}

	@Test
	public void testAddDescription() {
		c.addDescription("Commencement, potentiel, outil, un homme");
		assertTrue(c.getDescription()!=null);
		
	}
	
	@Test
	public void testGetCardNumber() {
		assertEquals(1,c.getCardNumber());
	}
	
	@Test
	public void testGetCardName() {
		assertEquals("Le Bateleur",c.getCardName());
	}

}
