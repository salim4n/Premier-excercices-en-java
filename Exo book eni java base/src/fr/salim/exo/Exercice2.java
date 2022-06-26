package fr.salim.exo;

import java.util.Random;

public class Exercice2 {
	


	


	public static void main(String[] args) {
		
	                
		               
		            	  int nb1 = 0;
		            	  int nb2 = 0;
		            	  int nb3 = 0;
		            	  int compte = 0;
		            	  do {
		            	  nb1 += Math.random() * 1000;
		            	  nb2 += Math.random() * 1000;
		            	  nb3 += Math.random() * 1000;
		            	  compte++;
		            	  System.out.println("nb1 = " +nb1+ " nb2 = " +nb2+ " nb3 = " +nb3);
		            	 } while(nb1 % 2==1 || nb2 % 2==1 || nb3 % 2==0);
		            	  System.out.println("resultat obtenu en " +compte+ " essais.");
		   
		          
		            	           
	}
	
	}

	

