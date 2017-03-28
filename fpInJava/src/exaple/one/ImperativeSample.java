package exaple.one;

import java.util.List;

public class ImperativeSample {
	public String cleanNames(List<String> listOfNames) {
		StringBuilder result = new StringBuilder();
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
}
