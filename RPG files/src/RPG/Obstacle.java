package RPG;

/**
 * Representation d'un obstacle
 * @author Stephanie PERAFAN
 * @version 2.0
 */
public class Obstacle extends Destructible{
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
	private static final double OBSTACLE_DEGATS_RATIO = 1.2;
	
	/**
	 * Constructeur
	 * @param pts points de l'obstacle
	 * @param pos position de l'obstacle
	 */
	public Obstacle(int pts, Position pos) {
		super(pts);
		this.pos = pos;
	}
	
	/**
	 * Constructeur par défaut
	 * @param pos position
	 */
	public Obstacle(Position pos) {
		super(100);
		this.pos=pos;
	}
	
	/**
	 * Récupère les points de l'obstacle 
	 * @return points les points de l'obstacle
	 */
	public double recupPoints() {
		return points;
	}
	
	/**
	 * Récupère la position de l'obstacle
	 * @return pos la position
	 */
	public Position recupObsPosition() {
		return pos;
	}
	
	/**
	 * Récupère le ratio des dégats de l'obstacle
	 * @return OBSTACLE_DEGATS_RATIO ratio des dégats de l'obstacle
	 */
	public static double recupRatio() {
		return OBSTACLE_DEGATS_RATIO;
	}
	

}
