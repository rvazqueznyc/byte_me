package byteMe.adminMode;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminRightPanel extends JPanel {
	
	private JTable index;
	
	public AdminRightPanel() {
		String[] columns = {"File Name", "Status"};
		
		String[][] data = {{"File1", "Test1"}, 
				{"File2", "Test2"}};
		
		index = new JTable(data, columns) {
			public boolean isCellEditable(int data, int columns) {
				return false;
			}
		};
		
		index.setPreferredScrollableViewportSize(new Dimension(500, 325));
		index.setFillsViewportHeight(true);
		
		JScrollPane indexScroll = new JScrollPane(index);
		add(indexScroll);
	}

}
