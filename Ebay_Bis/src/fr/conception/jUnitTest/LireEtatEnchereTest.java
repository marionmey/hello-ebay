/**
 * 
 */
package fr.conception.jUnitTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.conception.enumeration.Etat_Enchere;
import fr.conception.impl.Enchere;
import fr.conception.impl.Utilisateur;
import fr.conception.interfaces.Acheteur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class LireEtatEnchereTest {

	Acheteur acheteur;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		acheteur = new Utilisateur("toto","Stass","Thomas");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLireEtatEnchere() {
		Vendeur vendeur = new Utilisateur("vend","Tat","moha");
		Enchere enchere1 = new Enchere("description",new Date("24/02/2014"));
		vendeur.creerEnchere(enchere1);
		assertEquals(Etat_Enchere.CREEE,acheteur.lireEtat(enchere1));
	}

}