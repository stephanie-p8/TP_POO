package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import View.*;
import Model.*;

public class Controller implements ActionListener{

	Deck d;
	PanelDisplayCard panelDisplay;
	PanelForm form;
	PanelUpdateCard panelUpdate;
	PanelSearch panelSearch = new PanelSearch(d);
	PanelFormSearch panelFormSearch;
	File file;
	
	public Controller(Deck d,PanelDisplayCard panelDisplay,PanelForm form,PanelUpdateCard panelUpdate,PanelFormSearch panelFormSearch) {
		this.d=d;
		this.panelDisplay=panelDisplay;
		this.form=form;
		this.panelUpdate=panelUpdate;
		this.panelFormSearch=panelFormSearch;
		
		form.listenController(this);
		panelUpdate.listenController(this);
		panelFormSearch.listenController(this);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
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
		}
		
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
		
		else if(evt.getActionCommand().equals(Data.FORM_BUTTONS[1])) {
			int number = Integer.parseInt(form. getTextFieldNumber().getText());
			String name = form.getTextFieldName().getText();
			
			Card c = new Card(number,name);
			c.updateCard(number, name);
			
		}
		
		else if(evt.getActionCommand().equals(Data.FORM_BUTTONS[2])) {
			int number = Integer.parseInt(panelFormSearch.getFieldNumber().getText());
			String name = panelFormSearch.getFieldName().getText();
			
			Card c = new Card(number,name);
			d.searchCard(c);
			
			panelSearch.getSearchLayout().show(panelSearch.getPanelCenter(), Data.IMAGES[number]);
			
			
		}
	}

}
