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
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class ContenuEnchereTest {

	private Enchere enchere1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		enchere1 = new Enchere("desc",new Date("01/02/2014"));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInformationImportanteRempli()
	{
		assertEquals(true,enchere1.infoImpRempli());
		
	}

	@Test
	public void testPrixMinimumCorrect()
	{
		enchere1.setPrixMinimum(12.36);
		assertEquals(true,enchere1.prixMinimumCorrect());
	}
	@Test
	public void testPrixReserveCorrect()
	{
		enchere1.setPrixDeReserve(-4.6);
		assertEquals(false,enchere1.prixReserveCorrect());
	}
}