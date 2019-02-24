/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.AdminMode;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jakeb
 */
public class AdminTopPanel extends JPanel{
    private JLabel Files;
    private JTable Index;
     private JComboBox<String> AdSub;
    private JButton Update;
     private JTextField enter;

public AdminTopPanel(){
 // UI components being constructed
       String[] columns = {"File", "Status"};
       
       String[][] data = {{"K:/testing", "Tested"},
               {"C:/killjoy", "Tested"} };
       
       Index = new JTable(data, columns){
       public boolean isCellEditable(int data , int columns){
           return false;}//sets whether or not columns are editable
       };
       //dimentions of table
       Index.setPreferredScrollableViewportSize(new Dimension(200, 200));
		Index.setFillsViewportHeight(true);
                
                Update = new JButton(new ImageIcon(getClass().getResource("refresh.png")));
       Update.setContentAreaFilled(false);//setting content area fill to be false
       enter = new JTextField(24);
       AdSub = new JComboBox<String>();
       AdSub.addItem("Add files");
       AdSub.addItem("Remove files");
       
               //the scrollpane
               
               JScrollPane IndexS = new JScrollPane(Index);
               
       Files = new JLabel("Index");
       
       setLayout(new GridBagLayout());
       GridBagConstraints c = new GridBagConstraints();
        c.weightx=.5;
        c.weighty=.5;
        c.fill= GridBagConstraints.NONE;
        c.gridx=0;
        c.gridy=0;
        add(Files, c);
        
       //second row
        c.gridx=0;
        c.gridy=5;
        c.anchor = GridBagConstraints.CENTER;
        add(IndexS, c);
        
           //bottom
        c.gridx=5;
        c.gridy=8;
        add(Update, c);//for update button
        
        c.gridx=4;
        c.gridy=8;
        add(AdSub, c); //for combobox
        
        c.gridx=3;
        c.gridy=8;
        add(enter, c);//refresh button
       
}

 } 
