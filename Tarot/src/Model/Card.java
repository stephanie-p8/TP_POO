package Model;

public class Card {
	private int number;
	private String name;
	private String description;
	
	public Card(int number,String name) {
		this.number=number;
		this.name=name;
	}
	
	public void addDescription(String description) {
		this.description = description;
	}
	
	public int getCardNumber() {
		return number;
	}
	
	public String getCardName() {
		return name;
	}
	
	public String toString() {
		return "My card is the " + this.number + " whose name is " + this.name + "\n (Description): " + this.description; 
	}

}
