package exopoly1;

public class Cercle extends FormeGeometrique {

	private double rayon;

	// Cercle : Périmètre = 2 * PI * rayon et Aire = PI * rayon²
	public Cercle(double rayon) throws Exception {
		this.setRayon(rayon);
	}	

	@Override
	public double calculerAire() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) throws Exception {
		if (rayon <= 0)
			throw new Exception("Rayon à zéro ou négatif");
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {		
		return super.toString()+" Rayon: "+getRayon();
	}
}
