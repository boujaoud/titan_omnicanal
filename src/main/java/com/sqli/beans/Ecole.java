package com.sqli.beans;

// Generated 30 déc. 2013 23:37:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ecole generated by hbm2java
 */
@Entity
@Table(name = "ecole", catalog = "chalenger")
public class Ecole implements java.io.Serializable {

	private int idEcole;
	private String libelleEcole;
	private String typeEcole;
	private Set<ObtenirDiplome> obtenirDiplomes = new HashSet<ObtenirDiplome>(0);

	public Ecole() {
	}

	public Ecole(int idEcole) {
		this.idEcole = idEcole;
	}

	public Ecole(int idEcole, String libelleEcole, String typeEcole,
			Set<ObtenirDiplome> obtenirDiplomes) {
		this.idEcole = idEcole;
		this.libelleEcole = libelleEcole;
		this.typeEcole = typeEcole;
		this.obtenirDiplomes = obtenirDiplomes;
	}

	@Id
	@Column(name = "Id_ecole", unique = true, nullable = false)
	public int getIdEcole() {
		return this.idEcole;
	}

	public void setIdEcole(int idEcole) {
		this.idEcole = idEcole;
	}

	@Column(name = "Libelle_ecole", length = 254)
	public String getLibelleEcole() {
		return this.libelleEcole;
	}

	public void setLibelleEcole(String libelleEcole) {
		this.libelleEcole = libelleEcole;
	}

	@Column(name = "Type_ecole", length = 254)
	public String getTypeEcole() {
		return this.typeEcole;
	}

	public void setTypeEcole(String typeEcole) {
		this.typeEcole = typeEcole;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ecole")
	public Set<ObtenirDiplome> getObtenirDiplomes() {
		return this.obtenirDiplomes;
	}

	public void setObtenirDiplomes(Set<ObtenirDiplome> obtenirDiplomes) {
		this.obtenirDiplomes = obtenirDiplomes;
	}

}
