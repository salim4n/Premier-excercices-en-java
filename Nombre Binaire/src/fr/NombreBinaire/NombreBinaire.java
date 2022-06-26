package fr.NombreBinaire;

import java.util.Scanner;

public class NombreBinaire {

	public static void main(String[] args) {
		System.out.println("#################################################");
		System.out.println("#######    TP REPRESENTATION BINAIRE    #########");
		System.out.println("#################################################");
		System.out.println();


		int nombreSaisi = -1;
		String nombreBinaire = "";
		Scanner sc = new Scanner(System.in);
		

		while (nombreSaisi < 0 || nombreSaisi > 256) {
			System.out.println("Saisir un nombre entre 0 et 256");
			nombreSaisi = sc.nextInt();
		}
		
		do {
			int reste = nombreSaisi % 2;
			nombreBinaire = reste + nombreBinaire;
			nombreSaisi = (nombreSaisi - reste) / 2;


		} while(nombreSaisi != 0);
		
		System.out.println("La representation binaire est : " + nombreBinaire);


		sc.close();

	}

}
