package collections;

public abstract class Animal extends EtreVivant{
	
	public abstract void bouger();
	
	public void manger(EtreVivant etreVivant) throws Exception
	{
		this.setEnergie(this.getEnergie()+etreVivant.getEnergie());
		etreVivant.setEnVie(false);
	}

}
