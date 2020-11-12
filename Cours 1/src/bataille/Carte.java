package bataille;

import java.awt.Color;
import java.util.Random;

/**
 * Generation d'une carte avec valeur et couleur 
 * @author Stephanie PERAFAN
 * @version 3.0
 *
 */
public class Carte {
	/**
	 * Indice pour le tableau des couleurs
	 */
	private int rangCoul;
	/**
	 * Indice pour le tableau des valeurs
	 */
	private int rangVal;
	/**
	 * Tableau static de couleurs
	 */
	private static String couleur [] = {"Pique","Coeur","Trefle","Carreau"};
	/**
	 * Tableau static de valeurs
	 */
	private static String valeur [] = {"As","1","2","3","4","5","6","7","8","9","Valet","Dame","Roi"};
	
	/**
	 * Constructeur
	 * @param val indice pour le tableau de valeurs
	 * @param coul indice pour le tableau de couleurs
	 */
	public Carte(int val,int coul) {
		this.rangCoul = coul;
		this.rangVal = val;
	}
	
	/**
	 * Comparaison de la valeur entre 2 cartes
	 * @param c la carte avec laquelle on compare la carte 
	 * @return 0 si bataille, 1 si valeur courante superieure valeur comparee, -1 si valeur courante inferieure valeur comparee
	 */
	public int comparaison(Carte c) {
		if(this.rangVal<c.rangVal) {
			return -1;
		}
		
		if(this.rangVal>c.rangVal) {
			return 1;
		}
		
		return 0;
	}
	
	/**
	 * Recupere le tableau des valeurs
	 * @return valeur le tableau des valeurs d'une carte
	 */
	public static String[] getValeur() {
		return valeur;
	}
	
	
	/**
	 * Recupere le tableau des couleurs
	 * @return couleur le tableau des couleurs d'ue carte
	 */
	public static String[] getCouleur() {
		return couleur;
	}
	
	/**
	 * Recupere l'indice du tableau des couleurs
	 * @return rangCoul indice pour les couleurs
	 */
	public int getRangCoul() {
		return rangCoul;
	}

	/**
	 * Recupere l'indice du tableau des valeurs
	 * @return rangVal indice pour les valeurs
	 */
	public int getRangVal() {
		return rangVal;
	}

	/**
	 * Chaine de caractere qui retourne les cartes une à une
	 */
	public String toString() {
		return "Le " + valeur[rangVal]+ " de "+couleur[rangCoul]+"\n";
	}
	
	
	
}
