package wardrobe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class ControllerCurrentDay extends Observable implements ActionListener, ControllerInterface {

	private ViewCurrentDay viewCurrentDay = new ViewCurrentDay();

	public ControllerCurrentDay(ViewCurrentDay viewCurrentDay) {
		this.viewCurrentDay = viewCurrentDay;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("openViewProductList")) {
			setChanged();
			notifyObservers();
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
