package abstractfactory;

public class FactoryTest {

	public static void main(String[] args) {
		HumanFactory.getInstance(0);
		HumanFactory.getInstance(1);
	}
}
