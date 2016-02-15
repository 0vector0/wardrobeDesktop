package wardrobe;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public abstract class View extends JFrame implements ViewInterface {

	protected JPanel contentPane;

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void activate() {
		setVisible(true);
	}

	@Override
	public void deActivate() {
		setVisible(false);
	}

	@Override
	abstract public void registerController(ControllerInterface controllerInterface);

}
