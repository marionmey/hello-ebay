/**
 * 
 */
package fr.conception.jUnitTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.conception.beans.AlertBean;
import fr.conception.enumeration.Etat_Enchere;
import fr.conception.enumeration.Type_Alerte;
import fr.conception.impl.Enchere;
import fr.conception.impl.Utilisateur;
import fr.conception.interfaces.Acheteur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class AlertesTest {

	private Acheteur acheteur;
	private Vendeur vendeur;
	private Enchere enchere;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		acheteur = new Utilisateur("login","nom","prenom");
		vendeur = new Utilisateur("login1","nom","prenom");
		enchere = new Enchere("descr",new Date("01/02/2014"));
		vendeur.creerEnchere(enchere);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNouvelleOffre() {

		int nbAlerte = vendeur.getListeAlerte().size();
		acheteur.ajoutObserver(vendeur);
		acheteur.emettreOffre(vendeur,enchere, 12.6);
		assertEquals(nbAlerte+1,vendeur.getListeAlerte().size());
	}
	
	@Test
	public void testEnchereAnnulee()
	{
		int nbAlerte = acheteur.getListeAlerte().size();
		enchere.addObserver(acheteur);
		enchere.setEtatEnchere(Etat_Enchere.ANNULEE);
		assertEquals(nbAlerte+1,acheteur.getListeAlerte().size());
	}

	/*@Test
	public void testPrixReserveAtteintAlerte()
	{
		AlertBean alerte = new AlertBean(Type_Alerte.PRIX_RESERVE_ATTEINT,enchere.getIdentifiant());
		acheteur.setListeAlerte(alerte);
		enchere.setPrixDeReserve(15.3);
		acheteur.emettreOffre(enchere, 16);
		assertEquals(true,acheteur.isAlerteDeclenchee());
	}*/
	
	@Test
	public void testDesactiverTouteAlertes()
	{
		AlertBean alerte = new AlertBean(Type_Alerte.PRIX_RESERVE_ATTEINT,enchere.getIdentifiant());
		AlertBean alerte1 = new AlertBean(Type_Alerte.ENCHERE_ANNULEE,enchere.getIdentifiant());
		AlertBean alerte2 = new AlertBean(Type_Alerte.OFFRE_SUP,enchere.getIdentifiant());
		acheteur.setListeAlerte(alerte);
		acheteur.setListeAlerte(alerte1);
		acheteur.setListeAlerte(alerte2);
		acheteur.desactiverAllalertes();
		assertEquals(true,acheteur.allAlertesAreDesactivate());
	}
	
	@Test
	public void testDesactiverPartieAlerte()
	{
		AlertBean alerte = new AlertBean(Type_Alerte.PRIX_RESERVE_ATTEINT,enchere.getIdentifiant());
		AlertBean alerte1 = new AlertBean(Type_Alerte.ENCHERE_ANNULEE,enchere.getIdentifiant());
		AlertBean alerte2 = new AlertBean(Type_Alerte.OFFRE_SUP,enchere.getIdentifiant());
		acheteur.setListeAlerte(alerte);
		acheteur.setListeAlerte(alerte1);
		acheteur.setListeAlerte(alerte2);
		assertEquals(true,acheteur.desactiverAlerte(alerte1));
	}
	

}