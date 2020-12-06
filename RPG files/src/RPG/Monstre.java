package RPG;

/**
 * Représentation d'un monstre
 * @author Stéphanie PERAFAN
 * @version 2.0
 */
public class Monstre extends Destructible {
	/**
	 * Points
	 */
	private double points;
	/**
	 * Position
	 */
	private Position pos;
	/**
	 * Dégats
	 */
	private static final double MONSTRE_DEGATS_RATIO = 0.8;
	
	/**
	 * Constructeur
	 * @param points les points du monstre
	 * @param pos la position du monstre
	 */
	public Monstre(double points,Position pos) {
		super(points);
		this.pos=pos;
	}
	
	/**
	 * Constructeur par défaut
	 * @param pos position
	 */
	public Monstre(Position pos) {
		super(100);
		this.pos=pos;
	}
	
	/**
	 * Diminuer les points du monstre
	 * @return points-- la diminution des points
	 */
	public double diminuerPoints() {
		return points --;
	}
	
	/**
	 * Récupère le nombre de points
	 * @return points les points
	 */
	public double recupPoints() {
		return points;
	}
	
	/**
	 * Récupère la position du monstre
	 * @return pos la position
	 */
	public Position recupMonstrePos() {
		return pos;
	}
	
	/**
	 * Récupère le ratio des dégats du monstre
	 * @return MONSTRE_DEGATS_RATIO le ratio des dégats
	 */
	public static double recupRatio() {
		return MONSTRE_DEGATS_RATIO;
	}
	
	public String toString() {
		return "Le monstre possede "+points;
	}

}
