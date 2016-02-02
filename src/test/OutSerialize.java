package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OutSerialize {

	private WardrobeTest wardrobe;

	public OutSerialize(WardrobeTest wardrobe) {
		this.wardrobe = wardrobe;
		// TODO Auto-generated constructor stub
	}

	public void saveFile(WardrobeTest wardrobe) {

		String filename = "time.ser";

		wardrobe = new WardrobeTest();
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(wardrobe);
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public WardrobeTest loadFile() {
		String filename = "time.ser";
		WardrobeTest wardrobe = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			wardrobe = (WardrobeTest) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// wardrobe.toString();
		return wardrobe;
	}
}
