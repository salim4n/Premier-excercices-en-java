package fr.eni.echiquier.de.sissa;

public class EchiquierDeSissa {

	public static void main(String[] args) {
		short nbCases = 64;
		float grainDeRiz = 1f;

		System.out.println(multiplierPar2(grainDeRiz, nbCases));
		
	}
	
	static float multiplierPar2(float a, short b) {
		
		for (int i = 0; i < b; i++) {		
			a *= 2;
		}
		return a;

	}

	
		
	}


