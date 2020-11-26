package Model;

import javax.swing.ImageIcon;

public class Card {
	private int number;
	private String name;
	private String description;
	private ImageIcon image;
	
	public Card(int number,String name) {
		this.number=number;
		this.name=name;
	}
	
	public void addDescription(String description) {
		this.description = description;
	}
	
	public void addImage(ImageIcon image){
        this.image=image;
    }
	
	public void updateCard(int number, String name){
        this.setCardNumber(number);
        this.setCardName(name);
    }
	
	public int getCardNumber() {
		return number;
	}
	
	public String getCardName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setCardNumber(int number){
        this.number=number;
    }

    public void setCardName(String name){
        this.name=name;
    }
	
	public String toString() {
		return "My card is the " + this.number + " whose name is " + this.name + "\n (Description): " + this.description + "\n"; 
	}

}
