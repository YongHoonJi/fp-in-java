import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Algo {
	final static int[] arr = { 1,2,3,4,5,6,7,8 };
	final static Map<String, String> relations = new HashMap<>();
	static List<List<Integer>> permutationList = new ArrayList<List<Integer>>();  
	
	public static void main(String[] args) {
		relations.put("a", "b,e,g");
		relations.put("b", "a,c,e,f,g,h");
		relations.put("c", "b,d,e,f,g,h");
		relations.put("d", "c,f,h");
		relations.put("e", "a,b,c,f");
		relations.put("f", "b,c,d,e");
		relations.put("g", "a,b,c,h");
		relations.put("h", "b,c,d,g");
		
		perm(arr, 0);
		
		System.out.println(permutationList.size());
		for(List<Integer> nums: permutationList){
			Map<String, Integer> nodes = getNodeVal(nums);
			//System.out.println(nodes);
			//System.out.println("check list : "+nums);
			boolean isValid = true;
			for(String k: relations.keySet()){
				Integer preNode = nodes.get(k);
				String relation = relations.get(k);
				
				List<String> relArr = Arrays.asList(relation.split(","));
				
				for(String bs:relArr){
					//System.out.println("compare " + k + ":" + relArr);
					Integer b = nodes.get(bs);
					if(isAdjacent(preNode, b)){
						//System.out.println("compare(Int) : " + preNode +":" + b);
						isValid = false;
					}
				}
			}
			
			if(isValid){
				System.out.println(nums);
			}
			
		}
	}
	
	static Map<String, Integer> getNodeVal(List<Integer> nl) {
		Map<String, Integer> nodes = new HashMap<>();
		for(int inx=0; inx<nl.size(); inx++){
			if(inx == 0) nodes.put("a", nl.get(0));
			if(inx == 1) nodes.put("b", nl.get(1));
			if(inx == 2) nodes.put("c", nl.get(2));
			if(inx == 3) nodes.put("d", nl.get(3));
			if(inx == 4) nodes.put("e", nl.get(4));
			if(inx == 5) nodes.put("f", nl.get(5));
			if(inx == 6) nodes.put("g", nl.get(6));
			if(inx == 7) nodes.put("h", nl.get(7));
		}
		
		return nodes;
	}
	
	public static boolean isAdjacent(Integer a, Integer b){
		// minus
		if( a - 1 == b && a - 1 != 0) {
			return true;
		}
		
		// plus
		if(a + 1 == b && a + 1 != 8) {
			return true;
		}
		
		return false;
		
	}
	
	
	public static void perm(int[] arr, int pivot) {
		if (pivot == arr.length) {
			permutationList.add(toList(arr));
			return;
		}
		for (int i = pivot; i < arr.length; i++) {
			swap(arr, i, pivot);
			perm(arr, pivot + 1);
			swap(arr, i, pivot);
		}
	}
	
	public static List<Integer> toList(int[] arr){
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			l.add(new Integer(arr[i]));
		}
		
		return l;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
}
