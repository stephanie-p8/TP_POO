package Model;

public class Main {
	public static void main(String[]args) {
		Card c = new Card(4,Data.MAJOR_MYSTERY[3]);
		System.out.println(c.toString());
		c.addDescription("Papier, cours, id�e, projet, �laboration mentale");
		System.out.println(c.toString());
	}
}
