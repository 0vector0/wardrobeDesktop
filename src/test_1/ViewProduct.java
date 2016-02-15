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

		mainPanelWindowOne = new MainPanelWindowOne();
		contentPane.add(mainPanelWindowOne, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		leftButton = new JButton("<");
		panel.add(leftButton);

		rightButton = new JButton(">");
		panel.add(rightButton);

		saveButton = new JButton("save");
		panel.add(saveButton);

		saveFileButton = new JButton("saveFile");
		panel.add(saveFileButton);

		loadFileButton = new JButton("loadFile");
		panel.add(loadFileButton);
	}

	public void registerLeftButton(ControllerProduct controllerProduct) {
		leftButton.setActionCommand("<-");
		leftButton.addActionListener(controllerProduct);
	}

	public void registerRightButton(ControllerProduct controllerProduct) {
		rightButton.setActionCommand("->");
		rightButton.addActionListener(controllerProduct);
	}

	public void registerSaveButton(ControllerProduct controllerProduct) {
		saveButton.setActionCommand("saveProduct");
		saveButton.addActionListener(controllerProduct);
	}

	public void registerSaveFileButton(ControllerProduct controllerProduct) {
		saveFileButton.setActionCommand("saveFileProduct");
		saveFileButton.addActionListener(controllerProduct);
	}

	public void registerLoadFileButton(ControllerProduct controllerProduct) {
		loadFileButton.setActionCommand("loadFileProduct");
		loadFileButton.addActionListener(controllerProduct);
	}

	public void loadProduct(Product product) {
		mainPanelWindowOne.loadProduct(product);
	}

	public void saveProduct(ModelWardrobe modelWardrobe) {
		mainPanelWindowOne.saveProduct(modelWardrobe);
	}

	@Override
	public void registerController(ControllerInterface controllerInterface) {
		// TODO Auto-generated method stub
	}
}
