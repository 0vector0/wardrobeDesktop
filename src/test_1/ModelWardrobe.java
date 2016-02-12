package test_1;

import java.io.Serializable;
import java.util.ArrayList;

public class ModelWardrobe implements Serializable {

	private ArrayList<Product> productList;
	private Product product;

	public ModelWardrobe() {
		productList = new ArrayList<Product>();
	}

	public void addProduct(Product product) {
		productList.add(product);
	}

	public Product getProduct(int i) {

		product = productList.get(i);

		return product;

	}

	// public ArrayList<Product> getProductlist() {
	// return productList;
	// }

	public int getSizeProductList() {
		return productList.size();
	}

	@Override
	public String toString() {
		return "WardrobeTest [productList=" + productList + "]";
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

}