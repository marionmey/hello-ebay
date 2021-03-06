/**
 * 
 */
package fr.conception.interfaces;

import java.util.List;
import java.util.Observer;

import fr.conception.beans.AlertBean;
import fr.conception.beans.UtilisateurBean;
import fr.conception.impl.Enchere;
import fr.conception.impl.Offre;

/**
 * @author 'Nes
 *
 */
public interface Vendeur extends Observer {

	public boolean creerEnchere(Enchere enchere);
	public boolean publierEnchere(Enchere enchere);
	public boolean annulerEnchere(Enchere enchere);
	public List<AlertBean> getListeAlerte();
	public void addOffres(Offre offre,Enchere enchere);
}