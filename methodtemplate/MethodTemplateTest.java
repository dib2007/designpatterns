package methodtemplate;

public class MethodTemplateTest {
	public static void main(String[] args) {
		AbstractClass ref1 = new ConcreteClass1();
		ref1.doSome();
		AbstractClass ref2 = new ConcreteClass2();
		ref2.doSome();
	}
}
