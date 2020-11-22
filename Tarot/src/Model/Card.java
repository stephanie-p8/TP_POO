package Model;

public class Card {
	private int number;
	private String name;
	
	public Card(int number,String name) {
		this.number=number;
		this.name=name;
	}
	
	public void addDescription() {
		
	}
	
	public int getCardNumber() {
		return number;
	}
	
	public String getCardName() {
		return name;
	}

}
