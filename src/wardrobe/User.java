package wardrobe;

public class User {

	Product[] massProduct = new Product[5];;
	//Product product1 = new Product("Штаны джинсовые синие", "Базар", "Штаны", "Синий", 1, 120);
	//Product product2 = new Product("Куртка Адидас", "Adidas", "Штаны", "Синий", 1, 120);

	void byuProduct(int i, String name, String manufacture, String type, String color, int quantity, double price) {
		massProduct[i] = new Product(name, manufacture, type, color, quantity, price);
	}

}
