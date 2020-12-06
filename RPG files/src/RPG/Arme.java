package RPG;

/**
 * Representation des armes en g�n�ral
 * @author Stephanie PERAFAN
 * @version 1.0
 */
public abstract class Arme {
	/**
	 * Degats
	 */
	protected double d�gats;
	/**
	 * Prix
	 */
	protected double prix;
	
	/**
	 * Constructeur
	 * @param d�gats les d�gats
	 */
	public Arme(double d�gats) {
		this.d�gats = d�gats;
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
		return d�gats;
	}
	
	/**
	 * Recupere valeur de la variable prix
	 * @return prix le prix de l'arme
	 */
	public double recupPrix() {
		return prix;
	}
	
	
	
}
