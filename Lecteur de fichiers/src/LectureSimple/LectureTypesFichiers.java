package LectureSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.TreeSet;

/**
 * Classe abstraite qui défini complétement le méthodes des 
 * différents types de lecture de fichiers
 * @author Stéphanie PERAFAN
 * @version 1.0
 *
 */
public abstract class LectureTypesFichiers implements Lecture {
	/**
	 * Fichier 1
	 */
	private File file;
	/**
	 * Fichier 2
	 */
	private File file2;
	
	/**
	 * Constructeur pour la lecture d'un fichier
	 * @param fichier File
	 */
	public LectureTypesFichiers(File fichier) {
		this.file = fichier;
	}
	
	/**
	 * Constructeur pour la differenciation des fichiers
	 * @param fichier1 le premier fichier
	 * @param fichier2 le deuxieme fichier
	 */
	public LectureTypesFichiers(File fichier1, File fichier2) {
		this.file = fichier1;
		this.file2 = fichier2;
	}
	
	/**
	 * Lecture d'un fichier ligne par ligne et affichage
	 * @throws IOException exception
	 */
	public void LireFichier() throws IOException {
		BufferedReader br = null;
		try {
			if(file.exists()) {
				br = new BufferedReader(new FileReader(file));
				String ligneLue = "";
				while((ligneLue = br.readLine())!=null) {
					System.out.println(ligneLue+"\n");
				}
			}
		}
		
		catch(IOException ioE){
			   ioE.printStackTrace();
		}
		finally {
			if(br!= null) {
				br.close();
			}
		}
	}
	
	/**
	 * Lecture d'un fichier ligne par ligne, à l'envers et affichage des lignes
	 * @throws IOException exception
	 */
	public void LireFichierReverse() throws IOException {
		BufferedReader br = null;
		try {
			if(file.exists()) {
				br = new BufferedReader(new FileReader(file));
				String ligneLue = "";
				while((ligneLue = br.readLine())!=null) {
					StringBuilder ligne = new StringBuilder(ligneLue);
					ligne = ligne.reverse();
					System.out.println(ligne+"\n");
				}
			}
		}
		
		catch(IOException ioE){
			   ioE.printStackTrace();
			}
		finally {
			if(br!= null) {
				br.close();
			}
		}
	}
	
	/**
	 * Lecture d'un fichier ligne par ligne et affichage des lignes palindromiques
	 * @throws IOException exception
	 */
	public void LirePalindrome() throws IOException {
		BufferedReader br = null;
		try {
			if(file.exists()) {
				br = new BufferedReader(new FileReader(file));
				String ligneLue = "";
				while((ligneLue = br.readLine())!=null) {
					if(LecteurPalindrome.estPalindrome(ligneLue)) {
						System.out.println(ligneLue+"\n");
					}
					
				}
			}
		}
		
		catch(IOException ioE){
			   ioE.printStackTrace();
		}
		
		finally {
			if(br!= null) {
				br.close();
			}
		}
	}
	
	/**
	 * Affichage des differences de fichiers
	 * @throws IOException exception
	 */
	public void differencesFichiers() throws IOException {
		ArrayList<String>mesLignes = new ArrayList<String>();
		BufferedReader br = null;
		String ligneLue ="";
		try {
			if(file.exists()) {
				br = new BufferedReader(new FileReader(file));
				while((ligneLue = br.readLine())!=null) {
					mesLignes.add(ligneLue);
				} 
			}
			
			if(file2.exists()) {
				br = new BufferedReader(new FileReader(file2));
				String ligneLue2 = "";
				while((ligneLue2 = br.readLine())!=null) {
					if(!(mesLignes.contains(ligneLue2))) {
						System.out.println(ligneLue2+"\n");
					}
					
				}
			}
		}
		
		catch(IOException ioE){
			   ioE.printStackTrace();
		}
		
		finally {
			if(br!= null) {
				br.close();
			}
		}
		
	}
	
	
}
