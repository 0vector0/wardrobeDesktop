package test_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class ControllerProductList extends Observable implements ActionListener, ControllerInterface {

	private int count = 0;
	private OutSerialize outSerialize = new OutSerialize();

	private ModelWardrobe modelWardrobe = new ModelWardrobe();
	private ViewProductList viewProductList;

	public ControllerProductList(ModelWardrobe modelWardrobe, ViewProductList viewProductList) {
		this.modelWardrobe = modelWardrobe;
		this.viewProductList = viewProductList;
	}

	@Override
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

	@Override
	public void showFrame() {
		viewProductList.activate();
	}

	@Override
	public void hideFrame() {
		viewProductList.deActivate();
	}

}
