package test_1;

import java.util.Observable;
import java.util.Observer;

public class FramesController implements Observer {

	ControllerProduct controllerProduct;
	ControllerProductList controllerProductList;
	ControllerCurrentDay controllerCurrentDay;
	ModelWardrobe modelWardrobe;
	ViewProduct viewProduct;
	ViewProductList viewProductList;
	ViewCurrentDay viewCurrentDay;

	public FramesController() {
		modelWardrobe = new ModelWardrobe();

		viewProduct = new ViewProduct();
		controllerProduct = new ControllerProduct(modelWardrobe, viewProduct);

		viewProductList = new ViewProductList();
		controllerProductList = new ControllerProductList(modelWardrobe, viewProductList);

		viewCurrentDay = new ViewCurrentDay();
		controllerCurrentDay = new ControllerCurrentDay(viewCurrentDay);
	}

	void addObservers() {
		controllerCurrentDay.addObserver(this);
		controllerProduct.addObserver(this);
		controllerProductList.addObserver(this);
	}

	void start() {
		controllerCurrentDay.startApp();

		controllerProductList.startApp();

		controllerProduct.startApp();
	}

	@Override
	public void update(Observable o, Object arg) {

		if (o instanceof ControllerCurrentDay) {
			ControllerCurrentDay controllerCurrentDay = (ControllerCurrentDay) o;
			controllerCurrentDay.hideFrame();
			controllerProductList.showFrame();
			// System.out.println("Сегодняшний день");
		}
		if (o instanceof ControllerProductList) {
			ControllerProductList controllerProductList = (ControllerProductList) o;
			controllerProductList.hideFrame();
			controllerCurrentDay.showFrame();
			// controllerProductList.showFrame();
			// System.out.println("Гардероб");
		}

	}

}
