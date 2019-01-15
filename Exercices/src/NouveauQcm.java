import java.util.Scanner;

public class NouveauQcm {

	public static void main(String[] args) {
		
		String réponse;
		String A = "non";
		Scanner Clavier = new Scanner(System.in);
		
		System.out.println("Bienvenu dans mon QCM es-tu pret? :D" );
		
		réponse = Clavier.nextLine();
		
		if(réponse = A ) {
		System.out.print("On y vas quand meme x,) tant pis");
		}
		else {
			System.out.println("Super! C'est partit");
		}
		

	}

}
