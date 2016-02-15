package test_1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ViewProduct extends View {

	private MainPanelWindowOne mainPanelWindowOne;;

	private JButton leftButton;
	private JButton rightButton;
	private JButton saveButton;
	private JButton saveFileButton;
	private JButton loadFileButton;

	/**
	 * Create the application.
	 */
	public ViewProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// productList = wardrobe.getProductList();
		// frame = new JFrame();
		// setBounds(100, 100, 450, 300);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

	public void registerLeftButton(ControllerProduct controllerProduct) {
		leftButton.setActionCommand("<-"); // устанавливаю команду для
		leftButton.addActionListener(controllerProduct);
	}

	public void registerRightButton(ControllerProduct controllerProduct) {
		rightButton.setActionCommand("->"); // устанавливаю команду для
		rightButton.addActionListener(controllerProduct);
	}

	public void registerSaveButton(ControllerProduct controllerProduct) {
		saveButton.setActionCommand("saveProduct"); // устанавливаю команду для
		saveButton.addActionListener(controllerProduct);
	}

	public void registerSaveFileButton(ControllerProduct controllerProduct) {
		saveFileButton.setActionCommand("saveFileProduct"); // устанавливаю
															// команду
															// для
		saveFileButton.addActionListener(controllerProduct);
	}

	public void registerLoadFileButton(ControllerProduct controllerProduct) {
		loadFileButton.setActionCommand("loadFileProduct"); // устанавливаю
															// команду
															// для
		loadFileButton.addActionListener(controllerProduct);
	}

	public void loadProduct(Product product) {
		mainPanelWindowOne.loadProduct(product);
	}

	public void saveProduct(ModelWardrobe modelWardrobe) {
		mainPanelWindowOne.saveProduct(modelWardrobe);

	}

	// @Override
	// public void activate() {
	// setVisible(true);
	// }
	//
	// @Override
	// public void deActivate() {
	// setVisible(false);
	// }

	@Override
	public void registerController(ControllerInterface controllerInterface) {
		// TODO Auto-generated method stub

	}

}
