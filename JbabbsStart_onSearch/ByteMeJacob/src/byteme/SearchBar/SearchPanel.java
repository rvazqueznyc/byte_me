/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.SearchBar;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
/**
 *
 * @author jakeb
 */
@SuppressWarnings("serial")
public class SearchPanel extends JPanel{
   public static String key;
    private JTextField searchbar;
   private JButton Search;
   private JComboBox<String> SearchOpt;//adds combo box
   
   public SearchPanel(){
       //components declarations
       searchbar = new JTextField(10);
       
        Search = new JButton (new ImageIcon(getClass().getResource("MagnifyingGlass.jpg")));
         Search.setContentAreaFilled(false);
        SearchOpt = new JComboBox<>();//combobox intinized with options
       SearchOpt.addItem("Phrase"); 
       SearchOpt.addItem("All Terms");
       SearchOpt.addItem("Any Terms");
      
       //adding components. 
       setLayout(new GridBagLayout());
          GridBagConstraints c = new GridBagConstraints();
        c.weightx=0;
        c.weighty=0;
        c.fill= GridBagConstraints.NONE;
        c.gridx=0;
        c.gridy=5;
        add(SearchOpt, c);
        
        c.gridx=1;
        c.gridy=5;
        c.anchor=GridBagConstraints.CENTER;
        add(searchbar, c);
        
        c.gridx=3;
        c.gridy=5;
        c.anchor=GridBagConstraints.SOUTH;
        add(Search, c);
        
        //action listener for the search button that interacts with the search bar
         Search.addActionListener(new ActionListener() {
     public void actionPerformed (java.awt.event.ActionEvent e){
      if (e.getSource()==Search){
          String Search = searchbar.getText();//gets the string 
         SetSearch(Search);
          new SearchBar();//starts a new search bar)where i have placed the bool search
      }
       
           
     }
 }
     );
   }
   
   //sets the keyword
   public void SetSearch(String Search){
      
       key = Search;
       
   }
   //gets the keyword
   public String getSearch(){
      
       return key;//returns the keyword
   }
}
