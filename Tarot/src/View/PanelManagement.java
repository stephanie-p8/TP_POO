package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PanelManagement extends JPanel implements ActionListener{
	
	JLabel labelExp = new JLabel("Paramétrer l'application, avec les options suivantes:");
	JCheckBox checkBoxColor = new JCheckBox("Changer la couleur de l'arrière plan");
	JCheckBox checkBoxLanguage = new JCheckBox("Changer la langue de l'application");
	JButton button = new JButton("Appliquer");
	
	public PanelManagement() {
		
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints ();
		constraint.fill = GridBagConstraints.BOTH; 
		constraint.insets = new Insets (0,0,20,10);
		
		//label
		constraint.gridx = constraint.gridy = 0;
		constraint.gridwidth = 1;
		add(labelExp,constraint);
		
		//checkbox 1
		constraint.gridy ++;
		constraint.gridx = 0;
		add(checkBoxColor,constraint);
		
		//chackbox 2
		constraint.gridy ++;
		constraint.gridx = 0;
		add(checkBoxLanguage,constraint);
		
		//button
		constraint.gridy ++;
		constraint.gridx = 0;
		constraint.gridwidth = 1;
		button.addActionListener(this);
		button.setActionCommand("Appliquer");
		add(button,constraint);
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("Appliquer")) {
			if(checkBoxColor.isSelected()) {
				Color backgroundColor = JColorChooser.showDialog(this,
			               "Choose background color", Color.white);
			            if(backgroundColor != null){
			               this.setBackground(backgroundColor);  
			               labelExp.setBackground(backgroundColor);
			               checkBoxColor.setBackground(backgroundColor);
			               checkBoxLanguage.setBackground(backgroundColor);
			               //getContentPane().setBackground(backgroundColor);
			               
			               
				}
			}
			
			else if(checkBoxLanguage.isSelected()){
				JComboBox languagesList = new JComboBox();
				String languages[] = {"Français","English"};
				
				for(int i=0;i<languages.length;i++) {
					languagesList.addItem(languages[i]);
				}
				
				int choice = JOptionPane.showOptionDialog(null,new Object[] {"Choisissez la langue:",languagesList},"Supprimer carte",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
				
				switch(choice){
				case JOptionPane.CLOSED_OPTION:
					break;
				case JOptionPane.OK_OPTION:
					//option to change language
				case JOptionPane.CANCEL_OPTION:
					break;	
				}
			}
			
		}
	}	
}
