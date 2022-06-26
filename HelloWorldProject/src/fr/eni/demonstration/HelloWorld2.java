package fr.eni.demonstration;

import java.util.Scanner;

public class HelloWorld2 {
	
	private final static String VERT = "vert";
	private final static  String JAUNE = "jaune";
	private final static String BLEU = "bleu";
	private final static String ROUGE = "rouge";
	static Scanner scan = new Scanner(System.in);
	static int saisie;
	
	
	public static void messageQuote(String message ) {
		System.out.println("############################################");
		System.out.println(message);
		System.out.println("############################################");
	}
	
	public static void messageQ(String message ) {
		
		System.out.println(message);
		System.out.println("############################################");
	}
		
	
	public static void compterMoutons() {
		for (int i  = 1; i <= 25 ; i ++) {
			System.out.println(i + "moutons");
		}
	}
	
	public static void choixColor() {
		System.out.println(VERT);
		System.out.println(JAUNE);
		System.out.println(BLEU);
		System.out.println(ROUGE);
	}

	public static void main(String[] args) {
		
		messageQuote("bonjour");
		
		messageQ("bienvenue dans le menu");
		while (saisie != 3) {
		messageQ("faites un choix");
		messageQ("-1 pour choix couleurs");
		messageQ("-2 pour comptine moutons");
		messageQ("-3 pour nous quitter a jamais...");
		saisie = scan.nextInt();
			
		if (saisie == 1) {
			choixColor();
		} else if (saisie == 2) {
			compterMoutons();
		}
	} 
		scan.close();
	
						
}
}

