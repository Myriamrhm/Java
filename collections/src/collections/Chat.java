package collections;

public class Chat extends Animal{
	
	private String nom;
	
	public Chat(String nom) throws Exception
	{
		this.setNom(nom);
		this.setEnergie(100);
	}

	@Override
	public void bouger() {
		System.out.println("Je me déplace furtivement");
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) throws Exception {
		if(nom.isEmpty()) throw new Exception("Nom vide");
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return this.getNom()+" "+this.getEnergie();
	}

}
