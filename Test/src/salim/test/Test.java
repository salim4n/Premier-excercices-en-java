package salim.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class Test {
	
	private static Random rdm = new Random(); 
	
	private static String shuffle(String phrase) {
	    String[] words = phrase.split("\\s+");
	    StringBuilder builder = new StringBuilder();
	    for (String word : words) {
	        List<Character> letters = new ArrayList<Character>();
	        for (char letter : word.toCharArray()) {
	            letters.add(letter);
	        }
	        if (letters.size() > 2) {
	            Collections.shuffle(letters.subList(1, letters.size() - 1));
	        }
	        for (char letter : letters) {
	            builder.append(letter);
	        }
	        builder.append(" ");
	    }
	    return builder.toString();
	}
	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		String mot = "";
		String mot2 = "";
		String phrase = "ecrire un programme melangeur de mot";
	
		
		
		shuffle(phrase);
		System.out.println(phrase);
		
		
		
		
		
		
		
		
		
		

	}



}
