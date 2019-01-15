package simplonco.model.role;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.mapping.List;

import simplonco.model.utilisateur.Utilisateur;

@Entity
public class Role {
	
	//Constructor Protected
	protected Role() {
	}
	
	//Constructor Public 
	public Role(@NotEmpty String libelle, Set<Utilisateur> utilisateur) {
		this.libelle = libelle;
		this.utilisateur = utilisateur;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	private String libelle;
	
	@OneToMany
	private Set<Utilisateur> utilisateur = new HashSet<Utilisateur>();

	public long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Utilisateur> getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Set<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
	
}
