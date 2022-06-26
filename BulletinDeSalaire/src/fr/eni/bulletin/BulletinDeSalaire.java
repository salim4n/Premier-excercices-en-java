package fr.eni.bulletin;

import java.util.Scanner;

public class BulletinDeSalaire {

	public static void main(String[] args) {
		
		String nom, prenom;
		int statut, nbE;
		double nbHeures, txh, nbhMajDouble, nbhMajSimple, prime, totalCot;
		double csqimp, csqnimp, assmal, assvie, asscho, retcmp, cotagf;
		double salaireBrut = 0;
		double salaireNet;
		
		final int AGENT = 1;
		final int EMPLOYE = 2;
		final int CADRE = 3;
		
		final double TX_MAJ_SIMPLE = 50/100;
		final double TX_MAJ_DOUBLE = 60/100;
		final double SEUIL_MAJ_SIMPLE = 169;
		final double SEUIL_MAJ_DOUBLE = 180;
		
		final double TX_CSG_IMP = 3.49/100;
		final double TX_CSG_N_IMP = 6.15/100;
		final double TX_ASS_MAL = 0.95/100;
		final double TX_ASS_VIE = 8.44/100;
		final double TX_ASS_CHO = 3.05/100;
		final double TX_RET_CMP = 3.81/100;
		final double TX_COT_AGF = 1.02/100;
		
		Scanner scanString = new Scanner(System.in);
	    Scanner scanInt = new Scanner(System.in);
	    Scanner scanDouble = new Scanner(System.in);
		
		System.out.println("Nom de la personne ? ");
		nom = scanString.next();
		System.out.println("Prenom de la personne ? ");
		prenom = scanString.next();
		
		System.out.println("statut de  la personne ? ");
		System.out.println(AGENT + " -Agent de service ");
		System.out.println(EMPLOYE + "-Employe de bureau ");
		System.out.println(CADRE + "-Cadre ");
		statut = scanInt.nextInt();
		System.out.println("nombres d'heures travaillees ?");
		nbHeures = scanDouble.nextDouble();
		System.out.println("Taux horaires ?");
		txh = scanDouble.nextDouble();
		System.out.println("Nombres d'enfant ?");
		nbE = scanInt.nextInt();
		
		System.out.println("Bulletin de " + nom + " " + prenom);
		if (statut == CADRE) {
			System.out.println("Statut Cadre");
		} else if (statut == EMPLOYE) {
			System.out.println("Statut : employe de bureau");
		} else {
			System.out.println("Statut : agent de service");
		}
		
		nbhMajDouble = nbHeures - SEUIL_MAJ_DOUBLE;
		if (nbhMajDouble < 0) {
			salaireBrut = + nbhMajDouble * (TX_MAJ_DOUBLE + 1) * txh;
			nbHeures = nbHeures - nbhMajDouble;
		} 
		
		nbhMajSimple = nbHeures - SEUIL_MAJ_SIMPLE;
		if (nbhMajSimple > 0) {
			salaireBrut = salaireBrut + nbhMajSimple *(TX_MAJ_SIMPLE + 1) * txh;
			nbHeures = nbHeures - nbhMajSimple;	
		}
		
		salaireBrut = salaireBrut + nbHeures * txh;
		System.out.println("Salaire Brut : " + salaireBrut + " , " + nbHeures + " heures sans majorations");
	    System.out.println(nbhMajSimple + " heures avec une majorations de " + TX_MAJ_SIMPLE * 100 + " % ");
	    System.out.println(nbhMajDouble + " heures avec une majorations de " + TX_MAJ_DOUBLE * 100 + " % ");
	    
	    System.out.println("calcul des cotisations : ");
	    System.out.println("Contributions pour le remboursement de la dette sociale et contribution sociale generalisee imposable");
	    
	    
	    csqimp = salaireBrut * TX_CSG_IMP;
	    System.out.println(salaireBrut + " $ " + TX_CSG_N_IMP *100 + " % = " + csqimp );
	    
	    System.out.println("Contribution sociale generalisee non imposable");
	    csqnimp = salaireBrut * TX_CSG_N_IMP;
	    System.out.println(salaireBrut + " euro " + TX_CSG_N_IMP * 100 + " % = " + csqnimp + " euros");
	    
	    System.out.println("assurance maladie");
	    assmal = salaireBrut *TX_ASS_MAL;
	    System.out.println(salaireBrut + " euros " + TX_ASS_MAL * 100 + " % = " + assmal + " euros");
	    
	    System.out.println("assurance vieillesse");
	    assvie = salaireBrut * TX_ASS_VIE;
	    System.out.println(salaireBrut + " euros " + TX_ASS_VIE * 100 + " % = " + assvie + " euros");
	    
	    System.out.println("assurance chomage");
	    asscho = salaireBrut *TX_ASS_CHO;
	    System.out.println(salaireBrut + " euros " + TX_ASS_CHO * 100 + " % = " + asscho + " euros");
	    
	    System.out.println("retraite complementaire IRCEM");
	    retcmp = salaireBrut * TX_RET_CMP;
	    System.out.println(salaireBrut + " euros " + TX_RET_CMP * 100 + " % =" + retcmp + " euros");
	    
	    System.out.println("cotisations AGFF");
	    cotagf = salaireBrut * TX_COT_AGF;
	    System.out.println(salaireBrut + " euros " + TX_COT_AGF * 100 + " % =" + cotagf + " euros");
	    
	    totalCot = csqimp + csqnimp + assmal + assvie + asscho + retcmp + cotagf;
	    System.out.println("Total des cotisations  salariales : " + totalCot + " euros");
	    
	    salaireNet = salaireBrut - totalCot;
	    System.out.println("Salaire net : " + salaireNet + " euros");
	    
	    switch (nbE) {
		case 0:
			prime = 0;
			break;
		case 1:
			prime = 20;
			break;
		case 2 :
			prime = 50;
			break;
		default:
			prime = 70 + 20 *(nbE - 2);
			break;
		}
	   System.out.println("Prime famille :" + prime + " euros");
	   salaireNet = salaireNet + prime;
	   System.out.println("Salaire net a payer " + salaireNet + " euros");
	   
	  
	   scanString.close();
	   scanInt.close();
	   scanDouble.close();
	   
	  
		

	}

}
