package reuse;

import java.util.HashSet;
import java.util.Set;

public class FactorBeta {
	protected int number;
	
	public FactorBeta(int number){
		this.number = number;
	}
	
	public boolean isFactor(int potentioalFactor){
		return number % potentioalFactor == 0;
	}
	
	public Set<Integer> getFactors() {
		HashSet<Integer> factors = new HashSet<>();
		for(int i=1; i<=Math.sqrt(number); i++){
			if(isFactor(i)) {
				factors.add(i);
				factors.add(number / i);
			}
		}
		
		return factors;
	}

}
