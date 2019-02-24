package byteMe;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import byteMe.adminMode.AdminFrame;

public class Toolbar extends JPanel {
	
	private JButton maintenance, about;
	private JLabel label1;
	
	public Toolbar() {
		
		maintenance = new JButton("Maintenance");
		about = new JButton("About...");
		label1 = new JLabel("Number of files indexed: ");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.CENTER;
		//gc.insets = new Insets(0, 15, 0, 0 );
		add(maintenance, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.CENTER;
		add(about, gc);
		
		
		
		maintenance.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				new AdminFrame();
			}
		});
	}

}
