package poo;

public class Chien extends Animal {

	public Chien(String nom) {
		super(nom);		
	}

	@Override
	public void attaquer() {
		System.out.println(this.getNom()+" mord");		
	}
	
	@Override
	public void respirer() {
		System.out.println(this.getNom()+" respire fort");
	}	
	
	public void aboyer()
	{
		System.out.println(this.getNom()+" aboie");
	}
}
