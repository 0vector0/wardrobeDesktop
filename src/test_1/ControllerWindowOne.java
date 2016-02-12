package test_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerWindowOne implements ActionListener {

	private int count = 0;
	// private OutSerialize outSerialize = new OutSerialize();

	private ModelWardrobe modelWardrobe = new ModelWardrobe();
	private ViewWindowOne viewWindowOne;

	public ControllerWindowOne(ModelWardrobe modelWardrobe, ViewWindowOne viewWindowOne) {
		this.modelWardrobe = modelWardrobe;
		this.viewWindowOne = viewWindowOne;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("<-")) {
			System.out.println("<-");
			if (count > 0) {
				count--;
				viewWindowOne.loadProduct(modelWardrobe.getProduct(count));
			}
			return;
		}
		if (e.getActionCommand().equals("->")) {
			System.out.println("->");
			if (count < modelWardrobe.getSizeProductList() - 1) {
				count++;
				viewWindowOne.loadProduct(modelWardrobe.getProduct(count));
			}
			return;
		}
		if (e.getActionCommand().equals("saveProduct")) {
			System.out.println("saveProduct");
			viewWindowOne.saveProduct(modelWardrobe);
			count++;
			return;
		}
		if (e.getActionCommand().equals("saveFileProduct")) {
			System.out.println("saveFileProduct");
			// outSerialize.saveFile(modelWardrobe.getProductList());
			OutSerialize.saveFile(modelWardrobe.getProductList());
			return;
		}
		if (e.getActionCommand().equals("loadFileProduct")) {
			System.out.println("loadFileProduct");
			// modelWardrobe.setProductList(outSerialize.loadFile());
			modelWardrobe.setProductList(OutSerialize.loadFile());
			viewWindowOne.loadProduct(modelWardrobe.getProduct(0));
			return;
		}
	}

	void startApp() {
		viewWindowOne.registerLeftButton(this);
		viewWindowOne.registerRightButton(this);
		viewWindowOne.registerSaveButton(this);
		viewWindowOne.registerSaveFileButton(this);
		viewWindowOne.registerLoadFileButton(this);

		viewWindowOne.activate(); // отображает окно
	}
}
