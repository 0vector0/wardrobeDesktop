package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelFigureGrid extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelFigureGrid() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		ProductOnFigure glasses = new ProductOnFigure("glasses");
		GridBagConstraints gbc_glasses = new GridBagConstraints();
		gbc_glasses.insets = new Insets(0, 0, 5, 5);
		gbc_glasses.fill = GridBagConstraints.BOTH;
		gbc_glasses.gridx = 0;
		gbc_glasses.gridy = 0;
		add(glasses, gbc_glasses);
		
		ProductOnFigure hat = new ProductOnFigure("hat");
		GridBagConstraints gbc_hat = new GridBagConstraints();
		gbc_hat.insets = new Insets(0, 0, 5, 5);
		gbc_hat.fill = GridBagConstraints.BOTH;
		gbc_hat.gridx = 1;
		gbc_hat.gridy = 0;
		add(hat, gbc_hat);
		
		ProductOnFigure scarf = new ProductOnFigure("scarf");
		GridBagConstraints gbc_scarf = new GridBagConstraints();
		gbc_scarf.insets = new Insets(0, 0, 5, 0);
		gbc_scarf.fill = GridBagConstraints.BOTH;
		gbc_scarf.gridx = 2;
		gbc_scarf.gridy = 0;
		add(scarf, gbc_scarf);
		
		ProductOnFigure shirt = new ProductOnFigure("shirt");
		GridBagConstraints gbc_shirt = new GridBagConstraints();
		gbc_shirt.insets = new Insets(0, 0, 5, 5);
		gbc_shirt.fill = GridBagConstraints.BOTH;
		gbc_shirt.gridx = 0;
		gbc_shirt.gridy = 1;
		add(shirt, gbc_shirt);
		
		ProductOnFigure sweater = new ProductOnFigure("sweater");
		GridBagConstraints gbc_sweater = new GridBagConstraints();
		gbc_sweater.insets = new Insets(0, 0, 5, 5);
		gbc_sweater.fill = GridBagConstraints.BOTH;
		gbc_sweater.gridx = 1;
		gbc_sweater.gridy = 1;
		add(sweater, gbc_sweater);
		
		ProductOnFigure coat = new ProductOnFigure("coat");
		GridBagConstraints gbc_coat = new GridBagConstraints();
		gbc_coat.insets = new Insets(0, 0, 5, 0);
		gbc_coat.fill = GridBagConstraints.BOTH;
		gbc_coat.gridx = 2;
		gbc_coat.gridy = 1;
		add(coat, gbc_coat);
		
		ProductOnFigure bag = new ProductOnFigure("bag");
		GridBagConstraints gbc_bag = new GridBagConstraints();
		gbc_bag.insets = new Insets(0, 0, 5, 5);
		gbc_bag.fill = GridBagConstraints.BOTH;
		gbc_bag.gridx = 0;
		gbc_bag.gridy = 2;
		add(bag, gbc_bag);
		
		ProductOnFigure pants = new ProductOnFigure("pants");
		GridBagConstraints gbc_pants = new GridBagConstraints();
		gbc_pants.insets = new Insets(0, 0, 5, 5);
		gbc_pants.fill = GridBagConstraints.BOTH;
		gbc_pants.gridx = 1;
		gbc_pants.gridy = 2;
		add(pants, gbc_pants);
		
		ProductOnFigure watch = new ProductOnFigure("watch");
		GridBagConstraints gbc_watch = new GridBagConstraints();
		gbc_watch.insets = new Insets(0, 0, 5, 0);
		gbc_watch.fill = GridBagConstraints.BOTH;
		gbc_watch.gridx = 2;
		gbc_watch.gridy = 2;
		add(watch, gbc_watch);
		
		ProductOnFigure question_left = new ProductOnFigure("question");
		GridBagConstraints gbc_question_left = new GridBagConstraints();
		gbc_question_left.insets = new Insets(0, 0, 0, 5);
		gbc_question_left.fill = GridBagConstraints.BOTH;
		gbc_question_left.gridx = 0;
		gbc_question_left.gridy = 3;
		add(question_left, gbc_question_left);
		
		ProductOnFigure shoes = new ProductOnFigure("shoes");
		GridBagConstraints gbc_shoes = new GridBagConstraints();
		gbc_shoes.insets = new Insets(0, 0, 0, 5);
		gbc_shoes.fill = GridBagConstraints.BOTH;
		gbc_shoes.gridx = 1;
		gbc_shoes.gridy = 3;
		add(shoes, gbc_shoes);
		
		ProductOnFigure question_right = new ProductOnFigure("question");
		GridBagConstraints gbc_question_right = new GridBagConstraints();
		gbc_question_right.fill = GridBagConstraints.BOTH;
		gbc_question_right.gridx = 2;
		gbc_question_right.gridy = 3;
		add(question_right, gbc_question_right);

	}

}
