/**
 * 
 */
package fr.conception.impl;

import fr.conception.beans.EnchereBean;

/**
 * @author 'Nes
 *
 */
public class Enchere extends EnchereBean{

	public boolean infoImpRempli() {
		return (getDescription()!=null && getIdentifiant() > 0 && getDateLimite() != null );
	}

	public boolean prixMinimumCorrect() {
		return (getPrixMinimum() > 0);
	}

	public boolean prixReserveCorrect(){
		return (getPrixDeReserve() > 0);
	}

}
