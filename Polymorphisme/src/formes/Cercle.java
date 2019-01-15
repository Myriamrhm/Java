package formes;
import java.lang.Math;

public class Cercle extends FormeGeometrique {
	
	private double rayon;
	
	
	//Constructeur de Cercle 
	public Cercle(double rayon) throws ValeursNegativesExceptions, ValeursNonAzero {
		super();
		this.rayon = rayon;
	}


	//Les Getters et Setters 
	//qui valide les valeurs non à 0 ET non - via Exceptions
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) throws ValeursNegativesExceptions, ValeursNonAzero {
		if ( rayon < 0 ) throw new ValeursNegativesExceptions("Erreur seulement valeurs negatives");
		if ( rayon == 0 ) throw new ValeursNonAzero("Erreur seulement valeurs positives");
		
		this.rayon = rayon;
	} 
	
	
	//les méthodes
	public double calculerAire() {
		return Math.PI * Math.pow(rayon, 2);
		
	}
	
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
		
	}
	
	

}
