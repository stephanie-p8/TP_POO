package Tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.io.File;

import javax.swing.ImageIcon;

import org.junit.jupiter.api.Test;


import Model.Card;
import Model.Data;

/**
 * Test card methods
 * @author Stephanie PERAFAN
 *
 */
public class TestCard {
	
	Card c;
	
	/**
	 * Instantiates and initialises the card
	 */
	public TestCard() {
		c = new Card(1,"Le Bateleur");
	}
	
	/**
	 * Test method to add a descriptions
	 */
	@Test
	public void testAddDescription() {
		c.addDescription("Commencement, potentiel, outil, un homme");
		assertTrue(c.getDescription()!=null);
		
	}
	
	/**
	 * Test method to add an image
	 */
	@Test
	public void testAddImage() {
		c.addImage(new ImageIcon("images" + File.separator + Data.MYIMAGES[1]));
		assertTrue(c.getCardImage()!=null);
	}
	
	/**
	 * Test method to update a card
	 */
	@Test
	public void testUpdateCard() {
		c.updateCard(3, "La Lune");
		assertTrue(c.getCardNumber()==3);
		assertTrue(c.getCardName().equals("La Lune"));
	}
	
	/**
	 * Test method to get the card number
	 */
	@Test
	public void testGetCardNumber() {
		assertEquals(1,c.getCardNumber());
	}
	
	/**
	 * Test method to get the card name
	 */
	@Test
	public void testGetCardName() {
		assertEquals("Le Bateleur",c.getCardName());
	}

}
