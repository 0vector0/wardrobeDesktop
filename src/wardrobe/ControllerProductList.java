package wardrobe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class ControllerProductList extends Observable implements ActionListener, ControllerInterface {

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
		viewProductList.registerController(this);
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
		if (e.getActionCommand().equals("backFromProductList")) {
			// System.out.println("openViewProductList");
			// System.out.println("setChanged");
			// System.out.println("notifyObservers");
			setChanged();
			notifyObservers();
			System.out.println("Back");
			// outSerialize.saveFile(modelWardrobe.getProductList());
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
