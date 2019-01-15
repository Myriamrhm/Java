package eval.prairie.exo2;

import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {
		
		int ceNombre = clavier.nextInt();
		int [] tableau;
		Random().nextInt(tableau);
		
		Arrays.sort(tableau);
		
		for (i=0; i < tableau.length; i++)
		
		if(ceNombre % 2 == 0) {
			System.out.println("ce nombre est paire");
		}
		else if(ceNombre % 8 == 0){
			System.out.println("ce nombre est divisible par 8");
			
		}

	}

}
