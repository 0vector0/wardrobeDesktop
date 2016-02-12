package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private Model model;
	private View view;

	public Controller(Model data, View view) {
		this.model = data;
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("read_data")) { // проверяю команду этой
														// кнопки
			model.readData();
			return;

		}
		if (e.getActionCommand().equals("print_data"))
			view.setText(model.getData());
	}

	void startApp() {
		view.registerReadHandler(this); // добавляет обработчик 1й клавиши
		view.registerPrintHandler(this); // ... 2й
		view.activate(); // отображает окно
	}
}
