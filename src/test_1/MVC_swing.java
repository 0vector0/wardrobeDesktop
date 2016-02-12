package test_1;

public class MVC_swing {
	public static void main(String[] args) {

		ModelWardrobe wardrobeModel = new ModelWardrobe();
		ViewWindowOne view = new ViewWindowOne();
		ControllerWindowOne contr = new ControllerWindowOne(wardrobeModel, view);

		contr.startApp();
	}
}
