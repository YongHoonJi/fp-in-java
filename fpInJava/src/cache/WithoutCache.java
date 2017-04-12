package cache;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class WithoutCache {

	public Integer sumOfFactors(Integer number) {
		return factorsOf(number);
	}

	private Integer factorsOf(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Stopwatch stopwatch = Stopwatch.createStarted();
		WithoutCache notcached = new WithoutCache();
		int limit = 40000;
		for(int i=0 ;i<=limit; i++){
			notcached.sumOfFactors(i);
		}
		for(int i=0 ;i<=limit; i++){
			notcached.sumOfFactors(i);
		}
		stopwatch.stop(); // optional
		System.out.println("Elapsed time - " + stopwatch.elapsed(TimeUnit.SECONDS));		
	}
}
