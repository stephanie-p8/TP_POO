package Model;

import java.io.File;

public class Data {

	/*The major mysteries*/
	public static final String [] MAJOR_MYSTERY= {"Le Mat","Le Bateleur","La Papesse","L’Impératrice","L’Empereur"
			,"Le Pape","L’Amoureux","Le Chariot","La Justice","L’Hermite","La Roue de Fortune","La Force",
			"Le Pendu","La carte sans nom","La Tempérance","Le Diable","La Maison Dieu","L’étoile","La Lune",
			"Le Soleil","Le Jugement","Le Monde"};
	
	public static final int NB_MAJOR_MYSTERY = 22;
	
	public static final String[] MAJOR_MYSTERY_DESC = {"Fin définitive, inconnu, fin de cycle, départ, fragilité.","Commencement, potentiel, outil, un homme.","Évolution secrète, silence, méditation, une femme.",
			"Papier, cours, idée, projet, élaboration mentale.","Travail, base solide, construire.","Valeurs, vœux, légalisation, orientation, rectification.",
			"Carrefour, choix, multiplicité, plaisir.","Progression, bonne nouvelle, un moyen de transport.","Ordre, loi, processus administratif, normalisation.",
			"Temps, économie, recherche, solitude.","Mouvement, opportunité, changement, voyage.","Énergie, entreprise, maitrise, réalisation.",
			"Sacrifice, contrainte, dévouement, liens.","Transformation radicale, fin, obligation de couper.","Renaissance, communication, vacances, téléphone.",
			"Passion, désir, argent, luxure.","Défi, sommet, rapidité, réussite rapide.","Amitiés, douceur, rêve, espoir, protection, lenteur.",
			"Gestation, obscurité, imagination, famille, intériorité","Chaleur, harmonie, émotion, protection, argent.","Annonce, nouvelle, réussite, libération, rapidité.",
			"Réussite totale, apothéose, finalité."};
	
	/*Images*/
	public static final File DIRECTORY = new File("images2");
	public static final String IMAGES [] = DIRECTORY.list();
	
	/*Menu*/
	public static final String MENU[] = {"Cartes","Paquet","Gestion application","Quitter"};
	public static final String CARD_ITEMS[]= {"Afficher carte","Créer nouvelle carte","Modifier carte"};
	public static final String DECK_ITEMS[]= {"Afficher paquet","Rechercher carte","Supprimer carte"};
	
	/*Buttons*/
	public static final String BUTTONS_DECK[]={"<<" ,"<",">",">>"};
	public static final String BUTTON_DISPLAY  = "Afficher";
	public static final String FORM_BUTTONS[]= {"Ajouter","Modifier","Rechercher"};
	public static final String BUTTON_MANAGEMENT = "Appliquer";
}
