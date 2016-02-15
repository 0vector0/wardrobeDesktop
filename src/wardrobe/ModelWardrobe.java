package wardrobe;

import java.io.Serializable;
import java.util.ArrayList;

import test_1.Product;

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

	public int getSizeProductList() {
		return productList.size();
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

}
