package View;

import javax.swing.*;

import Controller.Controller;
import Model.Card;
import Model.Data;
import Model.Deck;
import Model.ReadWrite;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;


public class PanelCards extends JPanel implements ActionListener {
	
	PanelDeck deck;
	PanelForm form;
	PanelManagement pm;
	PanelDisplayCard dc;
	PanelUpdateCard uc;
	PanelSearch ps;
	
	Deck d;
	CardLayout cl = new  CardLayout ();
	
	JPanel panelHome = new JPanel();
	JLabel labelWelcome = new JLabel("Bienvenue au mystic tarot!",SwingConstants.CENTER);
	
	public PanelCards() {
		setLayout(cl);
		
		File f = new File("card.serial");
		if(f.length()==0) {
			ArrayList<Card>myCards = new ArrayList<Card>();
			Deck myDeck = new Deck(myCards);
			Card c = null;
			
			for(int i=0;i<Data.NB_MAJOR_MYSTERY;i++) {
				c = new Card(i,Data.MAJOR_MYSTERY[i]);
				myCards.add(c);
				myCards.get(i).addDescription(Data.MAJOR_MYSTERY_DESC[i]);
				myCards.get(i).addImage(new ImageIcon("images2" + File.separator + Data.IMAGES[i]));
			}
			
			ReadWrite.write(f, myDeck);
		}
		
		else {
			d = (Deck) ReadWrite.read(f);
		}
		
		form = new PanelForm(d);
		this.add(form,"f");
		
		deck = new PanelDeck();
		this.add(deck,"d");
		
		pm = new PanelManagement();
		this.add(pm,"m");
		
		dc = new PanelDisplayCard();
		this.add(dc,"dc");
		
		uc = new PanelUpdateCard(d);
		this.add(uc,"uc");
		
		ps = new PanelSearch(d);
		this.add(ps,"ps");
		
		
		Controller controller = new Controller(d,dc,form,uc,new PanelFormSearch(d));
		
		labelWelcome.setFont(new Font("Serif",Font.BOLD,30));
		labelWelcome.setForeground(Color.RED);
		panelHome.setLayout(new BorderLayout(20,20));
		
		panelHome.add(labelWelcome,BorderLayout.CENTER);
		
		this.add(panelHome,"h");
		cl.show(this,"h");
		
	}
	
	
	
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals(Data.CARD_ITEMS[0])){
			cl.show(this, "dc");
		}
		
		else if (event.getActionCommand().equals(Data.CARD_ITEMS[1])){
			cl.show(this, "f");
		}
		
		else if (event.getActionCommand().equals(Data.CARD_ITEMS[2])){
			cl.show(this, "uc");
		}
		
		else if(event.getActionCommand().equals(Data.DECK_ITEMS[0])) {
			cl.show(this,"d");
		}
		
		else if(event.getActionCommand().equals(Data.DECK_ITEMS[1])) {
			cl.show(this,"ps");
		}
		
		else if(event.getActionCommand().equals(Data.DECK_ITEMS[2])) {
			JComboBox box = new JComboBox();
			for(int i=0;i<Data.MAJOR_MYSTERY.length;i++) {
				box.addItem(Data.MAJOR_MYSTERY[i]);
			}
			int choice = JOptionPane.showOptionDialog(null,new Object[] {"Choisissez la carte à supprimer:",box},"Supprimer carte",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
			
			switch(choice){
			case JOptionPane.CLOSED_OPTION:
				break;
			case JOptionPane.OK_OPTION:
				for(int j=0;j<Data.MAJOR_MYSTERY.length;j++) {
					if(box.getSelectedIndex()==j) {
						d.removeCard(j);
					}
				}
				
				break;
			case JOptionPane.CANCEL_OPTION:
				break;	
			}
		}
		

		else if(event.getActionCommand().equals(Data.MENU[2])) {
			cl.show(this,"m");
		}
		
		
		else if(event.getActionCommand().equals(Data.MENU[3])){
			int choice= JOptionPane.showConfirmDialog(this, "Etes-vous sur de votre choix ?","Dialogue de confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
			switch(choice){
			case JOptionPane.CLOSED_OPTION:
				break;
			case JOptionPane.OK_OPTION:
				System.exit(0);
			case JOptionPane.CANCEL_OPTION:
				break;	
			}
		}
		
		
		
	}

}
