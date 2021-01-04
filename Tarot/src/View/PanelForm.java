package View;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import Controller.Controller;
import Model.Data;
import Model.Deck;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Form to complete in order to add a new card
 * @author Stephanie PERAFAN
 *
 */
public class PanelForm extends JPanel implements ActionListener{
	
	JLabel labelNumber = new JLabel ("Numero carte");
	JLabel labelName = new JLabel ("Nom carte");
	JLabel labelDescription = new JLabel ("Description");
	JLabel labelImage = new JLabel ("Image");
	JLabel labelImageName = new JLabel("");
	
	JButton buttonImage = new JButton("Choisissez votre image");
	JButton btn = new JButton(Data.FORM_BUTTONS[0]);
	
	
	
	JTextField fieldNumber = new JTextField (10);
	JTextField fieldName = new JTextField (10);
	JTextArea areaDesc = new JTextArea(20,20);
	JFileChooser chooseImage = new JFileChooser();
	
	File selectedFile;
	
	Deck d;
	
	/**
	 * Constructor: set layout and add components
	 * @param d deck
	 */
	public PanelForm(Deck d) {
		
		setLayout(new GridBagLayout());
		this.d = d;
		GridBagConstraints constraint = new GridBagConstraints ();
		constraint.fill = GridBagConstraints.BOTH;
		constraint.insets = new Insets (0,0,20,10);
		
				
		//number
		constraint.gridx = constraint.gridy = 0;
		constraint.gridwidth = 1;
		labelNumber.setDisplayedMnemonic('N');
		add (labelNumber,constraint);
				
		constraint.gridx ++;
		constraint.gridwidth = 5;
		labelNumber.setLabelFor(fieldNumber);
		add (fieldNumber,constraint);
				
		//Name 
		constraint.gridy ++;
		constraint.gridx = 0;
		labelName.setDisplayedMnemonic('o');
		add (labelName,constraint);
				
		constraint.gridx ++;
		constraint.gridwidth = 5;
		labelName.setLabelFor(fieldName);
		add (fieldName,constraint);
			
		//description
		constraint.gridy ++;
		constraint.gridx = 0;
		labelDescription.setDisplayedMnemonic('D');
		add (labelDescription,constraint);
			
		constraint.gridx ++;
		constraint.gridwidth = 5;
		constraint.gridheight =5;
		labelDescription.setLabelFor(areaDesc);
		add (areaDesc,constraint);
			
		//Image
		constraint.gridy +=7;
		constraint.gridx = 0;
		labelImage.setDisplayedMnemonic('I');
		add (labelImage,constraint);
		
		constraint.gridx++;
		constraint.gridwidth = 1;
		labelImage.setLabelFor(buttonImage);
		buttonImage.addActionListener(this);
		buttonImage.setActionCommand("Choisissez votre image");
		add(buttonImage,constraint);
		
		constraint.gridx++;
		constraint.gridwidth = 1;
		add(labelImageName,constraint);
		
		//button
		constraint.gridy +=5;
		constraint.gridx = 0;
		constraint.gridwidth = 1;
		add (btn,constraint);
		btn.setActionCommand(Data.FORM_BUTTONS[0]); 
		
	}
	
	/**
	 * Get number text field
	 * @return fieldNumber number text field
	 */
	public JTextField getTextFieldNumber() {
		return fieldNumber;
	}
	
	/**
	 * Get name text field
	 * @return fieldName name text field
	 */
	public JTextField getTextFieldName() {
		return fieldName;
	}
	
	/**
	 * Get description text area
	 * @return areaDesc description text area
	 */
	public JTextArea getTextAreaDesc() {
		return areaDesc;
	}
	
	/**
	 * Get file chooser
	 * @return chooseImage file chooser
	 */
	public JFileChooser getFileChooser() {
		return chooseImage;
	}
	
	/**
	 * Get label for image name
	 * @return labelImageName label for image name
	 */
	public JLabel getLabelImage() {
		return labelImageName;
	}

	/**
	 * Choose image in a file chooser by clicking in button
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Choisissez votre image")) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
			chooseImage.setFileFilter(filter);
			int returnValue = chooseImage.showOpenDialog(null);
	        if (returnValue == JFileChooser.APPROVE_OPTION) {
	          selectedFile = chooseImage.getSelectedFile();
	          labelImageName.setText(selectedFile.getName());
			}
	        
	        
		}
		
	}
	
	/**
	 * Give to controller the control of buttons
	 * @param c controller
	 */
	public void listenController(Controller c) {
		btn.addActionListener(c);
		buttonImage.addActionListener(c);
	}
}
