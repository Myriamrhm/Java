import java.util.Scanner;

public class Ristournes {

	public static void main(String[] args) {
		
		System.out.println("Tu veux combien de jeans?");
		
		Scanner clavier = new Scanner(System.in);
		
		int Quantite = clavier.nextInt();
		int jean = 15;
		
		int prixTotal = jean * Quantite;
		double dix = prixTotal * 9 /10;
		double trente = prixTotal * 7 /10;
		double cinquante = prixTotal * 5 / 10;
		double prix;
		
		if(Quantite < 2) {
			prix = prixTotal;
		}
		
		if(Quantite >= 2 && Quantite < 5) {
			prix =dix;
			System.out.println("Prix avec reduction de 10% "+prix+" € pour une quantite de "+Quantite);
		}
		
		if(Quantite >= 5 && Quantite < 10) {
			prix =trente;
			System.out.println("Prix avec reduction de 30% "+prix+" € pour une quantite de "+Quantite);
		}
		
		if(Quantite >=10) {
			prix =cinquante;
			System.out.println("Prix avec reduction de 50% "+prix+" € pour une quantite de "+Quantite);
		}

		
		
		
		

	}

}
