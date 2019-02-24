package byteMe.adminMode;

import java.awt.*;

import javax.swing.*;

public class AdminTopPanel extends JPanel {
	
	private JLabel title;
	
	public AdminTopPanel() {
		
		Dimension dim = getPreferredSize();
		dim.height = 50;
		setPreferredSize(dim);
		
		title = new JLabel("Search Engine - Maintenance");
		
		title.setFont(title.getFont().deriveFont(24f));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 1;
		gc.gridy = 0;
		
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.CENTER;
		add(title, gc);
	}
}
