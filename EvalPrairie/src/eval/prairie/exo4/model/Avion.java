package eval.prairie.exo4.model;

public class Avion {
	int vitesse;
	int carburant;
	
	//Constructeur
	public Avion(int vitesse, int carburant) {
		super();
		this.vitesse = vitesse;
		this.carburant = carburant;
	}
	
	
	//Getter et Setter
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public int getCarburant() {
		return carburant;
	}
	public void setCarburant(int carburant) {
		this.carburant = carburant;
	}
	
	

}
