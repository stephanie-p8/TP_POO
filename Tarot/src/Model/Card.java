package Model;

import java.io.Serializable;

import javax.swing.ImageIcon;

/**
 * Create a card 
 * @author Stephanie PERAFAN
 *
 */
public class Card implements Serializable {
	private int number;
	private String name;
	private String description;
	private ImageIcon image;
	
	/**
	 * Constructor
	 * @param number card number
	 * @param name card name
	 */
	public Card(int number,String name) {
		this.number=number;
		this.name=name;
	}
	
	/**
	 * Add a description to a card
	 * @param description the description to add
	 */
	public void addDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Add an image to a card
	 * @param image the image to add
	 */
	public void addImage(ImageIcon image){
        this.image=image;
    }
	
	/**
	 * Update number and name of a card
	 * @param number new number
	 * @param name new name
	 */
	public void updateCard(int number, String name){
        this.setCardNumber(number);
        this.setCardName(name);
    }
	
	/*Getters*/
	
	/**
	 * Get card number
	 * @return number card number
	 */
	public int getCardNumber() {
		return number;
	}
	
	/**
	 * Get card name
	 * @return name card name
	 */
	public String getCardName() {
		return name;
	}
	
	/**
	 * Get card description
	 * @return description card description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Get card image
	 * @return image card image
	 */
	public ImageIcon getCardImage() {
		return image;
	}
	
	/*Setters*/
	
	/**
	 * Set card number
	 * @param number new number
	 */
	public void setCardNumber(int number){
        this.number=number;
    }
	
	/**
	 * Set card name
	 * @param name new name
	 */
    public void setCardName(String name){
        this.name=name;
    }
	
	public String toString() {
		return "My card is the " + this.number + " whose name is " + this.name + "\n (Description): " + this.description + "\n"; 
	}

}
