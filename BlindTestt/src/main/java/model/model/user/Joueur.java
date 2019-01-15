package model.model.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

	@Entity
	public class Joueur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idJoueur;
	@NotEmpty
	public String pseudo;
	@NotEmpty
	private String mail;
	@NotEmpty
	private String password;
	public int score;

	//Constructor Public
	public Joueur(long idJoueur, @NotEmpty String pseudo, @NotEmpty String mail, @NotEmpty String password, int score) {
		super();
		this.idJoueur = idJoueur;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.score = score;
	}
	//Constructor Protected
	protected Joueur() {
	}

	public long getIdJoueur() {
		return idJoueur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	

}
