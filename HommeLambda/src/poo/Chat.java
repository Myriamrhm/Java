package poo;

public class Chat extends Animal {

	public Chat(String nom) {
		super(nom);
	}

	@Override
	public void attaquer() {
		System.out.println(this.getNom() + " griffe");
	}

	public void miauler() {
		System.out.println(this.getNom() + " miaule");
	}
}
