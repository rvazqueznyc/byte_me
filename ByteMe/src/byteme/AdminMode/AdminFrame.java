/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.AdminMode;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author jakeb
 */
public class AdminFrame extends JFrame{
    //commponents
    private AdminTopPanel top;
    
   public AdminFrame(){ 
       
       super("Admin Mode");//title of the window
      
        setLayout(new BorderLayout());
       //setting two components
       top = new AdminTopPanel();//top
       
       
       
      
       add(top, BorderLayout.CENTER);//places things in admin frame. 
       
       
       
          //making frame size and visible
        setSize(700,700);
       setVisible(true);
   }
  
           
}
