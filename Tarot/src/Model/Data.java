package Model;

import java.io.File;

public class Data {

	/*The major mysteries*/
	public static final String [] MAJOR_MYSTERY= {"Le Mat","Le Bateleur","La Papesse","L�Imp�ratrice","L�Empereur"
			,"Le Pape","L�Amoureux","Le Chariot","La Justice","L�Hermite","La Roue de Fortune","La Force",
			"Le Pendu","La carte sans nom","La Temp�rance","Le Diable","La Maison Dieu","L��toile","La Lune",
			"Le Soleil","Le Jugement","Le Monde"};
	
	public static final int NB_MAJOR_MYSTERY = 22;
	
	public static final String[] MAJOR_MYSTERY_DESC = {"Fin d�finitive, inconnu, fin de cycle, d�part, fragilit�.","Commencement, potentiel, outil, un homme.","�volution secr�te, silence, m�ditation, une femme.",
			"Papier, cours, id�e, projet, �laboration mentale.","Travail, base solide, construire.","Valeurs, v�ux, l�galisation, orientation, rectification.",
			"Carrefour, choix, multiplicit�, plaisir.","Progression, bonne nouvelle, un moyen de transport.","Ordre, loi, processus administratif, normalisation.",
			"Temps, �conomie, recherche, solitude.","Mouvement, opportunit�, changement, voyage.","�nergie, entreprise, maitrise, r�alisation.",
			"Sacrifice, contrainte, d�vouement, liens.","Transformation radicale, fin, obligation de couper.","Renaissance, communication, vacances, t�l�phone.",
			"Passion, d�sir, argent, luxure.","D�fi, sommet, rapidit�, r�ussite rapide.","Amiti�s, douceur, r�ve, espoir, protection, lenteur.",
			"Gestation, obscurit�, imagination, famille, int�riorit�","Chaleur, harmonie, �motion, protection, argent.","Annonce, nouvelle, r�ussite, lib�ration, rapidit�.",
			"R�ussite totale, apoth�ose, finalit�."};
	
	/*Images*/
	public static final File DIRECTORY = new File("images2");
	public static final String IMAGES [] = DIRECTORY.list();
	
	/*Menu*/
	public static final String MENU[] = {"Cartes","Paquet","Gestion application","Quitter"};
	public static final String CARD_ITEMS[]= {"Afficher carte","Cr�er nouvelle carte","Modifier carte"};
	public static final String DECK_ITEMS[]= {"Afficher paquet","Rechercher carte","Supprimer carte"};
	
	/*Buttons*/
	public static final String BUTTONS_DECK[]={"<<" ,"<",">",">>"};
	public static final String BUTTON_DISPLAY  = "Afficher";
	public static final String FORM_BUTTONS[]= {"Ajouter","Modifier","Rechercher"};
	public static final String BUTTON_MANAGEMENT = "Appliquer";
}
