package View;

import javax.swing.*;

import Model.Data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Application management
 * @author oscar
 *
 */
public class PanelManagement extends JPanel implements ActionListener{
	
	JLabel labelExp = new JLabel("Paramétrer l'application, avec les options suivantes:");
	JCheckBox checkBoxColor = new JCheckBox("Changer la couleur de l'arrière plan");
	JCheckBox checkBoxLanguage = new JCheckBox("Changer la police de l'application");
	JButton button = new JButton(Data.BUTTON_MANAGEMENT);
	
	/**
	 * Constructor: set layout and add components
	 */
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
		
		//checkbox 2
		constraint.gridy ++;
		constraint.gridx = 0;
		add(checkBoxLanguage,constraint);
		
		//button
		constraint.gridy ++;
		constraint.gridx = 0;
		constraint.gridwidth = 1;
		button.addActionListener(this);
		button.setActionCommand(Data.BUTTON_MANAGEMENT);
		add(button,constraint);
		
	}

	/**
	 * Add options to manage application by clicking in the button
	 */
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals(Data.BUTTON_MANAGEMENT)) {
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
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				JComboBox fontList = new JComboBox();
				String font[] = ge.getAvailableFontFamilyNames();
				
				for(int i=0;i<font.length;i++) {
					fontList.addItem(font[i]);
				}
				
				int choice = JOptionPane.showOptionDialog(null,new Object[] {"Choisissez la police:",fontList},"Changez la police",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
				
				switch(choice){
				case JOptionPane.CLOSED_OPTION:
					break;
				case JOptionPane.OK_OPTION:
					for(int j=0;j<font.length;j++) {
						if(fontList.getSelectedIndex()==j) {
							UIDefaults defaults = UIManager.getDefaults();
							Font myfont = new Font(font[j],Font.PLAIN,14);
							java.util.Enumeration<?> keys = defaults.keys();
							while (keys.hasMoreElements()) {
								Object key = keys.nextElement();
								Object value = UIManager.get(key);
								if (value instanceof javax.swing.plaf.FontUIResource)
									defaults.put(key, myfont);
							}
						}
					}	
				case JOptionPane.CANCEL_OPTION:
					break;	
				}
			}
			
		}
	}	
}
