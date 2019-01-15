package simplonco.model.utilisateur;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity //Ta classe devient une table dans ta base de données 
public class Utilisateur {
	
	//Constructor Protected
	protected Utilisateur() {
	}
	
	//Constructor Public 
	public Utilisateur(@NotEmpty String login, @NotEmpty String email, @NotEmpty String password,
			@NotNull boolean actif) {
		this.login = login;
		this.email = email;
		this.password = password;
		this.actif = actif;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty
	private String login;
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;
	@NotNull 
	private boolean actif;
	
	public long getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	

}
