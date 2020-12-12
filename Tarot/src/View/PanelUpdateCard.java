package View;

import javax.swing.*;

import Model.Data;
import Model.Deck;

import java.awt.*;

public class PanelUpdateCard  extends JPanel{
	
	JLabel labelCard = new JLabel("Choisissez la carte à modifier");
	JComboBox cards = new JComboBox();
	
	JLabel labelNumber = new JLabel ("Numero carte");
	JLabel labelName = new JLabel ("Nom carte");
	JTextField fieldNumber = new JTextField (10);
	JTextField fieldName = new JTextField (10);
	
	JButton btnUpdate = new JButton("Modifier");
	
	Deck d;
	
	

	public PanelUpdateCard(Deck d) {
		setLayout(new GridBagLayout());
		this.d = d;
		
		GridBagConstraints constraint = new GridBagConstraints ();
		constraint.fill = GridBagConstraints.BOTH;
		constraint.insets = new Insets (0,0,20,10);
		
		//label
		constraint.gridx = constraint.gridy = 0;
		constraint.gridwidth = 1;
		labelCard.setDisplayedMnemonic('C');
		add(labelCard,constraint);
		
		for(int i=0;i<Data.MAJOR_MYSTERY.length;i++) {
			cards.addItem(Data.MAJOR_MYSTERY[i]);
		}
		
		//comboBox
		constraint.gridy ++;
		constraint.gridx = 0;
		labelCard.setLabelFor(cards);
		add(cards,constraint);
		
		//number
		constraint.gridy ++;
		constraint.gridx = 0;
		labelNumber.setDisplayedMnemonic('N');
		add(labelNumber,constraint);
		
		constraint.gridy ++;
		constraint.gridx = 0;
		constraint.gridwidth = 5;
		labelNumber.setLabelFor(fieldNumber);
		add(fieldNumber,constraint);
		
		//name
		constraint.gridy ++;
		constraint.gridx = 0;
		labelName.setDisplayedMnemonic('o');
		add(labelName,constraint);
		
		constraint.gridy ++;
		constraint.gridx = 0;
		constraint.gridwidth = 5;
		labelName.setLabelFor(fieldName);
		add(fieldName,constraint);
		
		//button
		constraint.gridy ++;
		constraint.gridx = 0;
		//btnUpdate.addActionListener(this);
		btnUpdate.setActionCommand("Modifier");
		add(btnUpdate,constraint);
		
	}
	
	public JTextField getFieldNumber() {
		return fieldNumber;
	}
	
	public JTextField getFieldName() {
		return fieldName;
	}

}
