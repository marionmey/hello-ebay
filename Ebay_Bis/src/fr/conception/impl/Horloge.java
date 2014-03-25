/**
 * 
 */
package fr.conception.impl;

import java.util.Date;

import fr.conception.beans.HorlogeBean;

/**
 * @author iallaha
 *
 */
public class Horloge extends HorlogeBean{

	public Horloge(int jour, int mois, int annee, int heure, int minute,
			int seconde) {
		super(jour, mois, annee, heure, minute, seconde);
		
	}

	public void setDate(int jour, int mois, int annee, int heure, int minute,
			int seconde)
	{
		this.setJour(jour);
		this.setMois(mois);
		this.setAnnee(annee);
		this.setHeure(heure);
		this.setMinute(minute);
		this.setSeconde(seconde);
		this.setChanged();
		this.notifyObservers(this.getDate());
	}
	public Date getDate()
	{
		return new Date((this.getAnnee()-1900), (this.getMois()-1), this.getJour(), this.getHeure(), this.getMinute(), this.getSeconde() ); 
	}
}
