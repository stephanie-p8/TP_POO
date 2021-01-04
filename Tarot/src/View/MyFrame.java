package View;

import javax.swing.*;

import Model.Data;

import java.awt.*;

/**
 * Main window managing the display of the application and his menu
 * @author Stephanie PERAFAN
 *
 */
public class MyFrame extends JFrame {
	
	private JMenuBar menuBar=new JMenuBar();
    JMenu menuCards= new JMenu(Data.MENU[0]);
    JMenu menuDeck= new JMenu(Data.MENU[1]);
    JMenu menuManagement= new JMenu(Data.MENU[2]);
    JMenu menuExit= new JMenu(Data.MENU[3]);

    JMenuItem itemCard1= new JMenuItem(Data.CARD_ITEMS[0]);
    JMenuItem itemCard2= new JMenuItem(Data.CARD_ITEMS[1]);
    JMenuItem itemCard3= new JMenuItem(Data.CARD_ITEMS[2]);

    JMenuItem itemDeck1= new JMenuItem(Data.DECK_ITEMS[0]);
    JMenuItem itemDeck2= new JMenuItem(Data.DECK_ITEMS[1]);
    JMenuItem itemDeck3= new JMenuItem(Data.DECK_ITEMS[2]);
	
    /**
     * Constructor: add a menu bar 
     * @param parTitre frame title
     */
	public MyFrame(String parTitre){ 
		   super (parTitre);
			PanelCards contentPane=new PanelCards();
			setContentPane(contentPane);
			contentPane.setBackground (new Color (255,255,255));
			setDefaultCloseOperation (EXIT_ON_CLOSE);
			setSize (900,780); 
			setVisible(true); 
			setLocation(200,300);
	        //pack();
	        
	        for(int s=0; s<Data.MENU.length; s++) {
				JMenuItem item= new JMenuItem(Data.MENU[s],Data.MENU[s].charAt(0));
				item.setAccelerator(KeyStroke.getKeyStroke(Data.MENU[s].charAt(0), java.awt.Event.CTRL_MASK));
				item.addActionListener(contentPane);
	            item.setActionCommand(Data.MENU[s]);
	            
	            if(s==0){
	                menuCards.add(itemCard1);
	                menuCards.add(itemCard2);
	                menuCards.add(itemCard3);

	                itemCard1.addActionListener(contentPane);
	                itemCard2.addActionListener(contentPane);
	                itemCard3.addActionListener(contentPane);

	                menuBar.add(menuCards);
	            }

	            else if(s==1){
	                menuDeck.add(itemDeck1);
	                menuDeck.add(itemDeck2);
	                menuDeck.add(itemDeck3);

	                itemDeck1.addActionListener(contentPane);
	                itemDeck2.addActionListener(contentPane);
	                itemDeck3.addActionListener(contentPane);

	                menuBar.add(menuDeck);
	            }

	            else 	
					menuBar.add(item);
	        } 
	        
	        this.setJMenuBar(menuBar);
	        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
	    }

	    
	    public Insets getInsets(){
			return new Insets (40,20,15,30);
			
	    }
	
	
}
