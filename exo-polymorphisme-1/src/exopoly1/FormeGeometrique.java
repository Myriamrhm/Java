package exopoly1;

public abstract class FormeGeometrique {
	
	public abstract double calculerAire();
	public abstract double calculerPerimetre();
	
@Override
	public String toString() {	
		return this.getClass().getSimpleName();
	}
}
