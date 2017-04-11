package datatype;

import java.util.HashMap;
import java.util.Map;

public class MapWithMultiResult {
	public static Map<String, Object> divide(int x, int y) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (y == 0)
			result.put("exception", new Exception("div by zero"));
		else
			result.put("answer", (double) x / y);

		return result;
	}
}
