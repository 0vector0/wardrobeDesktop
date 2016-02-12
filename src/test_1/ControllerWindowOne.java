package test_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerWindowOne implements ActionListener {

	Product product;
	// ModelWardrobe modelWardrobe = new ModelWardrobe();
	// private ArrayList<Product> productList;
	// private MainPanelWindowOne mainPanelWindowOne;;
	int count = 0;
	OutSerialize2 outSerialize2 = new OutSerialize2();
	OutSerialize outSerialize = new OutSerialize();

	private ModelWardrobe modelWardrobe = new ModelWardrobe();
	private ViewWindowOne viewWindowOne;

	public ControllerWindowOne(ModelWardrobe modelWardrobe, ViewWindowOne viewWindowOne) {
		this.modelWardrobe = modelWardrobe;
		this.viewWindowOne = viewWindowOne;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// проверяю команду этой кнопки
		if (e.getActionCommand().equals("<-")) {
			System.out.println("<-");
			if (count > 0) {
				count--;
				viewWindowOne.loadProduct(modelWardrobe.getProduct(count));
			}
			// modelWardrobe.readData();
			return;
		}
		if (e.getActionCommand().equals("->")) {
			System.out.println("->");
			if (count < modelWardrobe.getSizeProductList() - 1) {
				count++;
				// modelWardrobe.getProduct(count)
				viewWindowOne.loadProduct(modelWardrobe.getProduct(count));
			}
			// viewWindowOne.setText(modelWardrobe.getData());
			return;
		}
		if (e.getActionCommand().equals("saveProduct")) {
			System.out.println("saveProduct");
			viewWindowOne.saveProduct(modelWardrobe);
			count++;
			// viewWindowOne.setText(modelWardrobe.getData());
			return;
		}

	}

	void startApp() {
		viewWindowOne.registerLeftButton(this); // добавляет обработчик 1й
												// клавиши
		viewWindowOne.registerRightButton(this); // ... 2й
		viewWindowOne.registerSaveButton(this);
		viewWindowOne.activate(); // отображает окно
	}
}
