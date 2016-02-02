package test;

import java.util.ArrayList;

public class WardrobeTest {

	private ArrayList<Product> productList = new ArrayList<Product>();
	private Product product;

	public void addProduct(Product product) {
		productList.add(product);
	}

	public Product getProduct(int i) {

		product = productList.get(i);

		return product;

	}

	public ArrayList<Product> getProductlist() {
		return productList;
	}

	public int getSizeProductList() {
		return productList.size();
	}

}
