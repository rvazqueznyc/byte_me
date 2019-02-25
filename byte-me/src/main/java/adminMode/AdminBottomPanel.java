/* This class creates a panel in AdminMode GUI that includes buttons to
 * add, rebuild, remove and reset. It also includes some labels.
 * */

package adminMode;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
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
