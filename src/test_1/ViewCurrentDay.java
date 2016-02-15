package test_1;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewCurrentDay extends JFrame implements ViewInterface {

	private JPanel contentPane;
	private JButton wardrobeButton;

	// /**
	// * Launch the application.
	// */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ViewCurrentDay frame = new ViewCurrentDay();
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
	public ViewCurrentDay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel label = new JLabel("Текущий день");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.NORTH);

		JPanel panelDay = new JPanel();
		contentPane.add(panelDay, BorderLayout.CENTER);

		Date d = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
		panelDay.setLayout(new BorderLayout(0, 0));
		// System.out.println(format1.format(d));

		JLabel currentDaylabel = new JLabel(format1.format(d));
		currentDaylabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelDay.add(currentDaylabel, BorderLayout.NORTH);

		JButton dayButton = new JButton("dayButton");
		panelDay.add(dayButton);

		JPanel panelButton = new JPanel();
		contentPane.add(panelButton, BorderLayout.SOUTH);
		panelButton.setLayout(new BorderLayout(0, 0));

		JButton choiceDayButton = new JButton("Выбрать день");
		panelButton.add(choiceDayButton, BorderLayout.NORTH);

		wardrobeButton = new JButton("Гардероб");
		panelButton.add(wardrobeButton, BorderLayout.CENTER);
	}

	public void activate() {
		setVisible(true);
	}

	public void deActivate() {
		setVisible(false);
	}

	@Override
	public void registerController(ControllerInterface controllerInterface) {

		wardrobeButton.setActionCommand("openViewProductList");
		wardrobeButton.addActionListener((ActionListener) controllerInterface);
		// TODO Auto-generated method stub

	}

}
