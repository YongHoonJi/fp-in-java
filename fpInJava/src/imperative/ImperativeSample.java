package imperative;

import java.util.Arrays;
import java.util.List;

public class ImperativeSample {
	public String cleanNames(List<String> listOfNames) {
		StringBuilder result = new StringBuilder();
		// for는 명령형프로그래밍의 전형적인 예. 초기화 후 값을 설정 그리고 되풀
		for(String name:listOfNames) {
			if(name.length() > 1){
				result.append(capitalizeString(name)).append(",");
			}
		}
		return result.substring(0, result.length() -1).toString();
	}

	public String capitalizeString(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
	}
	
	public static void main(String[] args) {
		List<String> listOfNames = Arrays.asList("jack", "paul", "alto", "nick");
		ImperativeSample sample = new ImperativeSample();
		String concatnatedList = sample.cleanNames(listOfNames);
		System.out.println(concatnatedList);
	}
}

