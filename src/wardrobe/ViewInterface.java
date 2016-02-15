package wardrobe;

public interface ViewInterface {
	public void activate();

	public void deActivate();

	abstract public void registerController(ControllerInterface controllerInterface);
}
