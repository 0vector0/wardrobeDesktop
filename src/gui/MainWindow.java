package gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.GridLayout;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		frame = new JFrame();
		
		
		frame.setTitle("Шкаф");
		frame.setResizable(false);
		//frame.setSize( screenWidth-100,screenHeight-100);
		frame.setBounds(50, 50, screenWidth-100, screenHeight-100);
		//frame.setLocationByPlatform(true);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelFigure = new JPanel();
		frame.getContentPane().add(panelFigure, BorderLayout.CENTER);
		panelFigure.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPaneFigureName = new JTextPane();
		textPaneFigureName.setText("Фигурка человека");
		panelFigure.add(textPaneFigureName, BorderLayout.NORTH);
		
		//JPanel panel = new JPanel();
		PanelFigureGrid figure = new PanelFigureGrid();
		panelFigure.add(figure, BorderLayout.WEST);
		
		JPanel panelButtonsDays = new JPanel();
		panelFigure.add(panelButtonsDays, BorderLayout.SOUTH);
		panelButtonsDays.setLayout(new GridLayout(0, 7, 0, 0));
		
		JButton mondaypanelFigureGridButton = new JButton("Понедельник");
		panelButtonsDays.add(mondaypanelFigureGridButton);
		
		JButton button = new JButton("Вторник");
		panelButtonsDays.add(button);
		
		JButton button_1 = new JButton("Среда");
		panelButtonsDays.add(button_1);
		
		JButton button_2 = new JButton("Четверг");
		panelButtonsDays.add(button_2);
		
		JButton button_3 = new JButton("Пятница");
		panelButtonsDays.add(button_3);
		
		JButton button_4 = new JButton("Субота");
		panelButtonsDays.add(button_4);
		
		JButton button_5 = new JButton("Воскресение");
		panelButtonsDays.add(button_5);
		
		JPanel panelDays = new JPanel();
		frame.getContentPane().add(panelDays, BorderLayout.EAST);
		panelDays.setLayout(new BoxLayout(panelDays, BoxLayout.X_AXIS));
	}
	
	//определяем размеры окна
	
			/*Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int screenHeight = screenSize.height;
			int screenWidth = screenSize.width;
			
			//установка ширины и высоты фрейма и позиционирование с помощью платформы
			
			setSize(screenWidth/2, screenHeight/2);
			setLocationByPlatform(true);
			
			//установка пиктограмы и заголовка окна
			
			Image img = kit.getImage("1450829689_christmas-icon-gift.png");
			setIconImage(img);
			setTitle("SizedFrame");
			//запрет изменять размеры окна
			//setResizable(false); 
			
			// убрать кнопки  _[]X
			//setUndecorated(true); //
			//!!!ставить до  -- setVisible(true); -- 
			
			//setExtendedState(ICONIFIED); //уже свернуто
			//setExtendedState(MAXIMIZED_BOTH); //на весь экран
			//setExtendedState(MAXIMIZED_VERT); //  ???
			//setExtendedState(MAXIMIZED_HORIZ); // ???
*/			
			
	

}
