package exopoly1;

public class Rectangle extends FormeGeometrique {

	private double longueur;
	private double largeur;

	// Périmètre = 2 * (longueur + largeur) et Aire = longueur * largeur
	public Rectangle(double longueur, double largeur) throws Exception {
		this.setLargeur(largeur);
		this.setLongueur(longueur);
	}

	@Override
	public double calculerAire() {
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * (longueur + largeur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) throws Exception {
		if (longueur <= 0)
			throw new Exception("longueur à zéro ou négatif");
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) throws Exception {
		if (largeur <= 0)
			throw new Exception("largeur à zéro ou négatif");
		this.largeur = largeur;
	}
	
	@Override
	public String toString() {		
		return super.toString()+" Longueur: "+getLongueur()+" Largeur: "+getLargeur();
	}

}
