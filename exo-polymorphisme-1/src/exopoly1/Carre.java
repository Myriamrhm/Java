package exopoly1;

public class Carre extends Rectangle {	

	public Carre(double cote) throws Exception
	{
		this(cote,cote);
	}
	
	private Carre(double longueur, double largeur) throws Exception {
		super(longueur, largeur);		
	}
	
	@Override
	public String toString() {		
		return super.toString();
	}
}
