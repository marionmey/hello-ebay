/**
 * 
 */
package fr.conception.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iallaha
 *
 */
public class EnchereCreee {
	private static Map<Enchere,String> allEnchere = new HashMap<Enchere,String>();

	public static List<Enchere> getAllEnchere() {
		List<Enchere> encheres = new ArrayList<Enchere>(allEnchere.keySet());
		return encheres;
	}
	
	public static void addEnchere(Enchere enchere, String utilisateur)
	{
		allEnchere.put(enchere,utilisateur);
	}
	
	public static String getVendeur(Enchere enchere)
	{
		return allEnchere.get(enchere);
	}
}