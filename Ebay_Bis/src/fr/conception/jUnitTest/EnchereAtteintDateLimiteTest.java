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
import fr.conception.impl.Horloge;

/**
 * @author 'Nes
 *
 */
public class EnchereAtteintDateLimiteTest {

	private Horloge date;
	private Enchere enchere;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		date = new Horloge(02,02,2014,12,32,00);
		enchere = new Enchere("ttt",new Date("02/02/2014"));
		date.addObserver(enchere);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnchereDateLimitePassee() {
		date.setDate(01,03,2014,12,32,00);
		assertEquals(true,enchere.isEnchereFini());
	}

	@Test
	public void testEnchereDateLimiteNonPassee() {
		date.setDate(01,02,2014,12,32,00);
		assertEquals(false,enchere.isEnchereFini());
	}
}