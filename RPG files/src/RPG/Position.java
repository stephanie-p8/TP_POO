package RPG;

/**
 * Defini la position des objets du jeu
 * @author Stéphanie PERAFAN
 * @version 1.0
 */
public class Position {
	/**
	 * x, position sur l'axe des abscisses
	 */
	private int x;
	/**
	 * y, position sur l'axe des ordonnées
	 */
	private int y;
	
	/**
	 * Constructeur 
	 * @param x coordonée de x
	 * @param y coordonnée de y 
	 */
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Récupère x
	 * @return x coordonée de x
	 */
	public int recupX() {
		return x;
	}
	
	/**
	 * Récupère y
	 * @return y la coordonée de y
	 */
	public int recupY() {
		return y;
	}
	
	public String toString() {
		return "Position:\n x: " + x + " -y: " + y;
	}
}
