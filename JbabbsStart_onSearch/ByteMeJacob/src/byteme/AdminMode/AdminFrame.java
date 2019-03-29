/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.AdminMode;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
/**
 *
 * @author jakeb
 */
@SuppressWarnings("serial")
public class AdminFrame extends JFrame{
    //commponents
    private AdminTopPanel top;
    private AdminBottomPanel bottom;
    private AdminCenterPanel middle;
   public AdminFrame() throws IOException{ 
       
       super("Admin Mode");//title of the window
      
        setLayout(new BorderLayout());
       //setting two components
       top = new AdminTopPanel();//top
       middle = new AdminCenterPanel();
       bottom = new AdminBottomPanel();
       
      add(bottom, BorderLayout.SOUTH);
       add(top, BorderLayout.NORTH);//places things in admin frame. 
       add(middle, BorderLayout.CENTER);
       
       
          //making frame size and visible
        setSize(700,700);
       setVisible(true);
   }
  
           
}
