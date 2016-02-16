package test3;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame0 extends JFrame {

	private JPanel contentPane;

	// public JPanel getContentPane() {
	// return contentPane;
	// }

	public void setAnoherContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
		setContentPane(contentPane);
		setVisible(true);

		JLabel lblFrame = new JLabel("Frame1");
		lblFrame.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFrame, BorderLayout.CENTER);
	}

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Frame0 frame = new Frame0();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */

	public Frame0() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);

		// Frame1 frame1 = new Frame1();
		// contentPane.add(frame1, BorderLayout.CENTER);
	}

}
