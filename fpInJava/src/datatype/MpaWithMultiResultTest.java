package datatype;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class MpaWithMultiResultTest {

	@Test
	public void maps_success() {
		Map<String, Object> result = MapWithMultiResult.divide(4,  2);
		assertEquals(2.0,  (Double)result.get("answer"), 0.1);
	}
	
	@Test
	public void maps_failure() {
		Map<String, Object> result = MapWithMultiResult.divide(4, 0);
		assertEquals("div by zero",((Exception) result.get("exception")).getMessage());
	}
}
