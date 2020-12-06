package View;

import javax.swing.*;

import Model.Data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDisplayCard extends JPanel implements ActionListener {
	
	JLabel labelCard = new JLabel("Choisissez la carte à afficher");
	JComboBox cards = new JComboBox();
	JButton btnDisplay = new JButton("Afficher");
	
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
		btnDisplay.addActionListener(this);
		btnDisplay.setActionCommand("Afficher");
		panelNorth.add(btnDisplay);
		
		
		this.add(panelNorth,BorderLayout.NORTH);
		this.add(panelCenter,BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Afficher")) {
			for(int j=0;j<Data.MAJOR_MYSTERY.length;j++) {
				if(cards.getSelectedIndex()==j) {
					JLabel label = new JLabel(new ImageIcon(Data.IMAGES[j]));
					panelCenter.add(label);
					//this.add(panelCenter,BorderLayout.CENTER);
				}
			}
		}
		
	}

}
