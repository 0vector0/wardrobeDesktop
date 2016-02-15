package test2;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class View {
	private JFrame frame = new JFrame("MVC");
	private JPanel panel = new JPanel();
	// private JButton button = new JButton("Жми!");
	private JLabel label = new JLabel("Ждем информацию!");
	private JButton buttonRead = new JButton("Read");
	private JButton buttonPrint = new JButton("Print!");

	public View() {
		// panel.add(button);
		panel.add(label);
		frame.add(panel);
		panel.add(buttonRead);
		panel.add(buttonPrint);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 300, 300, 300);
	}

	public void setText(ArrayList<String> data) {
		// Выводим информацию в View...
		String forPrint = "";
		for (String cur : data) {
			forPrint += cur;
		}
		label.setText(forPrint);
	}

	public void activate() {
		frame.setVisible(true);
	}

	// public void registerListener(Controller handler) {
	// button.addActionListener(handler);
	// }

	public void registerReadHandler(Controller handler) {
		buttonRead.setActionCommand("read_data"); // устанавливаю команду для
													// этой кнопки
		buttonRead.addActionListener(handler);
	}

	public void registerPrintHandler(Controller handler) {
		buttonPrint.setActionCommand("print_data");
		buttonPrint.addActionListener(handler);
	}

}
