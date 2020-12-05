package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import com.google.gson.*;

import View.MyFrame;

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
			
			//opening an output stream to the file "personne.serial".
	        FileOutputStream fos = new FileOutputStream("card.serial");
	
	        // creation of an "object flow" with the file flow
	        ObjectOutputStream oos= new ObjectOutputStream(fos);
	
	        try {
	            // serialization: writing the object to the output stream
	            oos.writeObject(c); 
	            // the buffer is emptied
	            oos.flush();
	            System.out.println(c + " a ete serialise");
	        } 
	            finally {
	            //flow closure
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
		
		/*Gson gson = new Gson();
		
		ArrayList<Card>myCards = new ArrayList<Card>();
		Deck myDeck = new Deck(myCards);
		Card c = null;
		
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			c = new Card(i,Data.MAJOR_MYSTERY[i]);
			myCards.add(c);
			myCards.get(i).addDescription(Data.MAJOR_MYSTERY_DESC[i]);
			myCards.get(i).addImage(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
			
		}

        
        try (FileWriter writer = new FileWriter("card.json")) {
            gson.toJson(c, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		
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
		
			
		new MyFrame("Tarot");
	}
}
