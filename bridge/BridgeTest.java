package bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Color colorRed = new Red();
		Color colorBlue = new Blue();
		Rectangle recBlue = new Rectangle(colorBlue);
		Circle circleRed = new Circle(colorRed);
		
		recBlue.draw();
		circleRed.draw();
	}
}
