package wardrobe;


public class User {

	Product[] massUserProduct = new Product[2];
	private String nameOfUser;

	User(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}

	public String getNameOfUser() {
		return nameOfUser;
	}

	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}

	void byuProduct() {
	//	massProduct[0] = new Product();
		massUserProduct[0] = new Product("Штаны джинсовые синие", "Базар", "Штаны", "Синий", 1, 120);
		massUserProduct[1] = new Product("Куртка Адидас", "Adidas", "Штаны", "Синий", 1, 120);

	}
	
	
	void setProductOnDay(Day testDay){
		testDay.setMassDayProduct(massUserProduct[0]);
	}
	
	void printOneProduct(Day testDay){
		Product product = testDay.getMassDayProduct(); 
		System.out.println("Изделие -");
		System.out.println(product.getName());
		System.out.println(product.getType());
		System.out.println(product.getManufacturer());
		System.out.println(product.getColor());
		System.out.println(product.getPrice());
		System.out.println();
	}
	
	void printProduct(){
		
		System.out.println("Информация о изделии");
		for (int i = 0; i < massUserProduct.length; i++) {
			System.out.println("Изделие -" + i);
			System.out.println(massUserProduct[i].getName());
			System.out.println(massUserProduct[i].getType());
			System.out.println(massUserProduct[i].getManufacturer());
			System.out.println(massUserProduct[i].getColor());
			System.out.println(massUserProduct[i].getPrice());
			System.out.println();
		}
		
	}

}
