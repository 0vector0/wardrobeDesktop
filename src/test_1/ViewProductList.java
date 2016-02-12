package test_1;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewProductList extends JFrame {

	private JPanel contentPane;
	private JList<String> list;
	private DefaultListModel<String> listModel;
	JButton saveProductList;
	JButton loadProductList;
	JButton newProductButton;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ViewProductList frame = new ViewProductList();
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
	public ViewProductList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

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
	}

	public void activate() {
		setVisible(true);
	}

	public void registerSaveProductList(ControllerProductList controllerProductList) {
		saveProductList.setActionCommand("saveProductList"); // устанавливаю
																// команду
																// для
		saveProductList.addActionListener(controllerProductList);
	}

	public void registerLoadProductList(ControllerProductList controllerProductList) {
		loadProductList.setActionCommand("loadProductList"); // устанавливаю
																// команду
																// для
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

		;
		// listModel = new DefaultListModel();
		// list = new JList("");
		// Product product = modelWardrobe.getProduct(0);
		// listModel.addElement("test");
		// list.add("test");

		// TODO Auto-generated method stub

	}

}
