package observer;

import java.util.ArrayList;
import java.util.List;

public class DOM {
	List<Controller> observers = new ArrayList<>();

	public void attach(Controller controller) {
		observers.add(controller);
	}

	public void detach(Controller controller) {
		observers.remove(controller);
	}

	public void change() {
		observers.stream().forEach(x -> x.notify(this));
	}
}
