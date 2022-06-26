package fr.salim.cryptage;

import java.util.Scanner;

public class ClefDeFabien {
	static char [][] table  = new char [26][26] ;		
	public static void main(String[] args) {
		Initialization();
		//Affichage();
		Scanner sca = new Scanner(System.in);
		int choix;
		do {
			System.out.println("1 : Crypter un message ");
			System.out.println("2 : Décrypter un message ");

			choix = sca.nextInt();

		}
		while (choix != 1 && choix != 2) ;	
		switch(choix) {
			case 1 : 
				InCriptrage();break;
			case 2 : 
				DeCriptrage();break;
		}
		

	}

	private static void DeCriptrage() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Saisir le texte à déchiffrez ");
		String texteAcrypte = sca.next();
		System.out.println("Saisir la clé de déchiffrement ");
		String cleCryptage = sca.next();

		texteAcrypte = texteAcrypte.toLowerCase();
		cleCryptage = cleCryptage.toLowerCase();
		
		texteAcrypte = UnCriptrage(texteAcrypte,cleCryptage );
		texteAcrypte = texteAcrypte.toUpperCase();
		System.out.println(texteAcrypte);
		sca.close();
		
	}



	private static String UnCriptrage(String texteAcrypte1, String cleCryptage1) {
		String retour = "" ; 
		while (cleCryptage1.length() <= texteAcrypte1.length()) {
			cleCryptage1 += cleCryptage1;
		}
		for (int i = 0 ; i < texteAcrypte1.length() ; i++) {
			int b = (int) (cleCryptage1.charAt(i) - 97);
			if (texteAcrypte1.charAt(i) == ' ') {retour += " ";}
			else {
				int y = 0;
				while(texteAcrypte1.charAt(i) != table[b][y] ){
					y++ ;
				}
				retour += table[0][y];
			}
		}

		return retour;
	}

	
	
	
	private static void InCriptrage() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Saisir le texte à crypter ");
		String texteAcrypte = sca.next();
		System.out.println("Saisir la clé de cryptage ");
		String cleCryptage = sca.next();
		texteAcrypte = texteAcrypte.toLowerCase();
		cleCryptage = cleCryptage.toLowerCase();
		
		texteAcrypte = Criptrage(texteAcrypte,cleCryptage );
		texteAcrypte = texteAcrypte.toUpperCase();
		System.out.println(texteAcrypte);
		sca.close();
	}
	
	private static String Criptrage(String texteAcrypte1,String cleCryptage1) {
		String retour = "" ; 
		while (cleCryptage1.length() <= texteAcrypte1.length()) {
			cleCryptage1 += cleCryptage1;
		}
		for (int i = 0 ; i < texteAcrypte1.length() ; i++) {
			int a =(int) (texteAcrypte1.charAt(i) - 97);
			int b = (int) (cleCryptage1.charAt(i) - 97);
			if (texteAcrypte1.charAt(i) == ' ') {retour += " ";}
			else {
				retour += table[a][b];
			}
		}
		return retour;
	}



	private static void Affichage() {
		for (int i = 0 ; i < 26 ; i++) {
			for (int y = 0 ; y < 26 ; y++) {
				System.out.print(table[i][y]);
			}
			System.out.println("");
		}

	}
	private static void Initialization() {
		int z = 0 ;
		for (int i = 0 ; i < 26 ; i++) {
			z = i ;
			for (int y = 0 ; y < 26 ; y++) {
				if (z + y > 25 ) {z = i - 26 ;	}
				table[i][y] = (char)(97 + z + y);
			}
		}
		
	}

}
