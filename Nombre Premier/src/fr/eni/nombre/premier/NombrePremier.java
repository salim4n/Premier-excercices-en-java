package fr.eni.nombre.premier;

import java.util.Scanner;

public class NombrePremier {
	
	static Scanner scan = new Scanner(System.in);
	static int nombre;
	static int nombrePremier;
	static int nombrePas;
	static int nombreDiviser; 
	static int nbNarcis; 
	
	public static void info(String message) 
	{
	System.out.println("#######################################################");
	System.out.println(message);
	System.out.println("#######################################################");
	}
	
	public static void choixNb(int a)
	{
		a = scan.nextInt();
		nombreDiviser = a / a;
		nbNarcis = a % 1;
	}
	
	
	public static void main(String[] args) {
		
		info("Quelle nombre est un nombre premier?");
		info("Choissisez un nombre.");
		choixNb( nombre);

		if (nombre == nbNarcis && nombre == nombreDiviser) {
			nombrePremier = nombre;
			System.out.println("Oui! le nombre " + nombrePremier + " est un nombre premier!");
		} else {
			nombrePas = nombre;
			System.out.println("Non! le nombre " + nombrePas + " n'est pas un nombre premier!");
		}
		
		scan.close();
	}
        
}
