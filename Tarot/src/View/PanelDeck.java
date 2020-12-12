package View;

import javax.swing.*;

import Model.Data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PanelDeck extends JPanel implements ActionListener {
	
	JPanel southPanel = new JPanel();
	JLabel labSouth = new JLabel(Data.IMAGES[0]);

	
	CardLayout layout = new CardLayout();
	JPanel centerPanel = new JPanel();
	private int imagesIndex =0;
	
	public PanelDeck() {
		setLayout (new BorderLayout (20,20));
		
		
		JButton buttons[] = new JButton [Data.BUTTONS_DECK.length];
		for (int i=0; i<Data.BUTTONS_DECK.length;i++){
			buttons[i] = new JButton (Data.BUTTONS_DECK[i]);
			buttons[i].addActionListener(this);
			buttons[i].setActionCommand(Data.BUTTONS_DECK[i]);
			southPanel.add(buttons[i],Data.BUTTONS_DECK[i]);	
		}
		
		southPanel.add(labSouth);
		
		JLabel labels [] = new JLabel [Data.IMAGES.length];
		centerPanel.setLayout(layout); 
		for (int i=0; i<Data.IMAGES.length;i++){
			labels[i] = new JLabel(new ImageIcon("images" + File.separator + Data.IMAGES[i]));
			centerPanel.add(labels[i],Data.IMAGES[i]);
		}
		
		layout.show(centerPanel, Data.IMAGES[0]);
		imagesIndex = 0;
		labSouth.setText(Data.IMAGES[0]);
		
		
		add(southPanel,BorderLayout.SOUTH);
		add(centerPanel,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent parEvt){

		if (parEvt.getActionCommand().equals(Data.BUTTONS_DECK[0])) {
			layout.first(centerPanel);
			imagesIndex = 0;
			labSouth.setText(Data.IMAGES[imagesIndex]);
		}
		
		
		else if (parEvt.getActionCommand().equals(Data.BUTTONS_DECK[1])){
			layout.previous(centerPanel);
			imagesIndex--;
			if (imagesIndex < 0) 
				imagesIndex = Data.IMAGES.length - 1; 
			labSouth.setText(Data.IMAGES[imagesIndex]);
			
		}
		
		else if (parEvt.getActionCommand().equals(Data.BUTTONS_DECK[2])){
			layout.next(centerPanel);
			imagesIndex++;
			if (imagesIndex > Data.IMAGES.length - 1) 
				imagesIndex = 0; 
			labSouth.setText(Data.IMAGES[imagesIndex]);
		}
		
		else if (parEvt.getActionCommand().equals(Data.BUTTONS_DECK[3])){
			layout.last(centerPanel);
			imagesIndex = 21;
			labSouth.setText(Data.IMAGES[imagesIndex]); //pour modifier l'etiquette
			
			
		}
	}


}
