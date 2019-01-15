import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int tonAge = clavier.nextInt();
		
		if (tonAge >= 18) {
			System.out.println("Tu peux voter ! ");
		}
		
		else {
			System.out.println("Tu ne peux pas voter, tu es trop jeune.");
		}

	}

}
