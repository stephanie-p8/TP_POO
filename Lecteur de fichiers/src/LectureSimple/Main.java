package LectureSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Test des différentes fonctions
 * @author Stéphanie PERAFAN
 * @version 3.0
 *
 */
public class Main {
	public static void main (String[] args) throws IOException {
		File f = new File("C:/workspacePOO/Lecteur de fichiers/src/LectureSimple/test2.txt");
		File f2 = new File("C:/workspacePOO/Lecteur de fichiers/src/LectureSimple/test.txt");
		
		//Déclaration des différentes lectures
		LectureTypesFichiers lf = new LecteurFichier(f);
		LectureTypesFichiers lr = new LecteurFichierReverse(f);
		LectureTypesFichiers lp = new LecteurPalindrome(f);
		LectureTypesFichiers df = new DiffFichiers(f,f2);
		
		//Affichage des fichiers selon le mode de lecture
		System.out.println("\n---------------- Lecture de fichier normale ----------------\n");
		lf.LireFichier();
		System.out.println("\n---------------- Lecture de fichier à l'envers ----------------\n");
		lr.LireFichierReverse();
		System.out.println("\n---------------- Lecture de fichier avec phrases palindromiques ----------------\n");
		lp.LirePalindrome();
		System.out.println("\n---------------- Comparaison des différences entre fichiers ----------------\n");
		df.differencesFichiers();
	}
}
