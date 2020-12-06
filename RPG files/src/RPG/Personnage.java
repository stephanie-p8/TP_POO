package RPG;

import java.util.ArrayList;

/**
 * Repr�sentation d'un personnage
 * @author St�phanie PERAFAN
 * @version 3.0
 *
 */
public class Personnage {
	/**
	 * Nom
	 */
	private String nom;
	/**
	 * Propri�t�s (armes)
	 */
	private ArrayList<Arme> propri�t�s;
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
	 * @param parPropri�t�s propri�t�s
	 * @param parCaste caste
	 * @param parArgent argent
	 * @param parXP exp�rience
	 * @param parMana points de magie
	 * @param pos_pers position du personnage
	 */
	public Personnage(String parNom, ArrayList<Arme>parPropri�t�s, Caste parCaste, double parArgent, int parXP, int parMana, Position pos_pers) {
		this.nom = parNom;
		this.propri�t�s = parPropri�t�s;
		this.caste = parCaste;
		this.argent = parArgent;
		this.XP = parXP;
		this.mana = parMana;
		this.pos_pers=pos_pers;
	}
	
		
	/**
	 * Le personnage choisi quelle arme utiliser
	 * @param a arme
	 * @return propri�t�s.get(indice) l'arme � l'indice donn�
	 */
	public Arme utiliserArme(Arme a) {
		int indice = propri�t�s.indexOf(a);
		return propri�t�s.get(indice);
	}
	
	/**
	 * Le personnage ach�te une arme dans le magasin et 
	 * l'ajoute � sa liste de propri�t�s
	 * @param m le magasin d'armes
	 */
	public void acheterArme(Magasin m) {
		for(int i=0;i<m.recupArmes().size();i++) {
			if(!propri�t�s.contains(m.recupArmes().get(i))) {
				propri�t�s.add(m.recupArmes().get(i));
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
	 * D�placer le personnage vers la gauche
	 */
	public void allerAGauche() {
		int new_x = pos_pers.recupX();
		new_x--;
	}
	
	/**
	 * D�placer le personnage vers la droite
	 */
	public void allerADroite() {
		int new_x = pos_pers.recupX();
		new_x++;
	}
	
	/**
	 * D�placer le personnage vers le haut
	 */
	public void allerEnHaut() {
		int new_y = pos_pers.recupY();
		new_y--;
	}
	
	/**
	 * D�placer le personnage vers le bas
	 */
	public void allerEnBas() {
		int new_y = pos_pers.recupY();
		new_y++;
	}
	
	/**
	 * R�cup�re la position du personage
	 * @return pos_pers la position du personnage
	 */
	public Position recupPos() {
		return pos_pers;
	}
	
	public String toString() {
		return "Je m'appelle " +nom + ", je suis de type "+caste+".\n Je poss�de : "+propri�t�s+ ".\n Mon argent est de valeur: " +argent + ".\n Mon exp�rience est de: "+ XP + " an et mon mana de: "+mana;
		
	}
	
	
	
}
