package View;

import javax.swing.*;

import Controller.Controller;
import Model.Data;
import Model.Deck;

import java.awt.*;

/**
 * Form to complete in order to search a card 
 * @author oscar
 *
 */
public class PanelFormSearch extends JPanel{
	
	JLabel labelSearch = new JLabel("Veuillez saisir la carte à rechercher:");
	JLabel labelNumber = new JLabel ("Numero carte");
	JLabel labelName = new JLabel ("Nom carte");
	JTextField fieldNumber = new JTextField (10);
	JTextField fieldName = new JTextField (10);
	
	JButton btnSearch = new JButton(Data.FORM_BUTTONS[2]);
	
	Deck d;
	
	/**
	 * Constructor: set layout and add components
	 * @param d deck
	 */
	public PanelFormSearch(Deck d) {
		
		setLayout(new GridBagLayout());
		this.d=d;
		
		GridBagConstraints constraint = new GridBagConstraints ();
		constraint.fill = GridBagConstraints.BOTH;
		constraint.insets = new Insets (0,0,20,10);
		
		
		//labelSearch
		constraint.gridx = 0;
		constraint.gridy = 10;
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
		btnSearch.setActionCommand(Data.FORM_BUTTONS[2]);
		add(btnSearch,constraint);
	}
	
	/**
	 * Get number text field
	 * @return fieldNumber number text field
	 */
	public JTextField getFieldNumber() {
		return fieldNumber;
	}
	
	/**
	 * Get name text field
	 * @return fieldName name text field
	 */
	public JTextField getFieldName() {
		return fieldName;
	}
	
	/**
	 * Give to controller the control of buttons
	 * @param c controller
	 */
	public void listenController(Controller c) {
		btnSearch.addActionListener(c);
	}
}
