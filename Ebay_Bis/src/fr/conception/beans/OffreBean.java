/**
 * 
 */
package fr.conception.beans;

import java.util.Observable;

/**
 * @author 'Nes
 *
 */
public class OffreBean{

	private int enchereId;
	private double prix;
	
	public OffreBean(int identifiant) {
		this.setEnchereId(identifiant);
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the enchereId
	 */
	public int getEnchereId() {
		return enchereId;
	}

	/**
	 * @param enchereId the enchereId to set
	 */
	public void setEnchereId(int enchereId) {
		this.enchereId = enchereId;
	}

}