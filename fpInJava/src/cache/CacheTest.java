package cache;

import java.util.HashMap;
import java.util.Map;

public class CacheTest {
	private Map<Integer, Integer> sumCache = new HashMap<Integer, Integer>();
	
	public Integer sumOfFactors(Integer number) {
		if(!sumCache.containsKey(number)) {
			sumCache.put(number, factorsOf(number));
		}
		return sumCache.get(number);
	}
	
	private Integer factorsOf(int number) {
		int sum = 0;
		for(int i=1; i<number; i++){
			if(number % i == 0){
				sum += i;
			}
		}
		return sum;
 	}
	
	public static void main(String[] args) {
		System.out.println(new CacheTest().sumOfFactors(new Integer(10)));
	}
}
