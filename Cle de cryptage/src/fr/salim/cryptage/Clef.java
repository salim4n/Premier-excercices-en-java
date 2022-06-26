package fr.salim.cryptage;



public class Clef {

	public static void main(String[] args) {
		
		char[][] tableau = new char[26][26];
		
		
		for (int ligne = 0; ligne < 26; ligne++) {
			for (int col = 0; col < 26; col++) {
				int codeLettre = ((col + ligne) % 26) + 65;
				tableau[ligne][col] = (char) codeLettre;
				//System.out.print(tableau[ligne]);
				//System.out.print(tableau[col]);
				}
			}
		
		char[][] ascii = new char[10][10];
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10 ; i++) {
				int d = '#';
				d =  (i + j );
				
				
			}
			
		}
		
		
		
		
		
	}
}
		
		/*
		int[][] myNumbers = new int[10][6];
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	    	  myNumbers.g
	    	 System.out.println(myNumbers[i][j]);	
	    	 
	    	
	      }
	      
	
	      
	    
	    }
		
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (String i : cars) {
	      System.out.println(i); }  */
	    
	    
	    

	
	
			

		
		
	
		
		

	
