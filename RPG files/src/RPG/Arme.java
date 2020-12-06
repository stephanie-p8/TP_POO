package RPG;

/**
 * Representation des armes en général
 * @author Stephanie PERAFAN
 * @version 1.0
 */
public abstract class Arme {
	/**
	 * Degats
	 */
	protected double dégats;
	/**
	 * Prix
	 */
	protected double prix;
	
	/**
	 * Constructeur
	 * @param dégats les dégats
	 */
	public Arme(double dégats) {
		this.dégats = dégats;
	}
	
	/**
	 * Representation de l'arme en ascii art
	 * @return ascii_art
	 * @see ascii_art() 
	 */
	public abstract String ascii_art();
	
	/**
	 * Recupere valeur de la variable degats
	 * @return degats les degats de l'arme
	 */
	public double recupDegats() {
		return dégats;
	}
	
	/**
	 * Recupere valeur de la variable prix
	 * @return prix le prix de l'arme
	 */
	public double recupPrix() {
		return prix;
	}
	
	
	
}
