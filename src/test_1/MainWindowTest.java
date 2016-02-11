package test_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindowTest {

	private JFrame frame;

	Product product;
	WardrobeTest wardrobe = new WardrobeTest();
	private ArrayList<Product> productList;
	private MainPanelTest mainPanelTest;;
	int count = 0;
	OutSerialize2 outSerialize2 = new OutSerialize2();
	OutSerialize outSerialize = new OutSerialize();

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
		// productList = wardrobe.getProductList();
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

				mainPanelTest.saveProduct();
				count++;

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

		JButton btnSavefile = new JButton("saveFile");
		btnSavefile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// product = wardrobe.getProduct(0);
				outSerialize.saveFile(wardrobe.getProductList());

			}
		});
		panel.add(btnSavefile);

		JButton btnLoadfile = new JButton("loadFile");
		btnLoadfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Product productload = new Product();
				// WardrobeTest wardrobeload = new WardrobeTest();
				// productload = outSerialize2.loadFile();
				// product = productload;
				// mainPanelTest.saveProduct();
				wardrobe.setProductList(outSerialize.loadFile());
				mainPanelTest.loadProduct(0);
				// mainPanelTest.loadProduct(product);
				// product = wardrobe.getProduct(0);
				// mainPanelTest = new MainPanelTest(product, wardrobe);
				// System.out.println(wardrobe.toString());
			}
		});
		panel.add(btnLoadfile);
	}
}
