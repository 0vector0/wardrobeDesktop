package wardrobe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import test_1.Product;

public class OutSerialize {

	// private WardrobeTest wardrobe;

	public OutSerialize() {
		// this.wardrobe = wardrobe;
		// TODO Auto-generated constructor stub
	}

	static public void saveFile(ArrayList<Product> productList) {
		String filename = "productList.txt";

		// wardrobe = new WardrobeTest();
		// ArrayList<Product> productList = null;
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

	static public ArrayList<Product> loadFile() {
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
			System.out.println("Нет файла");
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			System.out.println("Неверный формат файла  ");
			ex.printStackTrace();
		}
		// productList.toString();
		return productList;
	}
}
