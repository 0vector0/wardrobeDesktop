package test2;

public class MVC_swing {
	public static void main(String[] args) {
		Model mod = new Model();
		View view = new View();
		Controller contr = new Controller(mod, view);

		contr.startApp();
	}
}
