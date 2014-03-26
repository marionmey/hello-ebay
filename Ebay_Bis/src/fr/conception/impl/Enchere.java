/**
 * 
 */
package fr.conception.impl;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import fr.conception.beans.EnchereBean;
import fr.conception.enumeration.Etat_Enchere;

/**
 * @author 'Nes
 *
 */
public class Enchere extends EnchereBean implements Observer{

	private static int universalID;
	
	public Enchere(String description, Date dateLimite) {
		super(description, dateLimite);
		this.universalID++;
		this.setIdentifiant(universalID);
		this.setEtat(Etat_Enchere.CREEE);
		this.setEnchereFini(false);
	}
	
	public boolean infoImpRempli() {
		return (getDescription()!=null && getIdentifiant() > 0 && getDateLimite() != null );
	}

	public boolean prixMinimumCorrect() {
		return (getPrixMinimum() > 0);
	}

	public boolean prixReserveCorrect(){
		return (getPrixDeReserve() > 0);
	}
	
	public boolean prixDeReserveAtteint(double prixOffre) {
		return (prixOffre >= getPrixDeReserve());
	}

	@Override
	public void update(Observable obs, Object object) {
		Date date = (Date) object;
		if (this.getDateLimite().compareTo((Date) object) < 0){
			this.setEnchereFini(true);
		}
		else this.setEnchereFini(false);
		
	}
	
	public void setEtatEnchere(Etat_Enchere etat){
		this.setEtat(etat);
		if (etat == Etat_Enchere.ANNULEE)
		{
			this.setChanged();
			this.notifyObservers(this);
		}
		
	}
}