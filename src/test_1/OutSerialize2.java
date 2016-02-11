package test_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OutSerialize2 {

	// private WardrobeTest wardrobe;

	public OutSerialize2() {
		// this.wardrobe = wardrobe;
		// TODO Auto-generated constructor stub
	}

	public void saveFile(Product product) {
		String filename = "time.ser";

		// wardrobe = new WardrobeTest();
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(product);
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public Product loadFile() {
		String filename = "time.ser";
		Product product = null;
		// WardrobeTest wardrobe = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			product = (Product) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// product.toString();
		return product;
	}
}
