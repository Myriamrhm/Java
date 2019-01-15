package eval.prairie.exo3;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		
		System.out.println("Tappez une commande parmi n, h, d et q");
		Scanner clavier = new Scanner(System.in);
		String input = clavier.nextLine();
		String nom;
		
		switch(input) {
		case "n":
			String nom = clavier.nextLine();
		break;
		
		case "h":
			System.out.println("Hello "+nom);
		break;
		
		case "d":
			System.ClockFactory.getDatetime();
		break;
		
		case "q":
			System.exit(0);
		break;
		
		default:
			System.out.println("Erreur");
		
		}
		
	}

}
