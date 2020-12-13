package Tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.io.File;

import javax.swing.ImageIcon;

import org.junit.jupiter.api.Test;


import Model.Card;
import Model.Data;

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
	public void testAddImage() {
		c.addImage(new ImageIcon("images" + File.separator + Data.MYIMAGES[1]));
		assertTrue(c.getCardImage()!=null);
	}
	
	@Test
	public void testUpdateCard() {
		c.updateCard(3, "La Lune");
		assertTrue(c.getCardNumber()==3);
		assertTrue(c.getCardName().equals("La Lune"));
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
