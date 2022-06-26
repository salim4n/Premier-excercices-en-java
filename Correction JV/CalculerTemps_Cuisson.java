/**
 * 
 */
package tp1_cuisson;

import java.util.Scanner;

/**
 * @author bmartin
 *
 */
public class CalculerTemps_Cuisson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Indique le temps de cuisson
		int viande, cuisson, poids;
		float coefficient = 0.0f;
		final byte BOEUF = 1;
		final byte PORC = 2;
		final byte BLEU = 1;
		final byte A_POINT = 2;
		final byte BIEN_CUIT = 3;
		final byte UNE_MINUTE = 60;
		final float BLEU_B = (float)(10.0/500.0);
		final float A_PT_B = (float)(17.0/500.0);
		final float B_CU_B = (float)(25.0/500.0);
		final float BLEU_P = (float)(15.0/400.0);
		final float A_PT_P = (float)(25.0/400.0);
		final float B_CU_P = (float)(40.0/400.0);
		
		Scanner sc = new Scanner(System.in);

		//saisie des informations
		System.out.println("Viande ?"); // Choix du type de viande
		System.out.println(BOEUF + " – Boeuf");
		System.out.println(PORC + " – Porc");
		viande = sc.nextInt();
		System.out.println("Cuisson ?"); // Choix du type de cuisson
		System.out.println(BLEU + " – Bleu");
		System.out.println(A_POINT + " – A point");
		System.out.println(BIEN_CUIT + " – Bien cuit");
		cuisson = sc.nextInt();
		System.out.println("Poids en gramme ?"); // Choix du poids de la viande
		poids = sc.nextInt(); 
		
		//traitement du calcul
		switch(viande){
		case BOEUF:
			if (cuisson == BLEU)
				coefficient = BLEU_B;
			else if (cuisson == A_POINT)
				coefficient = A_PT_B;
			else
				coefficient = B_CU_B;	
			break; //sortir du cas BOEUF
		case PORC:
			if (cuisson == BLEU) 
				coefficient = BLEU_P;	
			else if (cuisson == A_POINT)
					coefficient = A_PT_P;
				else
					coefficient = B_CU_P;
			break; //sortir du cas PORC
		}
			
		//affichage du résultat
		System.out.println("Le temps de cuisson est de " + (poids * coefficient * UNE_MINUTE) + " secondes");

		sc.close();
	}

}
