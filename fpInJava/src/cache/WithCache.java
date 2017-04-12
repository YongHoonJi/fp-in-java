package cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class WithCache {
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
		Stopwatch stopwatch = Stopwatch.createStarted();
		WithCache cached = new WithCache();
		int limit = 40000;
		for(int i=0 ;i<=limit; i++){
			cached.sumOfFactors(i);
		}
		for(int i=0 ;i<=limit; i++){
			cached.sumOfFactors(i);
		}
		stopwatch.stop(); // optional
		System.out.println("Elapsed time - " + stopwatch.elapsed(TimeUnit.SECONDS));
	}
}
