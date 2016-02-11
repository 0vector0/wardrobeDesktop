package test_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OutSerialize {

	// private WardrobeTest wardrobe;

	public OutSerialize() {
		// this.wardrobe = wardrobe;
		// TODO Auto-generated constructor stub
	}

	public void saveFile(ArrayList<Product> productList) {
		String filename = "productList.txt";

		// wardrobe = new WardrobeTest();
		// ArrayList<Product> productList = new ArrayList<Product>();
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(productList);
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<Product> loadFile() {
		String filename = "productList.txt";
		// WardrobeTest wardrobe = null;
		ArrayList<Product> productList = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			productList = (ArrayList<Product>) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// productList.toString();
		return productList;
	}
}
