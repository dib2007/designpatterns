package observer;

public class ObserverTest {
	public static void main(String[] args) {
		DOM dom = new DOM();
		dom.attach(new Controller());
		dom.attach(new Controller());
		dom.change();
	}
}
