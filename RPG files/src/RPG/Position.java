package RPG;

/**
 * Defini la position des objets du jeu
 * @author St�phanie PERAFAN
 * @version 1.0
 */
public class Position {
	/**
	 * x, position sur l'axe des abscisses
	 */
	private int x;
	/**
	 * y, position sur l'axe des ordonn�es
	 */
	private int y;
	
	/**
	 * Constructeur 
	 * @param x coordon�e de x
	 * @param y coordonn�e de y 
	 */
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * R�cup�re x
	 * @return x coordon�e de x
	 */
	public int recupX() {
		return x;
	}
	
	/**
	 * R�cup�re y
	 * @return y la coordon�e de y
	 */
	public int recupY() {
		return y;
	}
	
	public String toString() {
		return "Position:\n x: " + x + " -y: " + y;
	}
}
