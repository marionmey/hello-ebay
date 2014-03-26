/**
 * 
 */
package fr.conception.impl;

import fr.conception.beans.OffreBean;

/**
 * @author 'Nes
 *
 */
public class Offre extends OffreBean{
	public Offre(int identifiant) {
		super(identifiant);
	}
	

	public boolean isInfoRempli() {
		return (this.getEnchereId() > 0 && this.getPrix() >0);
	}

}