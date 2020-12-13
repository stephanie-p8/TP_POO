package View;

import javax.swing.*;

import Model.Data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PanelDisplayCard extends JPanel implements ActionListener {
	
	JLabel labelCard = new JLabel("Choisissez la carte � afficher");
	JComboBox cards = new JComboBox();
	JButton btnDisplay = new JButton(Data.BUTTON_DISPLAY);
	JLabel labelSouth = new JLabel("");
	
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelSouth = new JPanel();
	
	CardLayout layout = new CardLayout();
	
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
		panelSouth.add(labelSouth);
		
		panelCenter.setLayout(layout);
		
		JLabel labels [] = new JLabel [Data.IMAGES.length];
		for (int i=0; i<Data.IMAGES.length;i++){
			labels[i] = new JLabel(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
			panelCenter.add(labels[i],Data.IMAGES[i]);
		}
		
		layout.show(panelCenter, Data.IMAGES[0]);
		labelSouth.setText(Data.MAJOR_MYSTERY_DESC[0]);
		
		
		this.add(panelNorth,BorderLayout.NORTH);
		this.add(panelCenter,BorderLayout.CENTER);
		this.add(panelSouth,BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals(Data.BUTTON_DISPLAY)) {
			for(int j=0;j<Data.MAJOR_MYSTERY.length;j++) {
				if(cards.getSelectedIndex()==j) {
					layout.show(panelCenter, Data.IMAGES[j]);
					labelSouth.setText(Data.MAJOR_MYSTERY_DESC[j]);

				}
			}
		}
		
	}

}
