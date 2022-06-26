package fr.salim.exo;

import java.util.Scanner;


public class Exercice3 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int nbEssais = 0;
	static int nbSaisie;
	static int  nb1 =(int)(Math.random()*1000);
	
	public  static void affiche(String a) {
		System.out.println("#######################################################");
	    System.out.println("######## Trouver le nombre mystere!!!! ################");
	    System.out.println("######## Compris entre 1 et 1000 !!!!  ################");
	    System.out.println("#######################################################");
	}
	
	public static void go() {
		
	    do {
	    	nbSaisie = scan.nextInt();
	    	nbEssais ++;
	    	
	    	if(nbSaisie < nb1) {
	    		System.out.println("c'est plus!!!");
	    	} else if (nbSaisie > nb1) {
	    		System.out.println("c'est moins!!!");
	    	}else {
	    		System.out.println("felicitations tu as trouve !!!!");
	    	}
                } while(nbSaisie != nb1);
	    System.out.println("Tu as trouve en " +nbEssais+ " essaies.");
       }

	public static void main(String[] args) {
		
	
	       affiche(null);
	       go();
	       
	
		    

	}

}
