public class GrainsDeRiz {

	public static void main(String[] args) {

		
		float[][] echiquier = new float[8][8];
		float total = 0;
		float grains = 0;

		for(int ligne=7; ligne >= 0; ligne--)
		{
			for(int col=0; col<=7; col++)
			{
				if((ligne < 7) || (col > 0)) grains *= 2;
				else grains = 1;
				echiquier[ligne][col] = grains;
				total += grains;
			}
		}
		
		afficherEchiquier(echiquier);
		System.out.println("Total : " + total);
	}
	
	public static void afficherEchiquier(float[][] echiquier)
	{
		for(int ligne=7; ligne >= 0; ligne--)
		{
			for(int col=0; col<=7; col++)
			{
				System.out.println(ligne + " x " + col + " = " + echiquier[ligne][col]);
			}
		}
		System.out.println("--------");
	}

}
