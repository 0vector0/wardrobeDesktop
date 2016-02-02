package test;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanelTest extends JPanel {
	private JTextField nameTextField;
	private JTextField typeTextField;
	private JTextField manufacturerTextField;
	private JTextField priceTextField;
	private Product product;
	private WardrobeTest wardrobe;

	public void saveProduct() {
		// this.product = product;
		// this.wardrobe = wardrobe;
		String name = nameTextField.getText();
		String type = typeTextField.getText();
		;
		String manufacturer = manufacturerTextField.getText();
		double price = Double.parseDouble(priceTextField.getText());

		product = new Product(name, type, manufacturer, price);
		wardrobe.addProduct(product);

		nameTextField.setText("");
		typeTextField.setText("");
		manufacturerTextField.setText("");
		priceTextField.setText("");
	}

	public void loadProduct(int count) {
		product = wardrobe.getProduct(count);
		nameTextField.setText(product.getName());
		typeTextField.setText(product.getType());
		manufacturerTextField.setText(product.getManufacturer());
		priceTextField.setText(Double.toString(product.getPrice()));

	}

	/**
	 * Create the panel.
	 */
	public MainPanelTest(Product product, WardrobeTest wardrobe) {
		this.product = product;
		this.wardrobe = wardrobe;
		setLayout(null);

		JLabel nameLabel = new JLabel("name");
		nameLabel.setBounds(40, 70, 46, 14);
		add(nameLabel);

		JLabel typeLabel = new JLabel("type");
		typeLabel.setBounds(40, 104, 46, 14);
		add(typeLabel);

		JLabel manufacturerLabel = new JLabel("manufacturer");
		manufacturerLabel.setBounds(40, 141, 78, 14);
		add(manufacturerLabel);

		JLabel priceLabel = new JLabel("price");
		priceLabel.setBounds(40, 166, 46, 14);
		add(priceLabel);

		nameTextField = new JTextField();
		nameTextField.setBounds(147, 70, 86, 20);
		add(nameTextField);
		nameTextField.setColumns(10);

		typeTextField = new JTextField();
		typeTextField.setBounds(147, 104, 86, 20);
		add(typeTextField);
		typeTextField.setColumns(10);

		manufacturerTextField = new JTextField();
		manufacturerTextField.setBounds(147, 141, 86, 20);
		add(manufacturerTextField);
		manufacturerTextField.setColumns(10);

		priceTextField = new JTextField();
		priceTextField.setBounds(147, 166, 86, 20);
		add(priceTextField);
		priceTextField.setColumns(10);

	}
}
