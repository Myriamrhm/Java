package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class App {

	static Chat minette = null;
	static Chat felix = null;

	public static void main(String[] args) {

		try {
			minette = new Chat("Minette");
			felix = new Chat("Felix");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		System.out.println("Liste--------------------");
		testListe();
		System.out.println("Pile--------------------");
		testPile();
		System.out.println("Map--------------------");
		testMap();
		System.out.println("Set--------------------");
		testSet();

	}

	private static void testListe() {

		// Liste dynamique
		ArrayList<Animal> animauxList = new ArrayList<>();
		animauxList.add(minette);
		animauxList.add(felix);

		for (Animal a : animauxList) {
			System.out.println(a);
		}

		// on peut implementer soi m�me son algo de tri(trier les aniamux par leur nom,
		// ou leur �nergie etc)
	}

	private static void testPile() {
		// Pile
		Stack<Animal> animauxStack = new Stack<Animal>();
		animauxStack.push(minette);
		animauxStack.push(felix);

		for (Animal a : animauxStack) {
			System.out.println(a);
		}

		// methodes typiques : peek, pop, push

	}

	private static void testMap() {

		// Tableau cl� valeur, ConcurrentMap si Threads
		HashMap<String, Animal> animauxHashSet = new HashMap<>();
		animauxHashSet.put("12345", minette);
		animauxHashSet.put("67890", felix);

		// retrouver un animal par sa cl�
		System.out.println(animauxHashSet.get("12345"));
		System.out.println(animauxHashSet.containsValue(minette));

		// boucler sur toutes les cl�s puis obtenir l'objet associ�
		for (String key : animauxHashSet.keySet()) {

			System.out.println("cl� " + key + " : " + animauxHashSet.get(key));
		}

	}
	
	//Les collections de type SET ne contiennent que des valeurs uniques (pas de doublons)
	private static void testSet()
	{
		//instance
		HashSet<Animal> animauxSet = new HashSet<>();
		
		//trucs dans la méthodes
		animauxSet.add(minette);
		//ne leve pas d'exceptin mais ne l'ajoute pas car deja dans le SET
		animauxSet.add(minette);
		
		//le return de la méthode
		System.out.println(animauxSet.size());
	}

}
