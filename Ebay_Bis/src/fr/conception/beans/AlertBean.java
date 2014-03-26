/**
 * 
 */
package fr.conception.beans;

import fr.conception.enumeration.Type_Alerte;

/**
 * @author 'Nes
 *
 */
public class AlertBean {
	
	private boolean isActive;
	private Type_Alerte type;
	private int idEnchere;
	
	public AlertBean(Type_Alerte alertType,int idEnchere)
	{
		this.setActive(true);
		this.type = alertType;
		this.idEnchere = idEnchere;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the type
	 */
	public Type_Alerte getType() {
		return type;
	}

	/**
	 * @return the idEnchere
	 */
	public int getIdEnchere() {
		return idEnchere;
	}


}