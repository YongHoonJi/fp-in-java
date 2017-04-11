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
		System.out.println(notcached.sumOfFactors(new Integer(999999999)));
		System.out.println(notcached.sumOfFactors(new Integer(999999999)));
		stopwatch.stop(); // optional
		System.out.println("Elapsed time - " + stopwatch.elapsed(TimeUnit.SECONDS));		
	}
}
