/**
 * 
 */
package fr.conception.beans;

import java.util.Date;

import fr.conception.enumeration.Etat_Enchere;

/**
 * @author 'Nes
 *
 */
public class EnchereBean {

	private String description;
	private double prixMinimum;
	private double prixDeReserve;
	private static int identifiant;
	private Etat_Enchere etat;
	private Date dateLimite;
	
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
		return EnchereBean.identifiant;
	}
	/**
	 * @param identifiant the identifiant to set
	 */
	public static void setIdentifiant() {
		EnchereBean.identifiant++;
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
	
	
}
