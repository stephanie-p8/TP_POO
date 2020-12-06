package RPG;

/**
 * Caste des personnages
 * @author Stephanie PERAFAN
 * @version 1.0
 */
public class Caste {
	/**
	 * Type du personnage
	 */
	private String type;
	
	/**
	 * Constructeur
	 * @param type le type du personnage
	 */
	public Caste(String type) {
		this.type=type;
	}
	
	/**
	 * Recupere type du personnage
	 * @return type le type du personnage
	 */
	public String recupererType() {
		return type;
	}
	
	

}
