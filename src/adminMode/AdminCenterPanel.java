/* This class creates a table with two columns that displays the index in AdminMode GUI.
 * Index includes file location and status.
 * */

package adminMode;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminCenterPanel extends JPanel {
	
	private JTable index;
	
	public AdminCenterPanel() {
		String[] columns = {"File Name", "Status"};
		
		String[][] data = {{"C:/", "Test"},
				{"C:/2", "Test2"}/*needs reference*/};
		
		//Creating the JTable object and preventing editing
		index = new JTable(data, columns) {
			public boolean isCellEditable(int data, int columns) {
				return false;
			}
		};
		
		//Setting table size
		index.setPreferredScrollableViewportSize(new Dimension(775, 325));
		index.setFillsViewportHeight(true);
		
		//Adding a scroll bar to the table
		JScrollPane indexScroll = new JScrollPane(index);
		add(indexScroll);
	}
}
