package wardrobe;

import test_1.Product;

public class Clothes extends Product {

	private String color;

	public Clothes(String name, String type, String manufacturer, double price, String color) {
		super(name, type, manufacturer, price);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

}
