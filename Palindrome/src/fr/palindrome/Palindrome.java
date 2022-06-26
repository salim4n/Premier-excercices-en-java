package fr.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String phrase = "";
		String phraseFormatee = "";
		boolean palindrome = true;
		char[] caracteresPhrase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Veillez saisir une phrase :");
		phrase = sc.nextLine();

		
		phraseFormatee = phrase.replace(" ", "");
	
		phraseFormatee = phraseFormatee.toLowerCase();

	
		caracteresPhrase = new char[phraseFormatee.length()];

		caracteresPhrase = phraseFormatee.toCharArray();


		for (int i = 0; i < caracteresPhrase.length; i++) {
			switch (caracteresPhrase[i]) {
			case 'é':
			case 'è':
			case 'ë':
			case 'ê':
				caracteresPhrase[i] = 'e';
				break;
			case 'à':
			case 'â':
				caracteresPhrase[i] = 'a';
				break;
			case 'ô':
			case 'ö':
				caracteresPhrase[i] = 'o';
				break;
			case 'ù':
			case 'û':
			case 'ü':
				caracteresPhrase[i] = 'u';
				break;
			case 'î':
			case 'ï':
				caracteresPhrase[i] = 'i';
				break;
			}
		}


		if (caracteresPhrase.length % 2 != 0) {

			for (int i = 0; i < (caracteresPhrase.length / 2); i++) {

				if (caracteresPhrase[i] != caracteresPhrase[caracteresPhrase.length
						- (i + 1)]) {
					palindrome = false;
				}
			}
		} else {
			palindrome = false;
		}

		System.out.println("La phrase : ");
		System.out.println(phrase);
		if (palindrome) {
			System.out.println("est un palindrome");
		} else {
			System.out.println("n'est pas un palindrome");
		}
		

		sc.close();


	}

}
