/**
 * 
 */
package fr.conception.interfaces;

import java.util.List;
import java.util.Observer;

import fr.conception.beans.AlertBean;
import fr.conception.enumeration.Etat_Enchere;
import fr.conception.enumeration.Etat_PrixReserve;
import fr.conception.impl.Enchere;

/**
 * @author 'Nes
 *
 */
public interface Acheteur extends Observer{

	public Etat_Enchere lireEtat(Enchere enchere1);
	public boolean peutEmettreOffre(String vendeur);
	public List<AlertBean> getListeAlerte();
	public void setListeAlerte(AlertBean alert);
	public void ajoutObserver(Vendeur vendeur);
	public void desactiverAllalertes();
	public boolean allAlertesAreDesactivate();
	public boolean desactiverAlerte(AlertBean alerte);
	boolean emettreOffre(Vendeur vendeur, Enchere enchere, double prix);
	
}
