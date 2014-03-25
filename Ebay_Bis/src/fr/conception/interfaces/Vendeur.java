/**
 * 
 */
package fr.conception.interfaces;

import fr.conception.beans.UtilisateurBean;
import fr.conception.impl.Enchere;

/**
 * @author 'Nes
 *
 */
public interface Vendeur {
	
	public boolean creerEnchere(Enchere enchere);
	public boolean publierEnchere(Enchere enchere);
	public boolean annulerEnchere(Enchere enchere);
}
