package RPG;

/**
 * Représente un ennemi destructible
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
	 * @param degats les dégats
	 */
	public void hit_me(double degats) {
		pointsVie-=degats;
	}
}
