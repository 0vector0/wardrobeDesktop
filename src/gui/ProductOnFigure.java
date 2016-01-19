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
		
		
		labelProductDescription = new JLabel();
		labelProductDescription.setHorizontalAlignment(SwingConstants.CENTER);
		labelProductDescription.setText("Описание продукта");
		add(labelProductDescription, BorderLayout.SOUTH);
		
		JLabel labelProductImg = new JLabel("");
		labelProductImg.setHorizontalAlignment(SwingConstants.CENTER);
		
		Image img = new ImageIcon(this.getClass().getResource(this.imageProduct)).getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		labelProductImg.setIcon(new ImageIcon(img));
		
		add(labelProductImg, BorderLayout.CENTER);
		
		JButton buttonPreviousProduct = new JButton("<-");
		add(buttonPreviousProduct, BorderLayout.WEST);
		
		JButton buttonNextProduct = new JButton("->");
		add(buttonNextProduct, BorderLayout.EAST);
		
		JLabel labelProductName = new JLabel("Название продукта");
		labelProductName.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelProductName, BorderLayout.NORTH);

	}

}
