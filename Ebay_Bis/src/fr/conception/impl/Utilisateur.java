/**
 * 
 */
package fr.conception.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;

import fr.conception.beans.AlertBean;
import fr.conception.beans.UtilisateurBean;
import fr.conception.enumeration.Etat_Enchere;
import fr.conception.enumeration.Etat_PrixReserve;
import fr.conception.enumeration.Type_Alerte;
import fr.conception.interfaces.Acheteur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class Utilisateur extends UtilisateurBean implements Vendeur,Acheteur {
	
	public Utilisateur(String login, String nom, String prenom) {
		super(login, nom, prenom);
	}

	@Override
	public boolean emettreOffre(Vendeur vendeur,Enchere enchere, double prix) {
		Offre offre = new Offre(enchere.getIdentifiant());
		offre.setPrix(prix);
		if (offre.isInfoRempli()) 
			{
				this.setOffres(offre);
				vendeur.addOffres(offre,enchere);
				this.setChanged();
				this.notifyObservers(offre);
				return true;
			}
		else return false;

	}
	
	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof Enchere)
		{
			Enchere enchere = (Enchere) obj;
			if (enchere.getEtat() == Etat_Enchere.ANNULEE) this.setAlertes(new AlertBean(Type_Alerte.ENCHERE_ANNULEE,enchere.getIdentifiant()));
			else this.setAlertes(new AlertBean(Type_Alerte.PRIX_RESERVE_ATTEINT,enchere.getIdentifiant()));
		}
		else if (obj instanceof Offre)
		{
			Offre offre = (Offre) obj;
			this.setAlertes(new AlertBean(Type_Alerte.NOUVELLE_OFFRE, offre.getEnchereId()));
		}
		
		
	}
	
	@Override
	public boolean creerEnchere(Enchere enchere) {
		List<Enchere> liste = this.getEncheres();
		int oldSize = liste.size();
		
		enchere.setEtat(Etat_Enchere.CREEE);
		if(enchere.infoImpRempli())	liste.add(enchere);
		
		int newSize = liste.size();
		EnchereCreee.addEnchere(enchere, this.getLogin());
		if( (oldSize < newSize)
			&& (liste.get(liste.size()-1).getEtat() == Etat_Enchere.CREEE)) 
				return true;
		else return false;
	}

	@Override
	public boolean publierEnchere(Enchere enchere) {
		
		List<Enchere> liste = this.getEncheres();
		Iterator<Enchere> iterator = liste.iterator();
		while (iterator.hasNext()) {
		    Enchere e = iterator.next();
		    if (e.equals(enchere)) {
		    	e.setEtat(Etat_Enchere.PUBLIEE);
		    	return true;
		    }
		}
		return false;
	}

	@Override
	public boolean annulerEnchere(Enchere enchere) {
		List<Enchere> liste = this.getEncheres();
		int oldSize = liste.size();
		
		Iterator<Enchere> iterator = liste.iterator();
		while (iterator.hasNext()) {
		    Enchere e = iterator.next();
		    if (e.equals(enchere)) {
		        iterator.remove();
		    }
		}
		int newSize = liste.size();
		
		if(newSize<oldSize) return true;
		else return false;
		
	}
	
	@Override
	public List<AlertBean> getListeAlerte() {
		return this.getAlertes();
	}

	@Override
	public Etat_Enchere lireEtat(Enchere enchere1) {
		for (Enchere enchere : EnchereCreee.getAllEnchere())
		{
			if (enchere.getIdentifiant() == enchere1.getIdentifiant()){
				return enchere.getEtat();
			}
		}
		return null;
	}

	@Override
	public boolean peutEmettreOffre(String vendeur) {
		if (vendeur == this.getLogin()) return false;
		else return true;
	}

	@Override
	public void setListeAlerte(AlertBean alert) {
		this.getAlertes().add(alert);

	}

	@Override
	public void ajoutObserver(Vendeur vendeur) {
		this.addObserver(vendeur);				
	}

	@Override
	public void desactiverAllalertes() {
		for (AlertBean alerte : this.getAlertes())
		{
			alerte.setActive(false);
		}
	}

	@Override
	public boolean allAlertesAreDesactivate() {
		for (AlertBean alerte : this.getAlertes())
		{
			if (alerte.isActive()) return false;
		}
		return true;
	}

	@Override
	public boolean desactiverAlerte(AlertBean alerte) {
		int posAlerte =this.getAlertes().indexOf(alerte);
		if (posAlerte != -1) this.getAlertes().get(posAlerte).setActive(false);
		else return false;
		return true;
	}

	@Override
	public void addOffres(Offre offre, Enchere enchere) {
		this.setOffres(offre);
		enchere.prixDeReserveAtteint(offre.getPrix());
	}



}
