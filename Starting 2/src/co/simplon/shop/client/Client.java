package co.simplon.shop.client;

public class Client {
	//Constructor
	public Client(String nom, float credit) {
		this.nom = nom;
		this.credit = credit;
	}
	
	private String nom;
	private float credit;
	
	//Get Set
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	
	

}
