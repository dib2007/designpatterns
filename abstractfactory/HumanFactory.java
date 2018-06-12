package abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class HumanFactory {

	static Map<String, Class<? extends Human>> map = new HashMap<>();

	static {
		map.put("MALE", Male.class);
		map.put("FEMALE", Female.class);
	}

	public static Human getInstance(String type) throws InstantiationException, IllegalAccessException {
		return map.get(type).newInstance();
	}
}
