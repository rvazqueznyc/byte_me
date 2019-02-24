/*
 * This class opens up the main window and contains it settings
 */


package byteme;
import byteme.SearchBar.SearchResults;
import byteme.SearchBar.SearchPanel;
import java.awt.BorderLayout; //layout manager

import javax.swing.JLabel;
//java panel imports
import javax.swing.JFrame;
/**
 *
 * @author jakeb
 */
public class MainFrame extends JFrame{
    //classes that make up the diffent parts
    private ToolBar settings; //toolbar
    private SearchPanel searchBar;  //search bar
    private SearchResults searchResults;  //and results   
    private JLabel ByteMe;
   public MainFrame() {
       
       super("ByteMeSearch");
       
 
       setLayout(new BorderLayout());
       //components
           ByteMe = new JLabel("Welcome to ByteMe.com");
           settings = new ToolBar();
           searchBar = new SearchPanel();
           searchResults = new SearchResults();
           
           ///layout
           add(ByteMe, BorderLayout.WEST);//places everything on screen
           add(settings, BorderLayout.PAGE_END);
           add(searchBar, BorderLayout.PAGE_START);
           add(searchResults, BorderLayout.CENTER);
      
        //setting the size of the frame and the frame close command
       setSize(600,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
        
   }
           
    
}
