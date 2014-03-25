/**
 * 
 */
package fr.conception.beans;

import java.util.Date;
import java.util.Observable;

import fr.conception.enumeration.Etat_Enchere;

/**
 * @author 'Nes
 *
 */
public class EnchereBean  extends Observable{

	private String description;
	private double prixMinimum;
	private double prixDeReserve;
	private int identifiant;
	private Etat_Enchere etat;
	private Date dateLimite;
	private boolean enchereFini;
	
	public EnchereBean(String description, Date dateLimite)
	{
		this.description = description;
		this.dateLimite = dateLimite;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the prixMinimum
	 */
	public double getPrixMinimum() {
		return prixMinimum;
	}
	/**
	 * @param prixMinimum the prixMinimum to set
	 */
	public void setPrixMinimum(double prixMinimum) {
		this.prixMinimum = prixMinimum;
	}
	/**
	 * @return the prixDeReserve
	 */
	public double getPrixDeReserve() {
		return prixDeReserve;
	}
	/**
	 * @param prixDeReserve the prixDeReserve to set
	 */
	public void setPrixDeReserve(double prixDeReserve) {
		this.prixDeReserve = prixDeReserve;
	}
	/**
	 * @return the identifiant
	 */
	public int getIdentifiant() {
		return this.identifiant;
	}
	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	/**
	 * @return the etat
	 */
	public Etat_Enchere getEtat() {
		return etat;
	}
	/**
	 * @param etat the etat to set
	 */
	public void setEtat(Etat_Enchere etat) {
		this.etat = etat;
	}
	/**
	 * @return the dateLimite
	 */
	public Date getDateLimite() {
		return dateLimite;
	}
	/**
	 * @param dateLimite the dateLimite to set
	 */
	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}
	
	/**
	 * @return the enchereFini
	 */
	public boolean isEnchereFini() {
		return enchereFini;
	}
	/**
	 * @param enchereFini the enchereFini to set
	 */
	public void setEnchereFini(boolean enchereFini) {
		this.enchereFini = enchereFini;
	}
	
	
}
