package salim.test;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	
	private static Random rdm = new Random(); 
	
	static void nbst(String[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] += rdm.nextInt(9);
		}
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		boolean result = false;
		
		
		result = (Boolean) null;

		System.out.println(result);
		
		
		
	
		
		
		
		
		
		

	}

}
