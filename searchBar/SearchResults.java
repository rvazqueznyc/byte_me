package byteMe.searchBar;

import javax.swing.*;
import java.awt.*;

public class SearchResults extends JTextArea {
	
	private JLabel label1;
	
	public SearchResults() {
		
		Dimension dim = getPreferredSize();
		dim.width = 500;
		setPreferredSize(dim);
		
		setEditable(false);
	}

}
