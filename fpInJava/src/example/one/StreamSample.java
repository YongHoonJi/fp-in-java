package example.one;

import java.util.Arrays;
import java.util.List;

public class StreamSample {
	
	public static void main(String[] args) {
		List<String> number = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		
		// single 
		System.out.println("[Start single thread]");
		number.stream().map(s -> Integer.parseInt(s)).forEach(i -> {
			System.out.print(i+" | ");
		});
		
		System.out.println("\n\n[Start multi thread]");
		// parallel
		number.parallelStream().map(s -> Integer.parseInt(s)).forEach(i -> {
			System.out.print(i+" | ");
		});

	}
}
