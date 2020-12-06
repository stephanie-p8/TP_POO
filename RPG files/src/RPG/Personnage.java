package RPG;

import java.util.ArrayList;

/**
 * Représentation d'un personnage
 * @author Stéphanie PERAFAN
 * @version 3.0
 *
 */
public class Personnage {
	/**
	 * Nom
	 */
	private String nom;
	/**
	 * Propriétés (armes)
	 */
	private ArrayList<Arme> propriétés;
	/**
	 * Caste
	 */
	private Caste caste;
	/**
	 * Argent
	 */
	private double argent;
	/**
	 * Experience
	 */
	private int XP;
	/**
	 * Points de magie
	 */
	private int mana;
	/**
	 * Position du personnage
	 */
	private Position pos_pers;
	
	/**
	 * Constructeur
	 * @param parNom nom
	 * @param parPropriétés propriétés
	 * @param parCaste caste
	 * @param parArgent argent
	 * @param parXP expérience
	 * @param parMana points de magie
	 * @param pos_pers position du personnage
	 */
	public Personnage(String parNom, ArrayList<Arme>parPropriétés, Caste parCaste, double parArgent, int parXP, int parMana, Position pos_pers) {
		this.nom = parNom;
		this.propriétés = parPropriétés;
		this.caste = parCaste;
		this.argent = parArgent;
		this.XP = parXP;
		this.mana = parMana;
		this.pos_pers=pos_pers;
	}
	
		
	/**
	 * Le personnage choisi quelle arme utiliser
	 * @param a arme
	 * @return propriétés.get(indice) l'arme à l'indice donné
	 */
	public Arme utiliserArme(Arme a) {
		int indice = propriétés.indexOf(a);
		return propriétés.get(indice);
	}
	
	/**
	 * Le personnage achète une arme dans le magasin et 
	 * l'ajoute à sa liste de propriétés
	 * @param m le magasin d'armes
	 */
	public void acheterArme(Magasin m) {
		for(int i=0;i<m.recupArmes().size();i++) {
			if(!propriétés.contains(m.recupArmes().get(i))) {
				propriétés.add(m.recupArmes().get(i));
			}
		}
		
	}
	
	/**
	 * Le personage lance un sort
	 * @param mana points de magie
	 * @return mana -- diminution des points de magie
	 */
	public int lancerUnSort(int mana) {
		return mana --;
	}
	
	/**
	 * Déplacer le personnage vers la gauche
	 */
	public void allerAGauche() {
		int new_x = pos_pers.recupX();
		new_x--;
	}
	
	/**
	 * Déplacer le personnage vers la droite
	 */
	public void allerADroite() {
		int new_x = pos_pers.recupX();
		new_x++;
	}
	
	/**
	 * Déplacer le personnage vers le haut
	 */
	public void allerEnHaut() {
		int new_y = pos_pers.recupY();
		new_y--;
	}
	
	/**
	 * Déplacer le personnage vers le bas
	 */
	public void allerEnBas() {
		int new_y = pos_pers.recupY();
		new_y++;
	}
	
	/**
	 * Récupère la position du personage
	 * @return pos_pers la position du personnage
	 */
	public Position recupPos() {
		return pos_pers;
	}
	
	public String toString() {
		return "Je m'appelle " +nom + ", je suis de type "+caste+".\n Je possède : "+propriétés+ ".\n Mon argent est de valeur: " +argent + ".\n Mon expérience est de: "+ XP + " an et mon mana de: "+mana;
		
	}
	
	
	
}
