package View;

import javax.swing.*;

import Model.Data;

import java.awt.*;

public class PanelDisplayCard extends JPanel {
	
	JLabel labelCard = new JLabel("Choisissez la carte à afficher");
	JComboBox cards = new JComboBox() ;
	
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelSouth = new JPanel();
	
	public PanelDisplayCard() {
		setLayout(new BorderLayout(20,20));
		
		for(int i=0;i<Data.MAJOR_MYSTERY.length;i++) {
			cards.addItem(Data.MAJOR_MYSTERY[i]);
		}
		
		panelNorth.add(labelCard);
		panelNorth.add(cards);
		
		this.add(panelNorth,BorderLayout.NORTH);
		
		for(int j=0;j<Data.MAJOR_MYSTERY.length;j++) 
		if(cards.getSelectedIndex()==j) {
			
		}
		
	}

}
