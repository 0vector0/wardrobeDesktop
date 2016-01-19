package gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;

public class ProductOnFigure extends JPanel {
	private JLabel labelProductDescription;
	private String imageProduct;
	//= "/product_default_hat.png";

	
	/**
	 * Create the panel.
	 */
	public ProductOnFigure(String imageDefaultProduct) {
		imageProduct = "hat";
		this.imageProduct = "/product_default_" + imageDefaultProduct  + ".png";
		setLayout(new BorderLayout(0, 0));
		
		Image img = new ImageIcon(this.getClass().getResource(this.imageProduct)).getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		
		JPanel panelDescription = new JPanel();
		add(panelDescription, BorderLayout.CENTER);
		panelDescription.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Название продукта");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panelDescription.add(label, BorderLayout.NORTH);
		
		JLabel labelProductImg = new JLabel("");
		panelDescription.add(labelProductImg, BorderLayout.CENTER);
		labelProductImg.setHorizontalAlignment(SwingConstants.CENTER);
		labelProductImg.setIcon(new ImageIcon(img));
		
		
		labelProductDescription = new JLabel();
		panelDescription.add(labelProductDescription, BorderLayout.SOUTH);
		labelProductDescription.setHorizontalAlignment(SwingConstants.CENTER);
		labelProductDescription.setText("Описание продукта");
		
		JPanel panelButtons = new JPanel();
		add(panelButtons, BorderLayout.SOUTH);
		
		JButton buttonPreviousProduct = new JButton("<-");
		panelButtons.add(buttonPreviousProduct);
		
		JButton buttonDeleteProduct = new JButton("X");
		panelButtons.add(buttonDeleteProduct);
		
		JButton buttonNextProduct = new JButton("->");
		panelButtons.add(buttonNextProduct);

	}

}
