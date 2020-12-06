package RPG;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Mise en place du jeu RPG
 */
public class Main {
	public static void main (String[] args) {
		Arme h = new Hache();
		Arme a = new Arc();
		System.out.println(h.toString() + "\n" + a.toString());
		
		ArrayList<Arme>armesP1 = new ArrayList<Arme>();
		armesP1.add(h);
		Sorcier c = new Sorcier("Sorcier", 3,5); 
		Position pos = new Position(4,3);
		Personnage p = new Personnage("P",armesP1,c, 2.3, 1,3,pos);
		
		System.out.println(p);
		
		Scanner scanner = new Scanner(System.in);
		Carte carte = new Carte();
		carte.positionnerPersonnage(0, 0, p);
		System.out.println(carte.voirCarte());
		
		
	}
}
