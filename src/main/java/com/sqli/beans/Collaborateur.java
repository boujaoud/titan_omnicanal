package com.sqli.beans;

// Generated 30 déc. 2013 23:37:20 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Collaborateur generated by hbm2java
 */
@Entity
@Table(name = "collaborateur", catalog = "chalenger")
public class Collaborateur implements java.io.Serializable {

	private int matricule;
	private ManagerRh managerRhByFkEncienMrh;
	private ManagerRh managerRhByFkActuelMrh;
	private String nom;
	private String prenom;
	private String abreviation;
	private String sexe;
	private String site;
	private String bu;
	private Date dateEmbauche;
	private String moisBap;
	private Date dateDepart;
	private Boolean psi;
	private Date datePsi;
	private Boolean statutMrh;
	private String email;
	private Set<ManagerRh> managerRhs = new HashSet<ManagerRh>(0);
	private Set<Archivage> archivages = new HashSet<Archivage>(0);
	private Set<ObtenirDiplome> obtenirDiplomes = new HashSet<ObtenirDiplome>(0);
	private Set<Niveau> niveaus = new HashSet<Niveau>(0);

	public Collaborateur() {
	}

	public Collaborateur(int matricule) {
		this.matricule = matricule;
	}

	public Collaborateur(int matricule, ManagerRh managerRhByFkEncienMrh,
			ManagerRh managerRhByFkActuelMrh, String nom, String prenom,
			String abreviation, String sexe, String site, String bu,
			Date dateEmbauche, String moisBap, Date dateDepart, Boolean psi,
			Date datePsi, Boolean statutMrh, String email,
			Set<ManagerRh> managerRhs, Set<Archivage> archivages,
			Set<ObtenirDiplome> obtenirDiplomes, Set<Niveau> niveaus) {
		this.matricule = matricule;
		this.managerRhByFkEncienMrh = managerRhByFkEncienMrh;
		this.managerRhByFkActuelMrh = managerRhByFkActuelMrh;
		this.nom = nom;
		this.prenom = prenom;
		this.abreviation = abreviation;
		this.sexe = sexe;
		this.site = site;
		this.bu = bu;
		this.dateEmbauche = dateEmbauche;
		this.moisBap = moisBap;
		this.dateDepart = dateDepart;
		this.psi = psi;
		this.datePsi = datePsi;
		this.statutMrh = statutMrh;
		this.email = email;
		this.managerRhs = managerRhs;
		this.archivages = archivages;
		this.obtenirDiplomes = obtenirDiplomes;
		this.niveaus = niveaus;
	}

	@Id
	@Column(name = "Matricule", unique = true, nullable = false)
	public int getMatricule() {
		return this.matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "Man_Matricule_ancien", referencedColumnName = "Matricule"),
			@JoinColumn(name = "Id_manager_RH_ancien", referencedColumnName = "Id_manager_RH") })
	public ManagerRh getManagerRhByFkEncienMrh() {
		return this.managerRhByFkEncienMrh;
	}

	public void setManagerRhByFkEncienMrh(ManagerRh managerRhByFkEncienMrh) {
		this.managerRhByFkEncienMrh = managerRhByFkEncienMrh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "Man_Matricule_actuel", referencedColumnName = "Matricule"),
			@JoinColumn(name = "Id_manager_RH_actuel", referencedColumnName = "Id_manager_RH") })
	public ManagerRh getManagerRhByFkActuelMrh() {
		return this.managerRhByFkActuelMrh;
	}

	public void setManagerRhByFkActuelMrh(ManagerRh managerRhByFkActuelMrh) {
		this.managerRhByFkActuelMrh = managerRhByFkActuelMrh;
	}

	@Column(name = "Nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Prenom", length = 254)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "Abreviation", length = 254)
	public String getAbreviation() {
		return this.abreviation;
	}

	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}

	@Column(name = "Sexe", length = 254)
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Column(name = "Site_", length = 254)
	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Column(name = "BU", length = 254)
	public String getBu() {
		return this.bu;
	}

	public void setBu(String bu) {
		this.bu = bu;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_Embauche", length = 19)
	public Date getDateEmbauche() {
		return this.dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	@Column(name = "Mois_BAP_", length = 254)
	public String getMoisBap() {
		return this.moisBap;
	}

	public void setMoisBap(String moisBap) {
		this.moisBap = moisBap;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_Depart", length = 19)
	public Date getDateDepart() {
		return this.dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Column(name = "PSI")
	public Boolean getPsi() {
		return this.psi;
	}

	public void setPsi(Boolean psi) {
		this.psi = psi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_PSI", length = 19)
	public Date getDatePsi() {
		return this.datePsi;
	}

	public void setDatePsi(Date datePsi) {
		this.datePsi = datePsi;
	}

	@Column(name = "Statut_MRH")
	public Boolean getStatutMrh() {
		return this.statutMrh;
	}

	public void setStatutMrh(Boolean statutMrh) {
		this.statutMrh = statutMrh;
	}

	@Column(name = "Email", length = 254)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collaborateur")
	public Set<ManagerRh> getManagerRhs() {
		return this.managerRhs;
	}

	public void setManagerRhs(Set<ManagerRh> managerRhs) {
		this.managerRhs = managerRhs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collaborateur")
	public Set<Archivage> getArchivages() {
		return this.archivages;
	}

	public void setArchivages(Set<Archivage> archivages) {
		this.archivages = archivages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collaborateur")
	public Set<ObtenirDiplome> getObtenirDiplomes() {
		return this.obtenirDiplomes;
	}

	public void setObtenirDiplomes(Set<ObtenirDiplome> obtenirDiplomes) {
		this.obtenirDiplomes = obtenirDiplomes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collaborateur")
	public Set<Niveau> getNiveaus() {
		return this.niveaus;
	}

	public void setNiveaus(Set<Niveau> niveaus) {
		this.niveaus = niveaus;
	}

}