/* This class creates a panel in AdminMode GUI that includes buttons to
 * add, rebuild, remove and reset. It also includes some labels.
 * */

package adminMode;

import adminMode.AdminCenterPanel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminBottomPanel extends JPanel {
	
	private JButton addButton, rebuildButton, removeButton, resetButton;
	private JLabel filesIndexed, versionNumber;
	
	public AdminBottomPanel() {
		//Setting panel size
		Dimension dim = getPreferredSize();
		dim.height = 75;
		setPreferredSize(dim);
		
		//Creating component objects
		addButton = new JButton("Add File...");
		rebuildButton = new JButton("Rebuild Out-of-date");
		removeButton = new JButton("Remove Selected Files");
		resetButton = new JButton("Reset Windows");
		filesIndexed = new JLabel("Number of files indexed: " /*needs reference*/);
		versionNumber = new JLabel("Search Engine version: " /*needs reference*/);
		
		
		//remove button action
        removeButton.addActionListener(new ActionListener() 
		
		{
		public void actionPerformed(ActionEvent arg0) 
		{
			if(AdminCenterPanel.index.getSelectedRow()==-1)
			{
				JOptionPane.showMessageDialog(null, "Select a row");
			}
			else
			{
				BufferedReader reader;
				try {
					reader = new BufferedReader(new FileReader(
							"output.txt"));
					String line = reader.readLine();
					 newline = null;
					
					 int i=0;
					while (line != null) {
						
						if(!line.equals(AdminCenterPanel.index.getValueAt(AdminCenterPanel.index.getSelectedRow(), 0)))
						{
							if(i==0)
							{
								newline=line;
								i=1;
							}
							else
							{
						newline=newline+"\n"+line;
						
							}
							}
						
						
						
						//System.out.println(line);
						// read next line
						line = reader.readLine();
					
					}
					System.out.println("......................................................................................");
					System.out.println(newline);
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				
			System.out.println(AdminCenterPanel.index.getValueAt(AdminCenterPanel.index.getSelectedRow(), 0));
			
			
			   FileWriter fw;
			try {
				fw = new FileWriter("output.txt");
				   // read character wise from string and write  
		        // into FileWriter  
		       fw.write(newline+"\n");
		  
		        System.out.println("Writing successful"); 
		        //close the file  
		        fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			   
		     
			
		/*	
			try(FileWriter fw = new FileWriter("output.txt", true);
				    BufferedWriter bw = new BufferedWriter(fw);
				    PrintWriter out = new PrintWriter(bw))
				{
				    
				    out.print(newline);
				    
				  
				} catch (IOException e) {
				    //exception handling left as an exercise for the reader
				}*/
		
			
			
			AdminCenterPanel.model.removeRow(AdminCenterPanel.index.getSelectedRow());
			
			
			
			}
			
			
		}});
		
		// add button action listener 
		addButton.addActionListener(new ActionListener() 
		
		{
		public void actionPerformed(ActionEvent arg0) 
		{
			
		// here is frame in which select file window opens
		Component frame = null;
		
		//  opens the select window 
		if(filechoose.showSaveDialog(frame)==JFileChooser.APPROVE_OPTION);
		
		// it picks the file path we choose
		File f=	filechoose.getSelectedFile();

		
		
		// Here we check that the file we have picked up is already stored or not
		
		
		int test=0;
		
		// reading all lines of output.txt files and match them with the file we have selected 
           BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(
					"output.txt"));
			String line = reader.readLine();
			
			
			
			while (line != null) {
				// if file is there set test variable value to 1
				if(line.equals(f.getAbsolutePath()))
				{
				
					test=1;
				}
				
				
				// read next line
				line = reader.readLine();
			
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		// if test is equal to 1 means file is already in table we don't need to rewrite it
		
		if(test==1)
		{// Show pop up window that already inserted
			JOptionPane.showMessageDialog(frame, "Already Inserted");
		}
		else
		{
			// else just write the file path to the output.txt
		
			
			// here is a try and catch block for the output.txt file
// try to open this file
			try(FileWriter fw = new FileWriter("output.txt", true);
			   // Pass this file writer to butter writer
				BufferedWriter bw = new BufferedWriter(fw);
			    // then pass this buffer writer to PrintWriter so we can write in the file line by line
					PrintWriter out = new PrintWriter(bw))
			{
				// this will write in the file the path of our selected file
			    out.println(f.getAbsolutePath());
			   
			    // Here we are adding this file path as row to the model of table so it show up in table 
			    AdminCenterPanel.model.addRow(new Object[]{f.getAbsolutePath(),"Indexed"});
			   
			  
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
				// this will show pop up about file not found
				JOptionPane.showMessageDialog(frame, "File Not Found");
			}
		  }
		}});
		
		//Setting the grid layout and positioning components
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		////////////////////FIRST ROW////////////////////
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.CENTER;
		add(addButton, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(rebuildButton, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(removeButton, gc);
		
		///////////////////SECOND ROW///////////////////
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.CENTER;
		add(resetButton, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.CENTER;
		add(filesIndexed, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.CENTER;
		add(versionNumber, gc);
		
	}
}
