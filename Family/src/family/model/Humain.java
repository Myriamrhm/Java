package family.model;

public abstract class Humain {
	
	private int age;
	private String nom;
	
	//Les GETTER SETTER de age et nom
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Les méthodes
	public void manger() {
		System.out.println("miam miam je mange");
	}
	public void dormir() {
		System.out.println("zzzzz");
	}
	
	

}
