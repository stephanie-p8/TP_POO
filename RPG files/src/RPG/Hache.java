package RPG;

/**
 * Representation d'une hache
 * @author Stephanie PERAFAN
 * @version 1.0
 *
 */
public class Hache extends Arme {
	/**
	 * Dégats de la hache
	 */
	private static final double DEGATS = 50; 
	/**
	 * Prix de la hache
	 */
	private static final double PRIX = 20.0;
	
	/**
	 * Constructeur
	 */
	public Hache() {
		super(DEGATS);
	}
	
	/**
	 * Representation de la hache sous forme d'ascii art
	 * @return representation hache
	 */
	@Override
	public String ascii_art() {
		return 
		"-------"+
		"|       )"+		
		"-------"+
		"|"+
		"|"+
		"|";
	}
	
	/**
	 * Attaquer un ennemi
	 * @param d le destructible à attaquer
	 */
	public void attaquer(Destructible d) {
		if(d instanceof Monstre) {
			d.hit_me(DEGATS*Monstre.recupRatio());
		}
		
		if(d instanceof Obstacle) {
			d.hit_me(DEGATS*Obstacle.recupRatio());
		}
		
	}
	
	
	public String toString() {
		return "une hache qui fait des degats de: "+ DEGATS;
	}

}
