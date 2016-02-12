package test_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerProductList implements ActionListener {

	private int count = 0;
	private OutSerialize outSerialize = new OutSerialize();

	private ModelWardrobe modelWardrobe = new ModelWardrobe();
	private ViewProductList viewProductList;

	public ControllerProductList(ModelWardrobe modelWardrobe, ViewProductList viewProductList) {
		this.modelWardrobe = modelWardrobe;
		this.viewProductList = viewProductList;
	}

	public void startApp() {
		viewProductList.registerSaveProductList(this);
		viewProductList.registerLoadProductList(this);
		viewProductList.activate();

		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("saveProductList")) {
			System.out.println("saveFileProduct");
			// outSerialize.saveFile(modelWardrobe.getProductList());
			return;
		}
		if (e.getActionCommand().equals("loadProductList")) {
			System.out.println("loadFileProduct");
			viewProductList.loadProductList(modelWardrobe);

			// modelWardrobe.setProductList(outSerialize.loadFile());
			// viewProductList.loadProductList(modelWardrobe);
			return;
		}

	}

}
