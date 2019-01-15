import java.util.Scanner;

public class MenuKeys {

	public static void main(String[] args) {
		
		String input;
		char charAt;
		
		Scanner Clavier = new Scanner(System.in);
		
		System.out.println("A pour afficher");
		System.out.println("Q pour quitter,");
		System.out.println("C pour créer");
		System.out.println("S pour supprimer");
		input = Clavier.nextLine();
		charAt = input.charAt(0);
		
		while(true) {
			switch(charAt) {
			case 'A':
				System.out.println("donnée afficher");
				System.exit(0);
			case 'Q':
				System.out.println("bon vent");
				System.exit(0);
			case 'C':
				System.out.println("donneés créer");
				System.exit(0);
			case 'S':
				System.out.println("donnés supprimer");
				System.exit(0);
			default:
				System.out.println("Erreur: uniquement les lettres A C Q et S");
				System.exit(0);
			
			}
		}
		

	}

}
