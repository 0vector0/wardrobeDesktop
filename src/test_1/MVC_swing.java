package test_1;

public class MVC_swing {
	public static void main(String[] args) {

		ModelWardrobe modelWardrobe = new ModelWardrobe();
		ViewWindowOne view = new ViewWindowOne();
		ControllerWindowOne controllerWindowOne = new ControllerWindowOne(modelWardrobe, view);
		// controllerWindowOne.startApp();

		ViewProductList viewProductList = new ViewProductList();
		ControllerProductList controllerProductList = new ControllerProductList(modelWardrobe, viewProductList);
		// controllerProductList.startApp();

		ViewCurrentDay viewCurrentDay = new ViewCurrentDay();
		ControllerCurrentDay controllerCurrentDay = new ControllerCurrentDay(viewCurrentDay);
		controllerCurrentDay.startApp();

		FramesController controller = new FramesController(controllerCurrentDay);
		// controller.start();

	}
}
