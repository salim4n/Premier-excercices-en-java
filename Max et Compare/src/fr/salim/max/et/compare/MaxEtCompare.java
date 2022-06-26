package fr.salim.max.et.compare;

import java.util.Scanner;

public class MaxEtCompare {
	
	
	public static void max(int a, int b) {
		String c;
		
		if(a < b) {
			c = (a + " est superieur a " + b);
			System.out.println(c);
			
		}else {
			c =(b + " est superieur a " + a);
			System.out.println(c);
		}
	}
	
	public static  int compare(int a, int b, int c)  {
		
		if(a == b) {
			c = (0);
			System.out.println(c);
			
		}else if (a > b) {
			c =(1);
			System.out.println(c);
		} else {
			c = (-1);
			System.out.println(c);
		}
		return c;
	}

	public static void main(String[] args) {
		int choix = 0;
		int nombre1;
		int nombre2;
		int comparer = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("######################################");
		System.out.println("Bienvenue a max et compare!!!");
		System.out.println("######################################");
		System.out.println("Saisir nombre 1 : ");
		nombre1 = scan.nextInt();
		System.out.println("######################################");
		System.out.println("Saisir nombre 2 : ");
		nombre2 = scan.nextInt();
		System.out.println("######################################");
		System.out.println("pour comparer faites le 1, pour avoir le max faites le 2 .");
		System.out.println("######################################");
		choix = scan.nextInt();
		
		if (choix == 1) {
			compare(nombre1, nombre2, comparer);
			System.out.println(comparer);
		} else if (choix == 2) {
			max(nombre1, nombre2);
			
		} else {
			System.out.println("Veuillez taper 1 ou 2 !!!!!!");
		}
		scan.close();
		} 

		
		
		
		
	}


