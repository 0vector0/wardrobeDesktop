package test_1;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ViewProductList extends View implements ViewInterface {

	// private JPanel contentPane;
	private JList<String> list;
	private DefaultListModel<String> listModel;
	private JButton saveProductList;
	private JButton loadProductList;
	private JButton newProductButton;
	private JButton backButton;

	/**
	 * Create the frame.
	 */
	public ViewProductList() {

		JPanel panelList = new JPanel();
		contentPane.add(panelList, BorderLayout.CENTER);

		// String[] elements = { "element 1", "element 2", "element 3" };
		// list = new JList<String>(elements);
		// listModel = new DefaultListModel<String>();
		list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object element = list.getSelectedValue();
				// label.setText(element.toString());
				System.out.println(element.toString());
			}
		});
		panelList.add(list);

		JLabel lblNewLabel = new JLabel("Список одежды");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panelButton = new JPanel();
		contentPane.add(panelButton, BorderLayout.SOUTH);

		saveProductList = new JButton("saveProductList");
		panelButton.add(saveProductList);

		loadProductList = new JButton("loadProductList");
		panelButton.add(loadProductList);

		newProductButton = new JButton("newProductButton");
		panelButton.add(newProductButton);

		backButton = new JButton("Назад");

		contentPane.add(backButton, BorderLayout.WEST);
	}

	public void registerSaveProductList(ControllerProductList controllerProductList) {
		saveProductList.setActionCommand("saveProductList");
		saveProductList.addActionListener(controllerProductList);
	}

	public void registerLoadProductList(ControllerProductList controllerProductList) {
		loadProductList.setActionCommand("loadProductList");
		loadProductList.addActionListener(controllerProductList);
	}

	public void loadProductList(ModelWardrobe modelWardrobe) {
		listModel = new DefaultListModel<String>();

		for (int i = 0; i < modelWardrobe.getSizeProductList(); i++) {
			Product product = modelWardrobe.getProduct(i);
			listModel.addElement(product.getName());
		}
		list.setModel(listModel);
		// listModel.addElement("Jane Doe");
		// listModel.addElement("John Smith");
		// listModel.addElement("Kathy Green");

		// listModel = new DefaultListModel();
		// list = new JList("");
		// Product product = modelWardrobe.getProduct(0);
		// listModel.addElement("test");
		// list.add("test");

		// TODO Auto-generated method stub

	}

	@Override
	public void registerController(ControllerInterface controllerInterface) {
		backButton.setActionCommand("backFromProductList");
		backButton.addActionListener((ActionListener) controllerInterface);

	}

}
