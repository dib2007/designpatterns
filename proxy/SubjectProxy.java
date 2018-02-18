package proxy;

public class SubjectProxy implements Subject {

	private RealSubject subject;

	@Override
	public void workSubject() {
		// Put logic specific for the proxy
		subject.workSubject();
	}

}
