 package byteme.AdminMode;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raul
 * edited by Jacob Babb
 */



@SuppressWarnings("serial")
public class AdminBottomPanel extends JPanel {
	
	private JButton  rebuildButton, resetButton;
	private JLabel filesIndexed, versionNumber;
	
	String newline;
	public AdminBottomPanel() {
		//Setting panel size
		Dimension dim = getPreferredSize();
		dim.height = 75;
		setPreferredSize(dim);
		
		//Creating component object
		rebuildButton = new JButton("Rebuild Out-of-date");
		resetButton = new JButton("Reset Windows");
		filesIndexed = new JLabel("Number of files indexed: " /*needs reference*/);
		versionNumber = new JLabel("Search Engine version: " /*needs reference*/);
		
		
		
		
		
		
		
		
		
		
		//Setting the grid layout and positioning components
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		////////////////////FIRST ROW////////////////////
		gc.weightx = 1;
		gc.weighty = 1;
		
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(rebuildButton, gc);
		
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