package wardrobe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class ControllerProduct extends Observable implements ActionListener, ControllerInterface {

	private int count = 0;

	private ModelWardrobe modelWardrobe = new ModelWardrobe();
	private ViewProduct viewProduct;

	public ControllerProduct(ModelWardrobe modelWardrobe, ViewProduct viewProduct) {
		this.modelWardrobe = modelWardrobe;
		this.viewProduct = viewProduct;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("<-")) {
			System.out.println("<-");
			if (count > 0) {
				count--;
				viewProduct.loadProduct(modelWardrobe.getProduct(count));
			}
			return;
		}
		if (e.getActionCommand().equals("->")) {
			System.out.println("->");
			if (count < modelWardrobe.getSizeProductList() - 1) {
				count++;
				viewProduct.loadProduct(modelWardrobe.getProduct(count));
			}
			return;
		}
		if (e.getActionCommand().equals("saveProduct")) {
			System.out.println("saveProduct");
			viewProduct.saveProduct(modelWardrobe);
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
			viewProduct.loadProduct(modelWardrobe.getProduct(0));
			return;
		}
	}

	public void startApp() {
		viewProduct.registerLeftButton(this);
		viewProduct.registerRightButton(this);
		viewProduct.registerSaveButton(this);
		viewProduct.registerSaveFileButton(this);
		viewProduct.registerLoadFileButton(this);

		viewProduct.activate(); // отображает окно
	}

	@Override
	public void showFrame() {
		viewProduct.activate();
	}

	@Override
	public void hideFrame() {
		viewProduct.deActivate();
	}
}
