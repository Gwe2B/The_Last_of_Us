package com;

/**
 * @author Gwenael
 * @version 1.0
 * @created 07-nov-2020
 */
public class HealingItem extends Item {

/* ----------------------------- Class constants ---------------------------- */
	public static final int MIN_PV_RENDUE = 1;
	public static final int MAX_PV_RENDUE = 100;

/* --------------------------- Instance attributes -------------------------- */
	private final int pvRendue;

	/**
	 * Constructor
	 * @param name Item's name
	 * @param description Item's Description
	 */
	public HealingItem(String name, int pv, String description) {
		super(name, description);

		if(pv >= HealingItem.MIN_PV_RENDUE && pv <= HealingItem.MAX_PV_RENDUE)
			this.pvRendue = pv;
		else
			throw new IllegalArgumentException("The amount of the pv " +
				HealingItem.MIN_PV_RENDUE + " and " + HealingItem.MAX_PV_RENDUE);
	}

/* ------------------------ Object inherited methods ------------------------ */
	/**
	 * (no-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Healing Item: " + this.nom + " (" + this.pvRendue + ")\n" +
			this.description;
	}
}