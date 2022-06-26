/**
 * 
 */
package fr.eni.module5;

import java.math.BigInteger;

/**
 * Classe en charge de
 * 
 * @author Julien version TPEchiquierSissa.java v1.0
 * @date 16 juin 2020
 */
public class TPEchiquierSissa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Message d'accueil
		System.out.println("************************************************");
		System.out.println("**********    TP ECHIQUIER DE SISSA    *********");
		System.out.println("************************************************");
		System.out.println();
		
		/****************************************************/
		/* Cette correction propose deux versions possibles */
		/****************************************************/
		
		//Variables valables pour les deux solutions
		int cases = 64;//nb total de cases du plateau d'échec
		
		
		//***************************************************************************
		//SOLUTION 1
		//***************************************************************************
		//Aucun type primitif entier n'est assez grand pour traiter le résultat final
		//Utilisation d'un float qui basculera en puissance 10
		System.out.println("SOLUTION N°1");
		
		
		// Variables de la solution 1	
		float nbGrainsRizS1 = 1f;

		//Boucle sur les 64 cases
		for (int i = 0; i < cases; i++) {
			nbGrainsRizS1 *= 2;
		}

		//Affichage du résultat
		System.out.println("Il y a sur la " + cases + "ème case : " + nbGrainsRizS1 + " grains de riz");
		
		
		
		System.out.println();
		System.out.println("************************************************");
		System.out.println();
		
		
		
		//***************************************************************************
		//SOLUTION 2 
		//***************************************************************************
		//La solution aborde un type de nombre qui n'a pas été vu en cours.
		//Il s'agit du BigInteger apparu dans le JDK1.1.
		//Contrairement aux types primitifs, théoriquement, il n'a pas de limite de taille.
		//A noter qu'il existe aussi le BigFloat.
		//Documentation de référence : https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
		System.out.println("SOLUTION N°2");
		
		// Variables de la solution 2
		// On définit le nombre de grains de riz au commencement 
		BigInteger nbGrainsRizS2 = new BigInteger("1");
		// On définit le multiplicateur
		BigInteger multiplicateur = new BigInteger("2");

		//Boucle sur les 64 cases
		for (int i = 0; i < cases; i++) {
			// L'opération se fait par l'appel à une fonction, ici, multiply.
			// Il en existe une pour chaque opération de base
			nbGrainsRizS2 = nbGrainsRizS2.multiply(multiplicateur);
		}
		
		//Affichage du résultat
		System.out.println("Il y a sur la " + cases + "ème case : " + nbGrainsRizS2 + " grains de riz");

	}
	
}
