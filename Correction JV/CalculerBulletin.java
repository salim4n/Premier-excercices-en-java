/**
 * 
 */
package tp2_bulletin_simple;

import java.util.Scanner;

/**
 * @author bmartin
 *
 */
public class CalculerBulletin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calcul un bulletin de salaire
		String nom, prenom;
		byte statut; //1 pour cadre, 2 pour agent de maitrise, 3 pour employe
		float prime, tx;
		byte nbenf;
		short nbheure;
		double base, sal_net, cotis;
		final float RDS = 0.0349f; 
		final float	CSG = 0.0615f; 
		final float	MALADIE = 0.0095f;
		final float	VIEILLESSE = 0.0844f;
		final float	CHOMAGE = 0.0305f;
		final float	RETRAITE = 0.0381f;
		final float	AGFF = 0.0102f;
		final float BASE_LEGAL_HEURE = 169f;
		final float	BASE_LEGAL_MAJORATION = 180f;
		final float	TAUX_MAJORATION_BAS = 0.5f;
		final float	TAUX_MAJORATION_HAUT = 0.6f;
		 	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nom ? ");
		nom = sc.nextLine();
		System.out.print("Prénom ? ");
		prenom = sc.nextLine();
		System.out.print("Statut (1 pour cadre, 2 pour agent de maitrise, 3 pour employe) ? ");
		statut = sc.nextByte();    	
		System.out.print("Nombre d'heures travaillées ? ");
		nbheure = sc.nextShort();
		System.out.print("Taux horaire du salarié ? ");
		tx = sc.nextFloat();
		System.out.print("Nombre d'enfants ? ");
		nbenf = sc.nextByte();

		//calcul salaire brut
		if(nbheure <= BASE_LEGAL_HEURE)
			base = nbheure * tx;
		else if(nbheure < BASE_LEGAL_MAJORATION)
			base = (BASE_LEGAL_HEURE * tx) + 
					((nbheure - BASE_LEGAL_HEURE) * tx * (1 + TAUX_MAJORATION_BAS));
		else
			base = (BASE_LEGAL_HEURE * tx) + 
					((BASE_LEGAL_MAJORATION - BASE_LEGAL_HEURE) * tx * (1 + TAUX_MAJORATION_BAS))
					+ ((nbheure - BASE_LEGAL_MAJORATION) * tx * (1 + TAUX_MAJORATION_HAUT));

		//calcul prime
		switch(nbenf){
		case 0:
			prime = 0;
			break;
		case 1:
			prime = 20;
			break;
		case 2:
			prime = 50;
			break;
		default:
			prime = 70 + ((nbenf - 2) * 20);		
		}

		//calcul cotisation
		cotis = (base * RDS) + ( base * CSG) + ( base * MALADIE) +
	            ( base * VIEILLESSE) + ( base * CHOMAGE) +
	            ( base * RETRAITE) + ( base * AGFF);

		//affichage du bulletin
		sal_net = base + prime - cotis;

		System.out.println("Salarié : " + nom + " " + prenom);
		System.out.println("Salaire de base : " + base + " Euros");
		System.out.println("Cotisations : " + cotis + " Euros");
		System.out.println("Prime : " + prime + " Euros");
		System.out.println("Salaire Net : " + sal_net + " Euros");

		sc.close();
	}

}
