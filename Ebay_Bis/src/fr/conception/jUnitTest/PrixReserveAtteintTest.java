package fr.conception.jUnitTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.conception.impl.Enchere;
import fr.conception.impl.Offre;

public class PrixReserveAtteintTest {
	private Enchere enchere;
	private Offre offre;
	private double prixOffre;

	@Before
	public void setUp() throws Exception {
		enchere = new Enchere("Une description...",new Date("23/12/2014"));
		enchere.setPrixDeReserve(5);
		
		prixOffre = 10;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true, enchere.prixDeReserveAtteint(prixOffre));
	}

}
