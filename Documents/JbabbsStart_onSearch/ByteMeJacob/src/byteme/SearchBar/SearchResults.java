/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.SearchBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jakeb
 */
public class SearchResults extends JPanel {
    private JTextField SearchR;
    
    public SearchResults(){
        SearchR = new JTextField(100);//sets size of feild;
        SearchR.setEditable(false);//sets field to being none editable;
        setLayout (new BorderLayout());
        add(SearchR, BorderLayout.SOUTH);// adds it to the panel;
    }
}
