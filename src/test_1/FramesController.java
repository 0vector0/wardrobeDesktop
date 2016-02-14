package test_1;

import java.util.Observable;
import java.util.Observer;

public class FramesController implements Observer {

	Observable observable;
	// private Subject weatherData;

	public FramesController(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	static void start() {

	}

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
