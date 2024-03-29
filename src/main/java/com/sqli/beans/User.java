package com.sqli.beans;

// Generated 30 déc. 2013 23:37:20 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "chalenger")
public class User implements java.io.Serializable {

	private int idUser;
	private Profile profile;
	private ManagerRh managerRh;
	private String lgin;
	private String password;
	private Integer duree;

	public User() {
	}

	public User(int idUser) {
		this.idUser = idUser;
	}

	public User(int idUser, Profile profile, ManagerRh managerRh, String lgin,
			String password, Integer duree) {
		this.idUser = idUser;
		this.profile = profile;
		this.managerRh = managerRh;
		this.lgin = lgin;
		this.password = password;
		this.duree = duree;
	}

	@Id
	@Column(name = "Id_user", unique = true, nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profile")
	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "Matricule", referencedColumnName = "Matricule"),
			@JoinColumn(name = "Id_manager_RH", referencedColumnName = "Id_manager_RH") })
	public ManagerRh getManagerRh() {
		return this.managerRh;
	}

	public void setManagerRh(ManagerRh managerRh) {
		this.managerRh = managerRh;
	}

	@Column(name = "Lgin", length = 254)
	public String getLgin() {
		return this.lgin;
	}

	public void setLgin(String lgin) {
		this.lgin = lgin;
	}

	@Column(name = "Password", length = 254)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Duree")
	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

}
