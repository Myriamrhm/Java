package poo;

import java.util.ArrayList;
import java.util.List;

public class App {

	//Permet de tester le type � l'�x�cution en passant le type en param�tre
	//Sert quand on ne sait pas l'avance, CAD ds le code ce que l'on veut comparer
	public static boolean fun(Object obj, String c) throws ClassNotFoundException {
		return Class.forName(c).isInstance(obj);
	}

	public static void main(String[] args) throws ClassNotFoundException {

		// This is polymorphism !
		// On peut traiter toutes les sous classes d'Animal en tant qu'Animal
		// Mais on pourra aussi les traiter comme leur type instanci� (apr�s le new)
		// Donc gr�ce au polymorphisme tant que le cast ou la d�clarartion est bonne, on
		// peut traiter toute sous classe comme une de ses classes m�re

		Animal felix = new Chat("felix");
		Animal medor = new Chien("medor");
		Animal jerry = new Chat("jerry");
		Animal dingo = new Chien("dingo");

		felix.attaquer();
		medor.attaquer();

		felix.respirer();
		medor.respirer();

		// felix.miauler();//marche p� car felix est vu en tant qu'animal

		((Chat) felix).miauler();// on cast(re) felix en Chat et l� c'est bon

		((Chien) medor).aboyer();// idem pour le Chien

		// regression vers la classe racine Object
		// ((Object)felix).miauler();//Pas possible, regradez avec Eclipse, on ne voit
		// que les m�thodes d'Object

		List<Animal> animaux = new ArrayList<Animal>();
		animaux.add(felix);
		animaux.add(medor);
		animaux.add(jerry);
		animaux.add(dingo);

		//On utilise instanceof quand on sait � l'avance les types que l'on va �valuer
		for (Animal a : animaux) {
			if (a instanceof Chat) {
				System.out.println(a + " est un chat");
			}
		}

		for (Animal a : animaux) {
			if (a instanceof Chien) {
				System.out.println(a + " est un chien");
			}
		}

		for (Animal a : animaux) {
			a.attaquer();
		}

		System.out.println(fun(felix, "poo.Chien"));//Faux !!!
		System.out.println(felix.getClass().getSuperclass().getName());
		System.out.println(felix.getClass().getTypeName());
	}
}
