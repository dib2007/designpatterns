package proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Subject subject= new SubjectProxy();
		subject.workSubject();
	}
}
