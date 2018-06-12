package abstractfactory;

public class FactoryTest {

	public static void main(String[] args) {
		try {
			HumanFactory.getInstance("MALE");
			HumanFactory.getInstance("FEMALE");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
