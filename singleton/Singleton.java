package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton instance = null;

	private Singleton() {
		if (null == instance) {
			System.out.println("Creating...");
		} else {
			throw new RuntimeException("Can no create, please use getInstance");
		}
	}

	public static Singleton getInstance() {
		// Double Check locking
		if (instance == null) { // Check 1
			synchronized (Singleton.class) {
				if (instance == null) { // Check 2
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	// For Serialization
	private Object readResolve() throws ObjectStreamException {
		System.out.println("Read resolved");
		return instance;
	}
}
