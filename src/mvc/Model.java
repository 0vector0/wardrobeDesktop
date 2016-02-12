package mvc;

import java.util.ArrayList;

class Model {
	// Здесь будут храниться имена пользователей из БД
	private ArrayList<String> data = new ArrayList<String>();

	public void readData() {
		data.clear();

		data.add("Name 1");
		data.add("Name 2");
		data.add("Name 3");
	}

	public ArrayList<String> getData() {
		return data;
	}
}