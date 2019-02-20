/* This class creates a panel in the SearchBar GUI that includes
 * search bar, search button and radio buttons.
 * */

package searchBar;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BarTopPanel extends JPanel {
	
	//Search panel components
	private JLabel searchEngine, searchTerms;
	private JTextField keyWords;
	private JButton searchButton;
	private JRadioButton allTerms, anyTerm, exactMatch;
	
	public BarTopPanel() {
		Dimension dim = getPreferredSize();
		dim.height = 140;
		setPreferredSize(dim);
		
		//Creating all component objects
		searchEngine = new JLabel("Search Engine");
		searchTerms = new JLabel("Search Terms: ");
		keyWords = new JTextField(45); 
		searchButton = new JButton("Search");
		allTerms = new JRadioButton("All of the Search Terms");
		anyTerm = new JRadioButton("Any of the Search Terms");
		exactMatch = new JRadioButton("Exact Phrase");
		
		searchEngine.setFont(searchEngine.getFont().deriveFont(24f));
		
		//Creating a grid layout for the components in the search panel
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		/////////////////FIRST ROW/////////////////
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(5, 0, 0, 0);
		add(searchEngine, gc);
		
		/////////////////SECOND ROW/////////////////	
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		add(searchTerms, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.CENTER;
		add(keyWords, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(searchButton, gc);
		
		/////////////////THIRD ROW/////////////////		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 50, 0, 0);
		add(allTerms, gc);
		
		/////////////////FOURTH ROW/////////////////	
		gc.gridx = 1;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 50, 0, 0);
		add(anyTerm, gc);
		
		/////////////////FIFTH ROW/////////////////	
		gc.gridx = 1;
		gc.gridy = 4;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 50, 0, 0);
		add(exactMatch, gc);
	}
}
