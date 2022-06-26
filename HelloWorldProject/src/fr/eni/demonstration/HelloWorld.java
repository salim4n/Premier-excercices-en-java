package fr.eni.demonstration;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

	static Scanner scan = new Scanner(System.in);
	
	public static void fillTabAlea( int[] a) {
		
		for (int i = 0; i < a.length ; i++) {
			
			a[i] = (int)(Math.random() * 100); 
		}
		}
	
	public static void callScanTab(int[]a,int i ) {
		System.out.println("choisissez l'index de votre tableau, index de votre tableau : " + a.length);
		          int x = a[i];
		          x = scan.nextInt();
		          System.out.println("maintenant choisissez la valeur de cette index.");
	              a[x] = scan.nextInt();
	              
	              
	              
	}
	
	public static void callTab(int[] a) {
		System.out.println("#################################################");
		System.out.println(Arrays.toString(a));
		System.out.println("#################################################");
	}

	public static void main(String[] args) {
		
		int[] tab;
		int valeur = 0;
		tab  = new int[10];
		int[] tabDeux = {12,56,87,45};
		
		callTab(tab);
		Arrays.fill(tab, 6);
		callTab(tab);
		fillTabAlea(tab);
		callTab(tab);
		System.out.println(Arrays.binarySearch(tabDeux, 87));
		callTab(tabDeux);
		Arrays.sort(tabDeux);
		Arrays.sort(tab);
		callTab(tab);
		callTab(tabDeux);
		callScanTab(tab,valeur );
		callTab(tab);
		Arrays.sort(tab);
		callTab(tab);
		
		
	
}


	
}
