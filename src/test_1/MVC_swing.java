package test_1;

public class MVC_swing {
	public static void main(String[] args) {

		FramesController controller = new FramesController();
		controller.addObservers();
		controller.start();

	}
}