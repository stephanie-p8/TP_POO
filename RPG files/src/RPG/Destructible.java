package RPG;

/**
 * Repr�sente un ennemi destructible
 * @author Stephanie PERAFAN
 * @version 1.0
 *
 */
public class Destructible {
	
	/**
	 * Poits de vie
	 */
	protected double pointsVie = 100;
	
	/**
	 * Constructeur
	 * @param pointsVie points de vie
	 */
	public Destructible(double pointsVie) {
		this.pointsVie=pointsVie;
	}
	
	/**
	 * Attaquer ennemi
	 * @param degats les d�gats
	 */
	public void hit_me(double degats) {
		pointsVie-=degats;
	}
}
