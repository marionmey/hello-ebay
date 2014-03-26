/**
 * 
 */
package fr.conception.jUnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.conception.impl.Enchere;
import fr.conception.impl.Utilisateur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class AnnulerEnchereTest {
	
	private Vendeur vendeur;
	Enchere enchere;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception { 
		
		// Creation de l'enchere test
		vendeur = new Utilisateur("login","nom","prenom");
		enchere  = new Enchere("Une description...",new Date("23/12/2014"));
		
		enchere.setPrixMinimum(12.36);
		
		vendeur.creerEnchere(enchere);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true, vendeur.annulerEnchere(enchere));
	}

}