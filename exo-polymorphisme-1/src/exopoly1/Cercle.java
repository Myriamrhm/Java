package exopoly1;

public class Cercle extends FormeGeometrique {

	private double rayon;

	// Cercle : P�rim�tre = 2 * PI * rayon et Aire = PI * rayon�
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
			throw new Exception("Rayon � z�ro ou n�gatif");
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {		
		return super.toString()+" Rayon: "+getRayon();
	}
}
