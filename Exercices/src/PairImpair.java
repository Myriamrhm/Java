import java.util.Scanner;

public class PairImpair {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int ceNombre = clavier.nextInt();
		
				
		if(ceNombre % 2 == 0) {
			System.out.println("Ton nombre est paire");
		}
		else {
			System.out.println("Ton nombre est impair");
		}
		
		
		if(ceNombre >= 0) {
			System.out.println("Ton nombre est positif");
		}
		else {
			System.out.println("Ton nombre est négatif");
		}

}
}
