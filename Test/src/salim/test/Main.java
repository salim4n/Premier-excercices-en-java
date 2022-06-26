package salim.test;

public class Main {

	public static void main(String[] args) {
		
		Player joueur1 = new Player("daubeny", 200, 30);
		System.out.println("name : " +joueur1.getName());
		System.out.println("vie : " + joueur1.getHealth());
		joueur1.damage(25);
		System.out.println("vie : " + joueur1.getHealth());
		Player joueur2 = new Player("appolyson", 150, 45);
		System.out.println("name : " +joueur2.getName());
		System.out.println("vie : " + joueur2.getHealth());
		joueur2.damage(joueur1.getAttack());
		System.out.println("vie : " + joueur2.getHealth());
		

	}

}
