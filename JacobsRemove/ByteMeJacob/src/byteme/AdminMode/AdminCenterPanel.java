/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.AdminMode;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author raul
 * edited by jakeb
 */
public class AdminCenterPanel extends JPanel {
    private static JTable index;

    
    @SuppressWarnings("PublicField")
	public static String Rfile;
	// every table has  a model which deals with all its rows we just set row to model and model set it to the table this is the declaration of model
	private static DefaultTableModel model;
    private static final long serialVersionUID = 1L;
	
	public AdminCenterPanel() {
		
		//Creating the JTable object and preventing editing
		index = new JTable();
		
		
		String columnNames[] = {"File Name","Status"};
		// model is initialized
		model = new DefaultTableModel();
		
		// have set columns to this model
		model.setColumnIdentifiers(columnNames);
		
		// now here we have set this model to table
		index.setModel(model);

		
		JTableHeader tHeader = index.getTableHeader();
		
		tHeader.setFont(new Font("", Font.BOLD, 14));
		
		//Setting table size
		index.setPreferredScrollableViewportSize(new Dimension(775, 325));
		index.setFillsViewportHeight(true);
                //new table mouse listener
	index.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        int sel = index.getSelectedRow();
                        if (sel<0){
                            sel = 0;
                        }
                       String ARfile= (String) index.getValueAt(sel, 0);
                        setFileRemoved(ARfile);//passing string to method
                    }
                });
               
		//Adding a scroll bar to the table
		JScrollPane indexScroll = new JScrollPane(getIndex());
		add(indexScroll);
		BufferedReader reader;
		
		
		
		
		/* here we have applied try and catch block to populate table very first time when application starts
		 * we have used try and catch block to ensure if the file we are using to store addresses of other files is missing or corrupt it will
		 * will execute  catch block and show the error
		*/
		try {
			/* here we are reading file "output.txt" in which we have stored our data about file
			 * we have passed this file to BufferedReader via FileReader to read it line by line*/
			
			reader = new BufferedReader(new FileReader(
					"Output.txt"));
			
			//  here we have the first line of file which is a file path we have stored
			String line = reader.readLine();
			
			
			// this loop will continue until it finds an empty line
			while (line != null) {
				
				// we have put path of file in this FIle variable 
				File file = new File(line);
				
				// file.exists() checks that if this file is valid or not
				if (file.exists()){
					// if it is valid we put that path and add Indexed in front of it
					model.addRow(new Object[]{line,"Indexed"});
				}
				else
				{
					// if it is not valid we put that path and add File not found! in front of it
					model.addRow(new Object[]{line,"File Not Found!"});
				}
				
				// it reads next line of file 
				line = reader.readLine();
				
			
			
			
			
			}
			// after reading that file we close it
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

        
    /**
     * @return the index
     */
    public static JTable getIndex() {
        return index;
    }

    /**
     * @param aIndex the index to set
     */
    public static void setIndex(JTable aIndex) {
        index = aIndex;
    }

    /**
     * @return the model
     */
    public static DefaultTableModel getModel() {
        return model;
    }

    /**
     * @param aModel the model to set
     */
    public static void setModel(DefaultTableModel aModel) {
        model = aModel;
    }
public static void Update(){//note that this odesnt update the date and just wipes the table. no update happens. 
    //this method is supposed to be for updating and redrawing the table. 
    model.getDataVector().removeAllElements();
		model.getDataVector().clear();
		// this method ensures that if any row is deleted it refreshes the table
		model.fireTableDataChanged();
           
}
//index clicked event to go along with remove button. 


//method returns string for file removal. 
public void setFileRemoved(String aRfile)  {
    Rfile = aRfile;
  
    
        
    }
public String GetFileRemoved(){
        return Rfile;
}
 }

