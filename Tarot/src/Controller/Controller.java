package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import View.*;
import Model.*;

/**
 * Inspect actions in buttons of view.
 * @author Stephanie Perafan
 *
 */
public class Controller implements ActionListener{
	
	Deck d;
	PanelForm form;
	PanelUpdateCard panelUpdate;
	PanelSearch panelSearch = new PanelSearch(d);
	PanelFormSearch panelFormSearch;
	File file = new File("card.serial");
	
	/**
	 * Constructor
	 * @param d deck
	 * @param form panelForm
	 * @param panelUpdate panelUpdateCard
	 * @param panelFormSearch panelFormSearch
	 */
	public Controller(Deck d,PanelForm form,PanelUpdateCard panelUpdate,PanelFormSearch panelFormSearch) {
		this.d=d;
		this.form=form;
		this.panelUpdate=panelUpdate;
		this.panelFormSearch=panelFormSearch;
		
		form.listenController(this);
		panelUpdate.listenController(this);
		panelFormSearch.listenController(this);
	
	}
	
	/**
	 * Controller listen actions from buttons
	 * @param evt event
	 */
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
		/*Button to add a card*/
		if(evt.getActionCommand().equals(Data.FORM_BUTTONS[0])) {
			int number = Integer.parseInt(form. getTextFieldNumber().getText());
			String name = form.getTextFieldName().getText();
			String desc = form.getTextAreaDesc().getText();
			JFileChooser image = form.getFileChooser();
			
			Card c = new Card(number,name);
			c.addDescription(desc);
			if(image.getSelectedFile()!=null)
				c.addImage(new ImageIcon(image.getSelectedFile().getName()));
			
			d.addCard(c);
			ReadWrite.write(file, c);
			
			form.getTextFieldNumber().setText(new String());
			form.getTextFieldName().setText(new String());
			form.getTextAreaDesc().setText(new String());
			form.getTextFieldNumber().requestFocus();
		}
		
		/*Button to choose an image*/
		else if(evt.getActionCommand().equals("Choisissez votre image")) {
			JFileChooser chooseImage = form.getFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
			chooseImage.setFileFilter(filter);
			int returnValue = chooseImage.showOpenDialog(null);
	        if (returnValue == JFileChooser.APPROVE_OPTION) {
	          File selectedFile = chooseImage.getSelectedFile();
	          form.getLabelImage().setText(selectedFile.getName());
			}
	        
	        
		}
		
		/*Button to update a card*/
		else if(evt.getActionCommand().equals(Data.FORM_BUTTONS[1])) {
			int number = Integer.parseInt(form. getTextFieldNumber().getText());
			String name = form.getTextFieldName().getText();
			
			Card c = new Card(number,name);
			c.updateCard(number, name);
			
			form.getTextFieldNumber().setText(new String());
			form.getTextFieldName().setText(new String());
			form.getTextFieldNumber().requestFocus();
			
		}
		
		/*Button to search a card*/
		else if(evt.getActionCommand().equals(Data.FORM_BUTTONS[2])) {
			int number = Integer.parseInt(panelFormSearch.getFieldNumber().getText());
			String name = panelFormSearch.getFieldName().getText();
			
			Card c = new Card(number,name);
			d.searchCard(c);
			
			panelSearch.getSearchLayout().show(panelSearch.getPanelCenter(), Data.MYIMAGES[number]);
			
			panelFormSearch.getFieldNumber().setText(new String());
			panelFormSearch.getFieldName().setText(new String());
			panelFormSearch.getFieldNumber().requestFocus();
			
			
		}
	}

}
