package test_1;

import java.util.Observable;
import java.util.Observer;

public class FramesController implements Observer {

	// Observable observable1;
	// Observable observable2;
	// Observable observable3;

	ControllerWindowOne controllerWindowOne;
	ControllerProductList controllerProductList;
	ControllerCurrentDay controllerCurrentDay;
	ModelWardrobe modelWardrobe;
	ViewWindowOne view;
	ViewProductList viewProductList;
	ViewCurrentDay viewCurrentDay;

	public FramesController() {

		modelWardrobe = new ModelWardrobe();
		view = new ViewWindowOne();
		controllerWindowOne = new ControllerWindowOne(modelWardrobe, view);
		viewProductList = new ViewProductList();
		controllerProductList = new ControllerProductList(modelWardrobe, viewProductList);
		viewCurrentDay = new ViewCurrentDay();
		controllerCurrentDay = new ControllerCurrentDay(viewCurrentDay);
	}

	// private Subject weatherData;

	// public FramesController(Observable observable) {
	// this.observable = observable;
	// observable.addObserver(this);
	// }

	void addObservers() {
		controllerCurrentDay.addObserver(this);
		// controllerProductList.
	}

	void start() {
		controllerCurrentDay.startApp();
		controllerWindowOne.startApp();
		controllerProductList.startApp();
	}

	void startControllerCurrentDay() {
		controllerCurrentDay.startApp();
		// controllerWindowOne.startApp();
		// controllerProductList.startApp();
	}

	// void start() {
	// // this.observable1 = observable;
	// // observable1.addObserver(this);
	// // controllerCurrentDay.addObserver(this);
	// }

	@Override
	public void update(Observable o, Object arg) {

		if (o instanceof ControllerCurrentDay) {
			ControllerCurrentDay controllerCurrentDay = (ControllerCurrentDay) o;
			System.out.println("!!!!!");
			// this.tempereature = weatherData.getTempretature();
			// this.humidity = weatherData.getHumidity();
			// display();
		}

	}

}
