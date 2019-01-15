package formes;

public class Rectangle extends FormeGeometrique {
	
	private double longueur;
	private double largeur;
	
	
	//Constructeur de Rectangle 
	public Rectangle(double longueur, double largeur) throws ValeursNegativesExceptions, ValeursNonAzero {
		this.setLargeur(largeur);
		this.setLongueur(longueur);
	} 


	//Les Getters et Setters 
	//qui valide les valeurs non à 0 ET non - via Exceptions
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) throws ValeursNegativesExceptions, ValeursNonAzero {
		if ( longueur < 0 ) throw new ValeursNegativesExceptions("Erreur seulement valeurs negatives");
		if ( longueur == 0 ) throw new ValeursNonAzero("Erreur seulement valeurs positives");
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) throws ValeursNegativesExceptions, ValeursNonAzero {
		if ( largeur < 0 ) throw new ValeursNegativesExceptions("Erreur seulement valeurs negatives");
		if ( largeur == 0 ) throw new ValeursNonAzero("Erreur seulement valeurs positives");
		this.largeur = largeur;
	}


	
	public double calculerAire() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}


	
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*(longueur+largeur);
	} 
	

}
