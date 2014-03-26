/**
 * 
 */
package fr.conception.jUnitTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.conception.impl.Enchere;
import fr.conception.impl.EnchereCreee;
import fr.conception.impl.Utilisateur;
import fr.conception.interfaces.Acheteur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class EmettreOffreTest {

	private Acheteur acheteur;
	private Vendeur vendeur;
	private Enchere enchere;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		acheteur = new Utilisateur("login","nom","prenom");
		enchere = new Enchere("decription", new Date("01/20/2014"));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNePeutPasEmettreOffre() {
		vendeur = new Utilisateur("login","nom","prenom");
		vendeur.creerEnchere(enchere);
		assertEquals(false,acheteur.peutEmettreOffre(EnchereCreee.getVendeur(enchere)));
	}
	@Test
	public void testPeutEmettreOffre() {
		vendeur = new Utilisateur("login1","nom","prenom");
		vendeur.creerEnchere(enchere);
		assertEquals(true,acheteur.peutEmettreOffre(EnchereCreee.getVendeur(enchere)));
	}

	@Test
	public void testEmettreOffre()
	{
		double prix = 10.6;
		assertEquals(true,acheteur.emettreOffre(enchere,prix));
	}
}