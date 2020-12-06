package RPG;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.table.TableModel;
/**
 * Representation de la carte de mouvement du joueur
 * @author Stephanie PERAFAN
 * @version 2.0
 *
 */
public class Carte implements KeyListener {
	
	/**
	 * Lignes
	 */
	private static final int NB_LIGNES = 20;
	/**
	 * Colonnes
	 */
	private static final int NB_COL = 20;
	/**
	 * Tableau des  positions
	 */
	private Position[][]positions;
	/**
	 * Personnage
	 */
	private Personnage personnage;
	/**
	 * Taille de la carte
	 */
	private int taille;
	/**
	 * Valeur random
	 */
	private static Random random = new Random(System.currentTimeMillis());
	/**
	 * Liste des monstres 
	 */
	private ArrayList<Monstre> mons = new ArrayList<Monstre>();
	/**
	 * Liste des obstacles
	 */
	private ArrayList<Obstacle> obs = new ArrayList<Obstacle>();
	/**
	 * Une tables
	 */
	public TableModel model;
	
	/**
	 * Constructeur
	 * @param positions tableau des positions
	 * @param personnage le personnage
	 * @param taille la taille de la carte
	 */
	public Carte(Position[][]positions,Personnage personnage,int taille) {
		this.positions=positions;
		this.personnage=personnage;
		this.taille=taille;
	}
	
	/**
	 * Constructeur par défaut permettant de remplir la carte
	 * et de positionner aléatoirement des monstres et des obstacles
	 */
	public Carte() {
		positions = new Position[NB_LIGNES][NB_COL];
		for (int i = 0; i < NB_LIGNES; i++) {
			for (int j = 0; j < NB_COL; j++) {
				positions[i][j] = null;
			}
		}
		
		//On place des monstres et des obstacles aléatoirement
		int l = random.nextInt(NB_LIGNES);
		int c = random.nextInt(NB_COL);
		//positions[l][c] = new Monstre(0,new Position(l,c));
		mons.add(new Monstre(positions[l][c]));
		while (positions[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_LIGNES);
		}
		
		//positions[l][c] = new Obstacle(new Position(l,c));
		obs.add(new Obstacle(positions[l][c]));
		while (positions[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_LIGNES);
		}

		//positions[l][c] = new Monstre(new Position(l,c));
		obs.add(new Obstacle(positions[l][c]));
		while (positions[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_LIGNES);
		}
	}
	
	/**
	 * Recupere l'emplacement de ligne l et de colonne c
	 * @param l ligne
	 * @param c colonne
	 * @return positions[l][c] tableau de position donnée
	 */
	public Position recupEmplacement(int l, int c) {
		return positions[l][c];
	}
	
	/**
	 * Modifie un emplacement
	 * @param l ligne
	 * @param c colonne
	 * @param elt nouvel element
	 */
	public void modEmplacement(int l, int c, Object elt) {
		this.positions[l][c]=(Position) elt;
	}
	
	/**
	 * Recupere la carte des positions
	 * @return positions la carte des positions
	 */
	public Position[][] voirCarte() {
		return positions;
	}
	
	/**
	 * Possitionne le personnage sur la carte
	 * @param l ligne
	 * @param c colonne
	 * @param p personnage
	 */
	public void positionnerPersonnage(int l, int c, Personnage p) {
		if (l > 0 && l < NB_LIGNES || c > 0 && c < NB_COL) {
			if(this.recupEmplacement(l, c) == null) {
				this.modEmplacement(l, c, p);
			}
		}
	}
	
	
	/**
	 * Deplacement du personnage
	 * @param p personnage
	 */
	public void bougerPersonnage(Personnage p) {
		int ligne = p.recupPos().recupX();
		int col = p.recupPos().recupY();
		this.positionnerPersonnage(ligne, col, p);
		model.setValueAt(p, ligne, col);
	}
	
	
	
	/**
	 * Retire le personnage personnage de sa position
	 * @param p personnage
	 */
	public void enleverPersonnage(Personnage p) {
		int ligne = p.recupPos().recupX();
		int col = p.recupPos().recupY();
		this.modEmplacement(ligne, col, null);
		model.setValueAt(null, p.recupPos().recupX(), p.recupPos().recupY());
	}
	
	/**
	 * Retire le monstre de sa position
	 * @param mon monstre
	 */
	public void enleverMostre(Monstre mon) {
		int ligne = mon.recupMonstrePos().recupX();
		int col = mon.recupMonstrePos().recupY();
		this.modEmplacement(ligne, col, null);
		model.setValueAt(null, mon.recupMonstrePos().recupX(), mon.recupMonstrePos().recupY());
		
	}
	
	/**
	 * Retire l'obstacle de sa position
	 * @param obs obstacle
	 */
	public void enleverObstacle(Obstacle obs) {
		int ligne = obs.recupObsPosition().recupX();
		int col = obs.recupObsPosition().recupY();
		this.modEmplacement(ligne, col, null);
		model.setValueAt(null, obs.recupObsPosition().recupX(), obs.recupObsPosition().recupY());
		
	}
	
	/**
	 * Déplacement du personnage en fonction de la touche pressée
	 */
	@Override
	public void keyPressed(KeyEvent key) {
		// TODO Auto-generated method stub
		int codeTouche = key.getKeyCode();
        
        switch (codeTouche) // Les valeurs sont contenue dans KeyEvent. Elles commencent par VK_ et finissent par le nom de la touche
        {
            case KeyEvent.VK_UP: // si la touche enfoncée est celle du haut
                personnage.allerEnHaut();
                break;
            case KeyEvent.VK_LEFT: // si la touche enfoncée est celle de gauche
            	personnage.allerAGauche();
                break;
            case KeyEvent.VK_RIGHT: // si la touche enfoncée est celle de droite
            	personnage.allerADroite();
                break;
            case KeyEvent.VK_DOWN: // si la touche enfoncée est celle du bas
            	personnage.allerEnBas();
                break;
        }
		
	}

	@Override
	public void keyReleased(KeyEvent key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent key) {
		// TODO Auto-generated method stub
		
	}
}
