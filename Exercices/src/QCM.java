import java.util.Scanner;

public class QCM {

	public static void main(String[] args) {
		
		System.out.println("Salut, bienvenu dans mon Qcm! :D"+"\n");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Combien font 4x5 ?");
		
		int taRéponse = clavier.nextInt();
		
		if(taRéponse == 20){
			System.out.println("Correct");
		}
		else {
			System.out.println("Faux. C'était 20");
		}
		
		
		System.out.println("\n A partir de quel age peut-on boire de l'alcool aux USA?");
		int autreRéponse = clavier.nextInt();
		
		if(autreRéponse == 21) {
			System.out.println("Correct");
		}else {
			System.out.println("Faux. C'était 21.");
		}
		
		System.out.println("\n En quelle année Elvis a t-il chanté pour la première fois Blue Suede Shoes?" );
		int troisRéponse = clavier.nextInt();
		
		if(troisRéponse == 1956){
			System.out.println("Correct");
		}
		else {
			System.out.println("Faux! C'était en 1956");
		}
		
		
		
		System.out.println("\n Le Qcm est fini. Merci d'avoir participé! ;)");
	clavier.close();
	}

}
