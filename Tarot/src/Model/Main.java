package Model;

public class Main {
	public static void main(String[]args) {
		Card c = new Card(4,Data.MAJOR_MYSTERY[3]);
		System.out.println(c.toString());
		c.addDescription("Papier, cours, idée, projet, élaboration mentale");
		System.out.println(c.toString());
	}
}
