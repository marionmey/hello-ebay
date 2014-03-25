/**
 * 
 */
package fr.conception.impl;

import java.util.ArrayList;
import java.util.Iterator;

import fr.conception.beans.UtilisateurBean;
import fr.conception.enumeration.Etat_Enchere;
import fr.conception.enumeration.Etat_PrixReserve;
import fr.conception.interfaces.Acheteur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class Utilisateur extends UtilisateurBean implements Vendeur,Acheteur {
	
	private ArrayList<Enchere> liste = new ArrayList<Enchere>();
	
	@Override
	public void emettreOffre() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean creerEnchere(Enchere enchere) {
		// TODO Auto-generated method stub
		int oldSize = liste.size();
		
		enchere.setEtat(Etat_Enchere.CREEE);
		if(enchere.infoImpRempli())	liste.add(enchere);
		
		int newSize = liste.size();
		
		if( (oldSize < newSize)
			&& (liste.get(liste.size()-1).getEtat() == Etat_Enchere.CREEE)) 
				return true;
		else return false;
	}

	@Override
	public boolean publierEnchere(Enchere enchere) {
		// TODO Auto-generated method stub
		
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
	public Etat_PrixReserve prixReserveEstAtteint(Enchere enchere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean annulerEnchere(Enchere enchere) {
		// TODO Auto-generated method stub
		
		int oldSize = liste.size();
		if (oldSize == 1) System.out.println(liste.get(0).getDescription());
		
		Iterator<Enchere> iterator = liste.iterator();
		while (iterator.hasNext()) {
		    Enchere e = iterator.next();
		    if (e.equals(enchere)) {
		        iterator.remove();
		    }
		}
		int newSize = liste.size();
		if (oldSize == 1) System.out.println("\n nvelle taille: " + newSize);
		
		if(newSize<oldSize) return true;
		else return false;
		
	}



}
