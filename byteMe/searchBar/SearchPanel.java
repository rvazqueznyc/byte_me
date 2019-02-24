package byteMe.searchBar;

import javax.swing.*;
import java.awt.*;

public class SearchPanel extends JPanel {
	
	private JLabel searchEngine, searchTerms;
	private JTextField keyWords;
	private JButton searchButton;
	private JRadioButton allTerms, anyTerm, exactMatch;
	
	public SearchPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 300;
		setPreferredSize(dim);
		
		searchEngine = new JLabel("Search Engine");
		searchTerms = new JLabel("Search Terms: ");
		keyWords = new JTextField(15);
		searchButton = new JButton("Search");
		allTerms = new JRadioButton("All of the Search Terms");
		anyTerm = new JRadioButton("Any of the Search Terms");
		exactMatch = new JRadioButton("Exact Phrase");
		
		searchEngine.setFont(searchEngine.getFont().deriveFont(20f));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(5, 0, 0, 0);
		add(searchEngine, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(searchTerms, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(keyWords, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_START;
		add(searchButton, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.LINE_START;
		add(allTerms, gc);
		
		gc.gridx = 1;
		gc.gridy = 4;
		gc.anchor = GridBagConstraints.LINE_START;
		add(anyTerm, gc);
		
		gc.gridx = 1;
		gc.gridy = 5;
		gc.anchor = GridBagConstraints.LINE_START;
		add(exactMatch, gc);
		
		
		
	}

}
