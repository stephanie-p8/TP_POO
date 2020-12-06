package RPG;

import java.util.ArrayList;

/**
 * Représentation d'un magasin d'armes
 * @author Stéphanie PERAFAN
 *
 */
public class Magasin {
	/**
	 * Liste des armes du magasin
	 */
	private ArrayList<Arme>armes;
	/**
	 * Nombre d'armes dans le magasin
	 */
	private int nbArmes = 3;
	
	/**
	 * Constructeur
	 */
	public Magasin() {
		armes = new ArrayList();
	}
	
	/**
	 * Ajoute des armes à l'inventaire du magasin
	 */
	public void ajoutArmes() {
		armes.add(new Hache());
		armes.add(new Arc());
		armes.add(new Arc());
		for(Arme a : armes) {
			System.out.println(a.ascii_art());
		}
	}
	
	/**
	 * Donne le prix de l'arme choisie 
	 * @param a une arme
	 * @return a.recupPrix() le prix de l'arme
	 */
	public double prix(Arme a) {
		return a.recupPrix();
		
	}
	
	/**
	 * Récupère le liste des armes du magasin
	 * @return armes les armes du magasin
	 */
	public ArrayList<Arme> recupArmes() {
		return armes;
	}
	
	/**
	 * Récupère le nombre d'armes du magasin
	 * @return nbArmes le nombre d'armes
	 */
	public int recupNbArmes() {
		return nbArmes;
	}
	
	/**
	 * Vérifie si une arme est dans le magasin
	 * @param a l'arme a cherché
	 * @return true si l'arme est présente false sinon
	 */
	public boolean rechercheArme(Arme a) {
		if(armes.contains(a)) {
			return true;
		}
		return false;
	}
	
	

}



