
public class Humain {
	// Attributs
		public int energie=50;
		public int besoins=50;
		public int divertissement=50;
		public int faim=50;
		public boolean actif;
		

public Humain () {
	this.energie = 50;
	this.besoins = 50;
	this.divertissement = 50;
	this.faim = 50;
	this.actif = true;
}

public Humain(int energie, int besoins, int divertissement, int faim) {
	this.energie = energie;
	this.besoins = besoins;
	this.divertissement = divertissement;
	this.faim = faim; 
	
}
	
	//méthodes ·	
	public void manger() {
		if(faim <= 90)
			faim += 10 ;
		besoins = besoins+10 ;
		energie = energie-5 ;
	}
	
	public void dormir() {
			energie += 10 ;
			besoins -= 5 ;
			faim -= 5 ;
		}
	
	public void travailler() {
			energie -= 10 ;
			besoins -= 5 ;
			divertissement -= 10 ;
		}
	
	public void jouer() {
			divertissement += 10 ;
			energie -= 5 ;
		}
	
	public void exonérer() {
			besoins -= 10 ;
			faim += 10 ;
		}
	
		
	public void afficherLesEtats() {
		System.out.println(
					"La faim:"+faim+"\n"+
					"Le divertissement:"+divertissement+"\n"+
					"L'energie:"+energie+"\n"+
					"Les besoins:"+besoins
					);
			
		}

	//getter setter
	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		if (energie<=100)
		this.energie = energie;
		
	}

	public int getBesoins() {
		return besoins;
	}

	public void setBesoins(int besoins) {
		this.besoins = besoins;
	}

	public int getDivertissement() {
		return divertissement;
	}

	public void setDivertissement(int divertissement) {
		this.divertissement = divertissement;
	}

	public int getFaim() {
		return faim;
	}

	public void setFaim(int faim) {
		this.faim = faim;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	}


