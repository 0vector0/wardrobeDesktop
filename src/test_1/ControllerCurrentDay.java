package test_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class ControllerCurrentDay extends Observable implements ActionListener, ControllerInterface {

	ViewCurrentDay viewCurrentDay = new ViewCurrentDay();

	public ControllerCurrentDay(ViewCurrentDay viewCurrentDay) {
		this.viewCurrentDay = viewCurrentDay;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("openViewProductList")) {
			System.out.println("openViewProductList");
			System.out.println("setChanged");
			System.out.println("notifyObservers");
			setChanged();
			notifyObservers();
			// outSerialize.saveFile(modelWardrobe.getProductList());
			return;
		}

	}

	@Override
	public void startApp() {
		viewCurrentDay.registerController(this);
		viewCurrentDay.activate();

	}

	@Override
	public void showFrame() {
		viewCurrentDay.activate();
	}

	@Override
	public void hideFrame() {
		viewCurrentDay.deActivate();
	}

}
