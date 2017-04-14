package laziness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
		System.out.println();
		System.out.println();
		
		// nested stream 
		List<String> alphabet = Arrays.asList("a|A","b|B","c|C","d|D");
		String toLowerCase = alphabet.stream()
		.map(s -> Arrays.asList(s.split("|")))
		.flatMap(i -> i.stream())
		.collect(Collectors.toList())
		.stream()
		.filter(l -> l.matches("[a-z]"))
		.sorted( (a1, a2) -> Integer.compare(String.valueOf(a2).codePointAt(0),String.valueOf(a1).codePointAt(0))) 
		.collect(Collectors.joining("|"));
		System.out.println("[reversed lowerCase]");
		System.out.println(toLowerCase);

	}
}
