package bataille;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bataille {
	public static void main (String[] args) {
		/*Creation d'un paquet de cartes*/
		
		String val [] = Carte.getValeur();
		String coul [] = Carte.getCouleur();
		ArrayList<Carte> paquetComplet = new ArrayList <Carte>();
		for(int i=0;i<val.length;i++) {
			for(int j=0;j<coul.length;j++) {
				paquetComplet.add(new Carte(i,j));
			}
		}
		
		Collections.shuffle(paquetComplet,new Random());//melange du paquet
		
		/*Distribution des cartes*/
		
		/*Joueur 1*/
		ArrayList<Carte> paquetJ1 = new ArrayList(paquetComplet.subList(0,paquetComplet.size()/2));
		Collections.shuffle(paquetJ1);
		int scoreJ1 = 0;
	
		Joueur j1 = new Joueur(paquetJ1,scoreJ1);
		System.out.println("-----------------Distribution des cartes----------------\n");
		System.out.println("Les cartes du Joueur 1 sont:\n" + paquetJ1);
		
		/*Joueur 2*/
		ArrayList<Carte> paquetJ2 = new ArrayList(paquetComplet.subList(paquetComplet.size()/2,paquetComplet.size()-1));
		Collections.shuffle(paquetJ2);
		int scoreJ2 = 0;
		
		Joueur j2 = new Joueur(paquetJ2,scoreJ2);
		System.out.println("\nLes cartes du Joueur 2 sont:\n" + paquetJ2 + "\n");
		
		/*Jeu*/
		System.out.println("---------------Toutes les manches------------------\n");
		while(paquetJ1.size()!=0 && paquetJ2.size()!=0) { //le jeu s'arrête quand un des joueurs n'a plus de cartes
			Carte carteTireeJ1 = j1.tirerUneCarte();
			Carte carteTireeJ2 = j2.tirerUneCarte();
			
			/*Comparaison des cartes*/
			if(carteTireeJ1.comparaison(carteTireeJ2)==-1) {
				scoreJ1+=2;
				j1.ajouteCarte(carteTireeJ2);
			}
			
			else if(carteTireeJ1.comparaison(carteTireeJ2)==1) {
				scoreJ2+=2;
				j2.ajouteCarte(carteTireeJ1);
			}
			
			else if((carteTireeJ1.comparaison(carteTireeJ2)==0)){
				System.out.println("Bataille");
				scoreJ1 = 0;
				scoreJ2= 0;
			}
			
			
			else {
				System.out.println("Aucune carte comparée");
				
			}
		} 
		
		/*Affichage gagnant*/
		if(scoreJ1>scoreJ2) {
			System.out.println("Le gagnant est Joueur 1 avec un score de "+ scoreJ1);
		}
		
		else {
			System.out.println("Le gagnant est Joueur 2 avec un score de "+ scoreJ2);
		}
	}
}
