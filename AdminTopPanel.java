/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.AdminMode;
//current goals include designing the API and ability to check if the previously
//indexed files still exist or have been modified. 

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author jakeb
 */
@SuppressWarnings("serial")
public class AdminTopPanel extends JPanel{

    private final JButton Update;
    private final JButton add;
    private final JButton sub;
    private final JFileChooser filechoose;
    
public AdminTopPanel(){
     
 
      

                
       Update = new JButton(new ImageIcon(getClass().getResource("refresh.png")));
       Update.setContentAreaFilled(false);//setting content area fill to be false
       add = new JButton("add");
       sub = new JButton("Remove");
       filechoose = new JFileChooser("Add");
               
    
       //placing commponents
       setLayout(new GridBagLayout());
       GridBagConstraints c = new GridBagConstraints();
      
        
      
        
           //first opetion
        c.gridx=5;
        c.gridy=8;
        add(Update, c);//for update button
        
        c.gridx=4;
        c.gridy=8;
        add(sub, c); //for combobox
        
        c.gridx=3;
        c.gridy=8;
        add(add, c);//refresh button
        
        
        
        //add action listeners.
        //add button action listener(Uses lamda expression)
       add.addActionListener((java.awt.event.ActionEvent arg0) -> {
          Component frame = null;
           
           if (filechoose.showSaveDialog(null)==JFileChooser.APPROVE_OPTION);//opens frame.
           File f = filechoose.getSelectedFile();//varable for file being chosen
          
           int test =0;// variable to test if the file already exists
          BufferedReader read;
           try {
               read = new BufferedReader(new FileReader("Output.txt"));
               String line = read.readLine();
               while (line !=null){
                   if (line.equals(f.getAbsolutePath())){
                       test = 1;
                   }
                    line = read.readLine();
                    
               }
               read.close();
           } catch (IOException e){
               
           }
          if(test==1)
                    {// Show pop up window that already inserted
                        JOptionPane.showMessageDialog(frame, "Already Inserted");
                    }
                    else
                    {
                        // else just write the file path to the output.txt
                        
                        
                        // here is a try and catch block for the output.txt file
                        
                           // try to open this file
                        try(FileWriter fw = new FileWriter("Output.txt", true);
                                // Pass this file writer to butter writer
                                BufferedWriter bw = new BufferedWriter(fw);
                                // then pass this buffer writer to PrintWriter so we can write in the file line by line
                                PrintWriter out = new PrintWriter(bw))
                        {
                            // this will write in the file the path of our selected file
                            out.println(f.getAbsolutePath());
                            
                            // Here we are adding this file path as row to the model of table so it show up in table
                            AdminCenterPanel.getModel().addRow(new Object[]{f.getAbsolutePath(),"Indexed"});
                            
                            
                        } catch (IOException e) {
                            //exception handling left as an exercise for the reader
                            // this will show pop up about file not found
                            JOptionPane.showMessageDialog(frame, "File Not Found");
                        }
               
                    }
         
                    
           
       });
       sub.addActionListener(new ActionListener(){
@Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    //the try statement for clearing the index used for removal of files from the index. 
    try {
        new ClearF(); //calls the clearF class
    } catch (IOException ex) {
        Logger.getLogger(AdminTopPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    
}
       }
        );
 Update.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed (java.awt.event.ActionEvent e){
      AdminCenterPanel.getIndex();
      AdminCenterPanel.Update();
        
           
     }
 }
     );
 }      
}



