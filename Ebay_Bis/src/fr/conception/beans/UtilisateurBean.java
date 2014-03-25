/**
 * 
 */
package fr.conception.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import fr.conception.impl.Enchere;
import fr.conception.impl.Offre;
import fr.conception.beans.OffreBean;

/**
 * @author 'Nes
 *
 */
public class UtilisateurBean extends Observable{

	private String nom;
	private String prenom;
	private String login;
	private List<Offre> offres;
	private List<Enchere> encheres;
	private List<AlertBean> alertes;
	
	public UtilisateurBean(String login, String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		encheres = new ArrayList<Enchere>();
		offres = new ArrayList<Offre>();
		alertes = new ArrayList<AlertBean>();
	}
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
	public void setOffres(Offre offre) {
		this.offres.add(offre);
	}
	/**
	 * @return the encheres
	 */
	public List<Enchere> getEncheres() {
		return encheres;
	}
	/**
	 * @param encheres the encheres to set
	 */
	public void setEncheres(List<Enchere> encheres) {
		this.encheres = encheres;
	}
	/**
	 * @return the alertes
	 */
	public List<AlertBean> getAlertes() {
		return alertes;
	}
	/**
	 * @param alertes the alertes to set
	 */
	public void setAlertes(AlertBean alerte) {
		this.alertes.add(alerte);
	}

}
