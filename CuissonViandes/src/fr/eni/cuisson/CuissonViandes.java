package fr.eni.cuisson;

import java.util.Scanner;

public class CuissonViandes {

	public static void main(String[] args) {
		 
		/* Creer un algo qui aide aux temps de cuisson
		 selon le type de viande, son poids ansi que la texture voulu. la duree est en seconde. */
		 
		 int viande;
		 int poids;
		 final int BOEUF = 1;
		 final int BLEU = 1;
		 final int BIEN_CUIT = 3;
		 final double BLEU_B = 10/500;
		 final double A_PT_B = 17/500;
		 final double B_CU_B = 25/500;
		 int cuisson;
		 double coef;
		 final int AGNEAU = 2;
		 final int A_POINT = 2;
		 final double UNE_MINUTE = 60;
		 final double BLEU_A = 15/400;
		 final double A_PT_A = 25/400;
		 final double B_CU_A = 40/400;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Viande?");
		 System.out.println(BOEUF + "-Boeuf");
		 System.out.println(AGNEAU + "-Agneau");
		 viande = scanner.nextInt();
		 System.out.println("Cuisson?");
		 System.out.println(BLEU + "-Bleu");
		 System.out.println(A_POINT + "A point" );
		 System.out.println(BIEN_CUIT + "Bien cuit");
		 cuisson = scanner.nextInt();
		 System.out.println("Quelle est le poids de votre viande?");
		 poids = scanner.nextInt();
		 
		 if (viande == BOEUF) {
			switch (cuisson) {
			case BLEU :
				coef = BLEU_B;
				break;
			case A_POINT :
				coef = A_PT_B;
			default:
				coef = B_CU_B;
				break;
			}
		} else {
			switch (cuisson) {
			case BLEU :
				coef = BLEU_A;
				break;
			case A_POINT :
				coef = A_PT_A;
			default:
				coef = B_CU_A;
				break;
			}
		
		 
		 System.out.println("Le temps de cuisson est de " + poids + coef * UNE_MINUTE + "secondes");
			 
		 scanner.close();
		 
		 
		}
	}

	}
