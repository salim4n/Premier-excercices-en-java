package fr.melangeur;

import java.util.Random;
import java.util.Scanner;




public class MelangeurDeMots {
	
	private static Random random = new Random();
	
	public static String melangeur(String mot)
	{
		String result = "";
		
		if(mot.length() <= 2) result = mot;
		else
		{
			String retirer = mot.substring(1, mot.length()-1);

			while(retirer.length() >= 2)
			{
				int aleaValue = 1 + random.nextInt(retirer.length() - 1);
				result += retirer.charAt(aleaValue);
				retirer = retirer.substring(0, aleaValue) + retirer.substring(aleaValue+1);
			}
			
			 result = mot.substring(0, 1) + result + retirer + mot.substring(mot.length() - 1);
			
		}
		System.out.println(result);

		return result;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String maPhrase = "le niveau est hardcore a ce module , vive la progammation";
		System.out.println(maPhrase);
		String[] a = maPhrase.split("");
		
		for (String string : a) {
			System.out.println(string);
		}
		//melangeur(a);
		System.out.println();

		
		

	}

}
