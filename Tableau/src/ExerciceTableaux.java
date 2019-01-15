import java.util.Arrays;

public class ExerciceTableaux {

	public static void main(String[] args) {
		
		int[] tableauint = {100, 44, 70 };
		Arrays.sort(tableauint);
		System.out.print(tableauint[0]+" "+tableauint[1]+" "+tableauint[2]);
		
		String[] tableauS = {"a", "c", "b", "a"};
		Arrays.sort(tableauS);
		System.out.print ("\n"+tableauS[0]+" "+tableauS[1]+" "+tableauS[2]+" "+tableauS[3]);
		
		for (int j = 0; j < tableauint.length; j++){
		System.out.print("\n\n"+"Ceci est le tour de boucle numéro"+ j);

	}

}
}
