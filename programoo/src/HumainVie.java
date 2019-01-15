import java.util.ArrayList;

import collections.Animal;
import collections.Chat;

public class HumainVie {

	public static void main(String[] args) {
		
		//idk
		static Humain marion = null;
		static Humain jo = null;
		
		static Humain myriam = new Humain();
		static Humain jonathan = new Humain();
		static Humain alex = new Humain();
		
		//créer des objets
		marion = new Humain("Marion");
		jo = new Humain("Jo");
		
		myriam.afficherLesEtats();
	}
		
	public static void matin(Humain myriam) {
		if(myriam.besoins > 40) {
			System.out.println("J'ai besoin de faire mes besoins");
			myriam.exonérer();
		}
		if(myriam.faim <= 90){
			myriam.manger();
		}
	}
	
	public static void midi(Humain man) {
		if(man.faim <= 90){
			man.manger();
		}
		if(man.divertissement == 90) {
			man.travailler();
		}
	}
	
	public static void soir(Humain man) {
		if(man.faim <=90){
			man.manger();
		}
	}
	
	public static void nuit(Humain man) {
		man.dormir();
	}
	
	//La collection d'humains
	private static void testListe() {
	// Liste dynamique
			ArrayList<Humain> humainList = new ArrayList<>();
			humainList.add(marion);
			humainList.add(jo);

			for (Humain a : humainList) {
				System.out.println(a);
			}

}
}
