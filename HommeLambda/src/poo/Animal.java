<>package poo;

//Elle est abstraite car elle ne sert qu e �tre d�riv�e
public abstract class Animal {
	
	private String nom;
	
	public Animal(String nom)
	{
		this.nom=nom;
	}
	
	 public  abstract void attaquer();
	 
	 public void respirer() {System.out.println(this.getNom()+" respire");}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		
		return this.getNom();
	}
}
