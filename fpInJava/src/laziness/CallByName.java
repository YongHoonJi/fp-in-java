package laziness;

public class CallByName {

	public static void main(String[] args) {
		int o = 11;
		changeValue(o);
		System.out.println("main :"+o);
	}
	
	public static void changeValue(int i){
		i = 1234;
		System.out.println("subroutine :"+i);
	}
}
