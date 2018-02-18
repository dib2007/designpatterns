package bridge;

public abstract class Service {
	private ServiceImplementor serviceImplementor;

	public Service(ServiceImplementor serviceImplementor) {
		this.serviceImplementor = serviceImplementor;
	}
}
