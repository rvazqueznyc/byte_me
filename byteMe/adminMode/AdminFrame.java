package byteMe.adminMode;

import javax.swing.*;
import java.awt.*;

public class AdminFrame extends JFrame {
	
	private AdminTopPanel adminTopPanel;
	private AdminLeftPanel adminLeftPanel;
	private AdminRightPanel adminRightPanel;
	
	
	public AdminFrame() {
		super("Search Engine Maintenance");
		setLayout(new BorderLayout());
		
		adminTopPanel = new AdminTopPanel();
		adminLeftPanel = new AdminLeftPanel();
		adminRightPanel = new AdminRightPanel();
		
		
		add(adminTopPanel, BorderLayout.NORTH);
		add(adminLeftPanel, BorderLayout.WEST);	
		add(adminRightPanel, BorderLayout.CENTER);
		
		
		setSize(800, 450);
		setVisible(true);
	}

}
