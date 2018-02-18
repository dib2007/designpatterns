package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonWithHolder implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SingletonWithHolder() {
		if (null == Holder.INSTANCE) {
			System.out.println("Creating...");
		} else {
			throw new RuntimeException("Can no create, please use getInstance");
		}
	}

	public static SingletonWithHolder getInstance() {
		return Holder.INSTANCE;
	}

	private static class Holder {
		public static SingletonWithHolder INSTANCE = new SingletonWithHolder();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	// For Serialization
	private Object readResolve() throws ObjectStreamException {
		System.out.println("Read resolved");
		return Holder.INSTANCE;
	}
}
