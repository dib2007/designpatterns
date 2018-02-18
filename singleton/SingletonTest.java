package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException, CloneNotSupportedException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		print("s1", s1);
		print("s2", s2);

		// Reflection
		Class clazz = Class.forName("singleton.Singleton");
		Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		//Singleton s3 = constructor.newInstance();
		//print("s3", s3);

		// Serialization
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:\\dev\\workspace\\designpatterns\\src\\singleton\\s2.ser"));
		oos.writeObject(s2);

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("E:\\dev\\workspace\\designpatterns\\src\\singleton\\s2.ser"));
		Singleton s4 = (Singleton) ois.readObject();
		print("s4", s4);
		// Cloning
		//Singleton s5 = (Singleton) s2.clone();
		//print("s5", s5);

		// Multitreading

		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(SingletonTest::useSingleton);
		service.submit(SingletonTest::useSingleton);
		service.shutdown();
	}

	private static void useSingleton() {
		Singleton singleton = Singleton.getInstance();
		print("Singleton", singleton);
	}

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object %s Hash Code: %d", name, object.hashCode()));
	}
}
