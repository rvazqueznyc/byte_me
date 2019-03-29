package byteMe.adminMode;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminLeftPanel extends JPanel {
	
	private JButton addButton, rebuildButton, removeButton, resetButton;
	private JLabel filesIndexed, versionNumber;
	
	public AdminLeftPanel() {
		
		Dimension dim = getPreferredSize();
		dim.width = 200;
		setPreferredSize(dim);
		
		addButton = new JButton("Add File...");
		rebuildButton = new JButton("Rebuild Out-of-date");
		removeButton = new JButton("Remove Selected Files");
		resetButton = new JButton("Reset Windows");
		filesIndexed = new JLabel("Number of files indexed: 1.0 ");
		versionNumber = new JLabel("Search Engine version: 1.0");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		///////////////////// FIRST ROW ////////////////////
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		add(addButton, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(rebuildButton, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_START;
		add(removeButton, gc);
		
		///////////////////// SECOND ROW ////////////////////
		gc.gridx = 0;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.LINE_START;
		add(resetButton, gc);
		
		gc.gridx = 0;
		gc.gridy = 4;
		gc.anchor = GridBagConstraints.LINE_START;
		add(filesIndexed, gc);
		
		gc.gridx = 0;
		gc.gridy = 5;
		gc.anchor = GridBagConstraints.LINE_START;
		add(versionNumber, gc);

		
		
	}

}












