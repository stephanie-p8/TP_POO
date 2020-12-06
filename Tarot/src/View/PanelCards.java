package View;

import javax.swing.*;

import Model.Data;
import Model.Deck;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelCards extends JPanel implements ActionListener {
	
	PanelDeck deck;
	PanelForm form;
	PanelManagement pm;
	PanelDisplayCard dc;
	Deck d;
	CardLayout cl = new  CardLayout ();
	
	JPanel panelHome = new JPanel();
	JLabel labelWelcome = new JLabel("Bienvenue au mystic tarot!",SwingConstants.CENTER);
	
	public PanelCards() {
		setLayout(cl);
		
		form = new PanelForm(d);
		this.add(form,"f");
		
		deck = new PanelDeck();
		this.add(deck,"d");
		
		pm = new PanelManagement();
		this.add(pm,"m");
		
		dc = new PanelDisplayCard();
		this.add(dc,"dc");
		
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
		
		else if(event.getActionCommand().equals(Data.DECK_ITEMS[0])) {
			cl.show(this,"d");
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
