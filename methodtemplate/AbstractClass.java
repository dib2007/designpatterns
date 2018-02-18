package methodtemplate;

public abstract class AbstractClass {
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	public abstract void method4();
	
	public void doSome() {
		method2();
		method1();
		method4();
		method3();
	}
}
