package wardrobe;

public class WardrobeMain {
	public static void main(String[] args) {

		FramesController controller = new FramesController();
		controller.addObservers();
		controller.start();

	}
}