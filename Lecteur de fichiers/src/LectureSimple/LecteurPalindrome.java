package LectureSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * lecture de fichier avec phrases palindromiques
 * @author Stéphanie PERAFAN
 * @version 1.0
 *
 */
public class LecteurPalindrome extends LectureTypesFichiers {
	/**
	 * Constructeur
	 * @param file File
	 */
	public LecteurPalindrome(File file) {
		super(file);
	}
	
	/**
	 * Verifie qu'une ligne est un palindrome
	 * @param ligne la ligne verifiee
	 * @return true si la ligne est un palindrome, false sinon
	 */
	public static boolean estPalindrome(String ligne) {
		ligne = ligne.replaceAll("\\s+", "").toLowerCase();
		StringBuilder ligneInverse = new StringBuilder(ligne);
		ligneInverse = ligneInverse.reverse();
		return (ligneInverse.toString().equals(ligne));
		
	}
}
