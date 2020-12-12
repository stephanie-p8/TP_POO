package View;

import javax.swing.*;

import Model.Data;
import Model.Deck;

import java.awt.*;

public class PanelFormSearch extends JPanel{
	
	JLabel labelSearch = new JLabel("Veuillez saisir la carte à rechercher:");
	JLabel labelNumber = new JLabel ("Numero carte");
	JLabel labelName = new JLabel ("Nom carte");
	JTextField fieldNumber = new JTextField (10);
	JTextField fieldName = new JTextField (10);
	
	JButton btnSearch = new JButton("Rechercher");
	
	Deck d;
	
	public PanelFormSearch(Deck d) {
		setLayout(new GridBagLayout());
		this.d=d;
		
		GridBagConstraints constraint = new GridBagConstraints ();
		constraint.fill = GridBagConstraints.BOTH;
		constraint.insets = new Insets (0,0,20,10);
		
		
		//labelSearch
		constraint.gridx = 0;
		constraint.gridy = 10;
		//constraint.gridwidth = 1;
		add(labelSearch,constraint);
		
		
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
		btnSearch.setActionCommand("Rechercher");
		add(btnSearch,constraint);
	}
	
	public JTextField getFieldNumber() {
		return fieldNumber;
	}
	
	public JTextField getFieldName() {
		return fieldName;
	}
}
