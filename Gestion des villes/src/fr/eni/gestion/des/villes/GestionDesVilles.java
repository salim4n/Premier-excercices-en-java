package fr.eni.gestion.des.villes;

import java.util.Arrays;
import java.util.Random;

public class GestionDesVilles {
	
	private static Random rnd = new Random();
	
	static String[] villes = new String[] {
			"Lille",
			"Lens",
			"Amiens",
			"Rouen",
			"Caen",
			"Rennes",
			"Nantes",
			"Niort",
			"Bordeaux",
			"Bayonne",
			"Antibes",
			"Aubagnes"
			};
		
  
	static void randomizeVilles(String[] villes) {
		for (int i = 0; i < villes.length; i++) {
			villes[i] += rnd.nextInt(9);
		}
	}
	
	public static void firstLetter(String[] a ) {
	for (String first : a) {
		if (first.charAt(0) == 'A') {
			System.out.println(first);
			
		}
		
		}
	}
	
/*
	static Object get(String[] t, int i) {
		
		String villeA = t[i];
		System.out.println(villeA);
		return villeA;
	}
	*/
	public static void  affiche(String[] a) {
		System.out.println("#############################################################################");
		System.out.println(Arrays.toString(a));
		System.out.println("#############################################################################");
		
	}


	public static void main(String[] args) {
				
		affiche(villes);
		firstLetter(villes);
		randomizeVilles(villes);
		affiche(villes);
		firstLetter(villes);
		
		
		
			}
			
		}
		
		
		

	
	
	

