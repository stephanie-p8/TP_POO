package RPG;

/**
 * Representation d'un arc
 * @author Stephanie PERAFAN
 * @version 1.0
 *
 */
public class Arc extends Arme{
	/**
	 * Dégats de l'arc
	 */
	private static final double DEGATS = 40.0;
	/**
	 * Prix de l'arc
	 */
	private static final double PRIX = 10.5;
	
	/**
	 * Constructeur
	 */
	public Arc() {
		super(DEGATS);
	}
	
	/**
	 * Representation de l'arc sous forme d'ascii art
	 * @return representation arc
	 */
	@Override
	public String ascii_art() {
		return
		"    (  \n"+
		"     }    \n" +
		"      )   \n"+
		"##----->  \n"+
		"      )  \n"+
		"     /  \n"+
		"    (  \n";
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
	
	/**
	 * Retourne la chaine de caractere 
	 */
	public String toString() {
		return "un arc qui fait des degats de: "+ DEGATS;
	}
	

}
