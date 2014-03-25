/**
 * 
 */
package fr.conception.beans;

import java.util.List;

import fr.conception.impl.Offre;

/**
 * @author 'Nes
 *
 */
public class UtilisateurBean {

	private String nom;
	private String prenom;
	private String login;
	private List<Offre> offres;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the offres
	 */
	public List<Offre> getOffres() {
		return offres;
	}
	/**
	 * @param offres the offres to set
	 */
	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}
}
