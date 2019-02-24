package byteMe;

import java.awt.*;
import javax.swing.*;
//import javafx.event.ActionEvent;

import byteMe.searchBar.SearchPanel;
import byteMe.searchBar.SearchResults;

public class MainFrame extends JFrame {
	
	private SearchPanel searchPanel;
	private SearchResults searchResults;
	private Toolbar toolbar;
	
	public MainFrame () {
		super("Search Engine");
		setLayout(new BorderLayout());
		
		searchPanel = new SearchPanel();
		searchResults = new SearchResults();
		toolbar = new Toolbar();
		
		add(searchPanel, BorderLayout.WEST);
		add(searchResults, BorderLayout.CENTER);
		add(toolbar, BorderLayout.EAST);
		
		setSize(1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
