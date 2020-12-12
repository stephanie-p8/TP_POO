package View;

import javax.swing.*;

import Model.Data;
import Model.Deck;

import java.awt.*;
import java.io.File;

public class PanelSearch extends JPanel {

	JPanel panelEast = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelSouth = new JPanel();
	JLabel labelSouth = new JLabel("");
	
	Deck d;
	PanelFormSearch ps;
	CardLayout cl = new CardLayout();
	
	public PanelSearch(Deck d) {
		setLayout(new BorderLayout(20,20));
		this.d=d;
		ps = new PanelFormSearch(d);
		
		panelEast.add(ps);
		panelSouth.add(labelSouth);
		panelCenter.setLayout(cl);
		
		
		JLabel labels [] = new JLabel [Data.IMAGES.length];
		panelCenter.setLayout(cl); 
		for (int i=0; i<Data.IMAGES.length;i++){
			labels[i] = new JLabel(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
			panelCenter.add(labels[i],Data.IMAGES[i]);
		}
		
		cl.show(panelCenter,Data.IMAGES[0]);
		labelSouth.setText(Data.IMAGES[0]);
		
		add(panelEast,BorderLayout.EAST);
		add(panelCenter,BorderLayout.CENTER);
		add(panelSouth,BorderLayout.SOUTH);
		
		
	}
}
