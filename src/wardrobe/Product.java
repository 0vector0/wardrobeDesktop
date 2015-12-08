package wardrobe;



public class Product {
	
	/*private enum Size {
		SMALL, MEDIUM, LARGE, EXTRA_LARGE
	}*/
	
	

	private String name;
	private String manufacturer;
	private String type;
	private String color;
	private int quantity;
	private double price;

	Product() {
		this.name = "";
		this.manufacturer = "";
		this.type = "";
		this.color = "";
		this.quantity = 0;
		this.price = 0;
	}

	Product(String name, String manufacturer, String type, String color, int quantity, double price) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.type = type;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}
}
