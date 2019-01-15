package model.model.user;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Admin {

	@NotEmpty
	private String mail;
	
	@NotEmpty
	private String password;
	
	//Constructor Protected
	protected Admin() {
	}
	//Constructor Public
	public Admin(@NotEmpty String mail, @NotEmpty String password) {
		super();
		this.mail = mail;
		this.password = password;
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
	
	
}
