package bataille;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Création d'un joueur avec sa pile de cartes et son score
 * @author Stephanie PERAFAN
 * @version 3.0
 *
 */
public class Joueur {
	
	/**
	 * Liste des cartes
	 */
	private ArrayList<Carte> cartes = new ArrayList <Carte>();
	/**
	 * Score 
	 */
	private int cpt = 0;
	
	/**
	 * Constructeur
	 * @param cartes liste des cartes
	 * @param cpt score du joueur
	 */
	public Joueur(ArrayList<Carte>cartes, int cpt) {
		this.cartes = cartes;
		this.cpt = cpt;
	}
	
	/**
	 * On tire une carte de la fin du paquet
	 * @return la derniere carte
	 */
	public Carte tirerUneCarte() {
		if(cartes.size()>0) {
			return cartes.remove(cartes.size()-1);
		}
		return null;
	}
	
	/**
	 * Ajout d'une carte au paquet du joueur
	 * @param carte une nouvelle carte
	 * @return cartes la liste des cartes avec la nouvelle carte ajoutee
	 */
	public ArrayList<Carte> ajouteCarte(Carte carte) {
		cartes.add(carte);
		return cartes;
	}

	/**
	 * Recupere la liste des cartes
	 * @return cartes la liste des cartes
	 */
	public ArrayList<Carte> getCartes() {
		return cartes;
	}
	
	
}
