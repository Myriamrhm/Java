package collections;

public abstract class EtreVivant {
	
	private int energie;
	private boolean enVie;

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) throws Exception {
		if(energie < 0) throw new Exception("Energie ne peut pas être négatif");
		if(energie == 0) this.setEnVie(false);
		this.energie = energie;
		
	}

	public boolean isEnVie() {
		return enVie;
	}

	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}
	

}
