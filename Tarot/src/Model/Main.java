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

/**
 * Execute application
 * @author Stephanie PERAFAN
 *
 */
public class Main {
	public static void main(String[]args) {
		
		try {
			Data.ReadFileImages(new File("C:\\Users\\oscar\\git\\repository\\Tarot\\myImages"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Card>myCards = new ArrayList<Card>();
		Deck myDeck = new Deck(myCards);
		Card c = null;
		
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			c = new Card(i,Data.MAJOR_MYSTERY[i]);
			myCards.add(c);
			myCards.get(i).addDescription(Data.MAJOR_MYSTERY_DESC[i]);
			//myCards.get(i).addImage(new ImageIcon("images" + File.separator + Data.MYIMAGES[i]));
			
		}
		
		myDeck.readFutur();

		
		
		/*File f = new File("C:\\Users\\oscar\\git\\repository\\Tarot\\myImages");
		System.out.println(f.exists());*/
		
		/*Gson gson = new Gson();
		
		ArrayList<Card>myCards = new ArrayList<Card>();
		Deck myDeck = new Deck(myCards);
		Card c = null;
		
		for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
			c = new Card(i,Data.MAJOR_MYSTERY[i]);
			myCards.add(c);
			myCards.get(i).addDescription(Data.MAJOR_MYSTERY_DESC[i]);
			//myCards.get(i).addImage(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
			
		}

        
        try{
        	FileWriter writer = new FileWriter("card.json");
            String answer = gson.toJson(c);
            writer.write(answer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		
		
			
		new MyFrame("Mystic Tarot");
	}
}
