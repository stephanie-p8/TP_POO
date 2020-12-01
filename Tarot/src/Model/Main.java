package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Main {
	public static void main(String[]args) {
		try {
			ArrayList<Card>myCards = new ArrayList<Card>();
			Deck myDeck = new Deck(myCards);
			Card c = null;
			
			for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
				c = new Card(i,Data.MAJOR_MYSTERY[i]);
				myCards.add(c);
				myCards.get(i).addDescription(Data.MAJOR_MYSTERY_DESC[i]);
				myCards.get(i).addImage(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
				
				System.out.println("Création de: " + c + "\n");
			}
			
			// ouverture d'un flux de sortie vers le fichier "personne.serial"
	        FileOutputStream fos = new FileOutputStream("card.serial");
	
	        // création d'un "flux objet" avec le flux fichier
	        ObjectOutputStream oos= new ObjectOutputStream(fos);
	
	        try {
	            // sérialisation : écriture de l'objet dans le flux de sortie
	            oos.writeObject(c); 
	            // on vide le tampon
	            oos.flush();
	            System.out.println(c + " a ete serialise");
	        } 
	            finally {
	            //fermeture des flux
	                try {
	                    oos.close();
	                } finally {
	                    fos.close();
	                }
	            }  
		}
		catch(IOException ioe) {
            ioe.printStackTrace();
        }
		
		/*
		System.out.println(myDeck);
		
		myDeck.removeCard(3);
		
		//System.out.println(myDeck.getDeckOfCards());
		
		//search a card
		System.out.println(myDeck.searchCard(myCards.get(5)));
		
		//update a card
		System.out.println(myCards.get(9));
		myCards.get(9).updateCard(3, "La Nature");
		System.out.println(myCards.get(9));*/
		
	}
}
