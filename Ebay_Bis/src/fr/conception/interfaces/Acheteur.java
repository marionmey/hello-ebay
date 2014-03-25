/**
 * 
 */
package fr.conception.interfaces;

import fr.conception.enumeration.Etat_PrixReserve;
import fr.conception.impl.Enchere;

/**
 * @author 'Nes
 *
 */
public interface Acheteur {
	
	public void emettreOffre();
	public Etat_PrixReserve prixReserveEstAtteint(Enchere enchere);
}
