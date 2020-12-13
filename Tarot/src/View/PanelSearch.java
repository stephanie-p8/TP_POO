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
		
		
		JLabel labels [] = new JLabel [Data.MYIMAGES.length];
		panelCenter.setLayout(cl); 
		for (int i=0; i<Data.MYIMAGES.length;i++){
			labels[i] = new JLabel(new ImageIcon("images" + File.separator + Data.MYIMAGES[i]));
			panelCenter.add(labels[i],Data.MYIMAGES[i]);
		}
		
		cl.show(panelCenter,Data.MYIMAGES[0]);
		labelSouth.setText(Data.MAJOR_MYSTERY_DESC[0]);
		
		add(panelEast,BorderLayout.EAST);
		add(panelCenter,BorderLayout.CENTER);
		add(panelSouth,BorderLayout.SOUTH);
		
		
	}
	
	public CardLayout getSearchLayout() {
		return cl;
	}
	
	public JPanel getPanelCenter() {
		return panelCenter;
	}
}
