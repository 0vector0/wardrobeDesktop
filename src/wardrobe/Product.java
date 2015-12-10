package wardrobe;

import java.util.Scanner;

public class Product {
	

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	/*private enum Size {
		SMALL, MEDIUM, LARGE, EXTRA_LARGE
	}*/
	private static Scanner sc = new Scanner(System.in);
	

	private String name;
	private String manufacturer;
	private String type;
	private String color;
	private int quantity;
	private double price;

	Product() {
		this.name = inputString("Найменование");
		this.manufacturer = inputString("Производителя");
		this.type = inputString("Тип (штаны, юбка, кофта и т.д.)");
		this.color = inputString("Цвет вещи");
		//this.quantity = 0;
		this.price = inputInt("Цену");
	}

	Product(String name, String manufacturer, String type, String color, int quantity, double price) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.type = type;
		this.color = color;
		//this.quantity = quantity;
		this.price = price;
	}
	
	
	
	protected static int inputInt(String description) {

		System.out.println("Введите " + description + " (число)");
		while (!sc.hasNextInt()) {
			System.out.println("Введите число");
			sc.nextLine();
		}
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}

	protected static String inputString(String description) {
		System.out.println("Введите " + description);
		String result = sc.nextLine();
		System.out.println();
		return result;
	}
	
	
}
