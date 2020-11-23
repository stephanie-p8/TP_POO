package Tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
		/*assertNotNull(c.getDescription());
		assertEquals("Commencement, potentiel, outil, un homme",c.addDescription("Commencement, potentiel, outil, un homme"));*/
	}

}
