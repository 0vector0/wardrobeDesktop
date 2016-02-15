package wardrobe;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ViewCurrentDay extends View {

	private JButton wardrobeButton;

	/**
	 * Create the frame.
	 */
	public ViewCurrentDay() {

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

	@Override
	public void registerController(ControllerInterface controllerInterface) {

		wardrobeButton.setActionCommand("openViewProductList");
		wardrobeButton.addActionListener((ActionListener) controllerInterface);

	}
}
