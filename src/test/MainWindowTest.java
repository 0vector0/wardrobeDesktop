package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindowTest {

	private JFrame frame;

	Product product;
	WardrobeTest wardrobe = new WardrobeTest();
	private MainPanelTest mainPanelTest;;
	int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowTest window = new MainWindowTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindowTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanelTest = new MainPanelTest(product, wardrobe);
		frame.getContentPane().add(mainPanelTest, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		JButton leftButton = new JButton("<");
		leftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count > 0) {
					count--;
					mainPanelTest.loadProduct(count);
				}

			}
		});
		panel.add(leftButton);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// String name = mainPanelTest.getNameText();
				// String type = mainPanelTest.getTypeText();
				// String manufacturer = mainPanelTest.getManufacturerText();
				// double price = mainPanelTest.getPrice();
				//
				// product = new Product(name, type, manufacturer, price);
				// wardrobe.addProduct(product);
				mainPanelTest.saveProduct();
				count++;
				// mainPanelTest.setNameText("");
				// mainPanelTest.setTypeText("");
				// mainPanelTest.setManufacturerText("");
				// mainPanelTest.setPriceTextField(0.0);

			}
		});
		panel.add(saveButton);

		JButton rightButton = new JButton(">");
		rightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < wardrobe.getSizeProductList() - 1) {
					count++;
					mainPanelTest.loadProduct(count);
				}
			}
		});
		panel.add(rightButton);
	}

}
