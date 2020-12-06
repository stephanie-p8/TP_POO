package RPG;

/**
 * Représente un personnage de type Sorcier
 * @author Stéphanie PERAFAN
 * @version 1.0
 */
public class Sorcier extends Caste {
	
	/**
	 * Nombre d'armes
	 */
	private int nb_armes;
	/**
	 * Force de ses armes
	 */
	private int force_arme;
	
	/**
	 * Constructeur
	 * @param type type de personnage
	 * @param nb_armes nombre d'armes
	 * @param force_arme force de ses armes
	 */
	public Sorcier(String type, int nb_armes,int force_arme) {
		super(type);
		this.nb_armes=nb_armes;
		this.force_arme= force_arme;
	}
	
	/**
	 * Récupère le nombre d'armes
	 * @return nb_armes nombre d'armes
	 */
	public int recupNbArmes() {
		return nb_armes;
	}
	
	/**
	 * Récupère la force des armes
	 * @return force_arme
	 */
	public int recupForceArmes() {
		return force_arme;
	}
	
	/**
	 * Modifier le nombre d'armes
	 * @param nouv_nb_armes nouveau nombre d'armes
	 */
	public void modNbArmes(int nouv_nb_armes) {
		this.nb_armes=nouv_nb_armes;
	}
	
	/**
	 * Modifier la forme des armes 
	 * @param nouv_force_armes nouvelle force des armes
	 */
	public void modForceArmes(int nouv_force_armes) {
		this.force_arme=nouv_force_armes;
	}
	
	public String toString() {
		return "sorcier";
	}
	
	

}
