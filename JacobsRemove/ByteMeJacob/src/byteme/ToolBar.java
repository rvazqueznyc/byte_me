/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//this is the settings class. 
package byteme;
import byteme.AdminMode.AdminFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author jakeb
 */
public class ToolBar extends JPanel {
    private JButton about, adminMode;
    private JLabel Indexed;
    
public ToolBar(){
    ImageIcon adminIcon = new ImageIcon(getClass().getResource("gear.png"));
    
    about = new JButton("about");
    adminMode= new JButton(adminIcon);
    Indexed = new JLabel("#Indexed: ");
    
   adminMode.setContentAreaFilled(false);
 
   
    setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
        c.weightx=1;
        c.weighty=1;
        c.fill= GridBagConstraints.NONE;
        c.gridx=0;
        c.gridy=0;
        c.anchor= GridBagConstraints.WEST;
	add(about, c);//about button
        
        c.gridx=1;
        c.gridy=0;
        c.anchor=GridBagConstraints.CENTER;
        add(adminMode, c);//adminmode button
        
        c.gridx=2;
        c.gridy=0;
        c.anchor=GridBagConstraints.SOUTH;
        add(Indexed, c);//label showing how many are indexted
                
 adminMode.addActionListener(new ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent e) {
     try {
         new AdminFrame();
     } catch (IOException ex) {
         Logger.getLogger(ToolBar.class.getName()).log(Level.SEVERE, null, ex);
     }
     
			}
        });
 }


  }