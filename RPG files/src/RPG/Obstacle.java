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
	 * D�gats
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
	 * Constructeur par d�faut
	 * @param pos position
	 */
	public Obstacle(Position pos) {
		super(100);
		this.pos=pos;
	}
	
	/**
	 * R�cup�re les points de l'obstacle 
	 * @return points les points de l'obstacle
	 */
	public double recupPoints() {
		return points;
	}
	
	/**
	 * R�cup�re la position de l'obstacle
	 * @return pos la position
	 */
	public Position recupObsPosition() {
		return pos;
	}
	
	/**
	 * R�cup�re le ratio des d�gats de l'obstacle
	 * @return OBSTACLE_DEGATS_RATIO ratio des d�gats de l'obstacle
	 */
	public static double recupRatio() {
		return OBSTACLE_DEGATS_RATIO;
	}
	

}
