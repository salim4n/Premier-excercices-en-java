package fr.eni.depot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepotDeCheque<T> {
	
	  
	
		static int stop = 1;
		static int cheque;
		static Scanner scan =  new Scanner(System.in);
		static Scanner scanStop = new Scanner(System.in);
		static int compteur = 0;

		
	 
	 public static  void depot(List<Integer> t ) {
		 
		 List<Integer>t = null;
		 
			while (stop == 1) {
				cheque = scan.nextInt();
				System.out.println("cheques de  " + cheque + " bien recu.");
				System.out.println("pour continuer faites le 1 ou le 2 pour sortir.");
				compteur ++;
				t.add(cheque);
				stop = scanStop.nextInt();
			};
			System.out.printf("Vous avez depose %s cheques. ",compteur);
			System.out.println("Voici les montants" + t);
			System.out.println("Merci d'avoir utilise nos services. A bientot .");
			scan.close();
			scanStop.close();
	 }
	

	public static  void main(String[] args) {
		
		List<Integer>total = new ArrayList<>();

	depot(total);
		
		

	}

}
