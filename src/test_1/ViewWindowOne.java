package test_1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewWindowOne extends JFrame {

	// private JFrame frame;

	Product product;
	ModelWardrobe wardrobe = new ModelWardrobe();
	// private ArrayList<Product> productList;
	private MainPanelWindowOne mainPanelWindowOne;;
	int count = 0;
	OutSerialize2 outSerialize2 = new OutSerialize2();
	OutSerialize outSerialize = new OutSerialize();

	JButton leftButton;
	JButton rightButton;
	JButton saveButton;
	JButton saveFileButton;
	JButton loadFileButton;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ViewWindowOne window = new ViewWindowOne();
	// window.frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public ViewWindowOne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// productList = wardrobe.getProductList();
		// frame = new JFrame();
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanelWindowOne = new MainPanelWindowOne(/* product, wardrobe */);
		getContentPane().add(mainPanelWindowOne, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);

		leftButton = new JButton("<");
		// leftButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// if (count > 0) {
		// count--;
		// mainPanelWindowOne.loadProduct(count);
		// }
		//
		// }
		// });
		panel.add(leftButton);

		rightButton = new JButton(">");
		// rightButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// if (count < wardrobe.getSizeProductList() - 1) {
		// count++;
		// mainPanelWindowOne.loadProduct(count);
		// }
		// }
		// });
		panel.add(rightButton);

		saveButton = new JButton("save");
		// saveButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		//
		// mainPanelWindowOne.saveProduct();
		// count++;
		//
		// }
		// });
		panel.add(saveButton);

		saveFileButton = new JButton("saveFile");
		// savefileButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// outSerialize.saveFile(wardrobe.getProductList());
		//
		// }
		// });
		panel.add(saveFileButton);

		loadFileButton = new JButton("loadFile");
		// loadfileButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// wardrobe.setProductList(outSerialize.loadFile());
		// // mainPanelWindowOne.loadProduct(0);
		// }
		// });
		panel.add(loadFileButton);
	}

	public void registerLeftButton(ControllerWindowOne controllerWindowOne) {
		leftButton.setActionCommand("<-"); // устанавливаю команду для
		leftButton.addActionListener(controllerWindowOne);
	}

	public void registerRightButton(ControllerWindowOne controllerWindowOne) {
		rightButton.setActionCommand("->"); // устанавливаю команду для
		rightButton.addActionListener(controllerWindowOne);
	}

	public void registerSaveButton(ControllerWindowOne controllerWindowOne) {
		saveButton.setActionCommand("saveProduct"); // устанавливаю команду для
		saveButton.addActionListener(controllerWindowOne);
	}

	public void registerSaveFileButton(ControllerWindowOne controllerWindowOne) {
		saveFileButton.setActionCommand("saveFileProduct"); // устанавливаю
															// команду
															// для
		saveFileButton.addActionListener(controllerWindowOne);
	}

	public void registerLoadFileButton(ControllerWindowOne controllerWindowOne) {
		loadFileButton.setActionCommand("loadFileProduct"); // устанавливаю
															// команду
															// для
		loadFileButton.addActionListener(controllerWindowOne);
	}

	public void activate() {
		setVisible(true);

	}

	public void loadProduct(Product product) {
		mainPanelWindowOne.loadProduct(product);
	}

	public void saveProduct(ModelWardrobe modelWardrobe) {
		mainPanelWindowOne.saveProduct(modelWardrobe);

	}

}
