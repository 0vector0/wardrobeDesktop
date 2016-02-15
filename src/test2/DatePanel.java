package test2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class DatePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DatePanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("datePanel :)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		add(lblNewLabel);
		
	}

}
