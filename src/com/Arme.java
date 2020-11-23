package com;

/**
 * @author Gwenael
 * @version 1.0
 * @created 07-nov.-2020 10:56:37
 */
public class Arme extends Item {

/* ----------------------------- Class constants ---------------------------- */
    public static final int MAX_PA = 100;
    public static final int MIN_PA = 0;

/* ---------------------------- Object constants ---------------------------- */
    public final int pa;

    /**
     * Constuctor
     * @param nom Weapon's Name
     * @param Description Weapon's description
     * @param pA Weapon's attack point
     */
	public Arme(String nom, String Description, int pA) {
        super(nom, Description);
        
        if(Arme.MIN_PA <= pA && pA <= Arme.MAX_PA)
			this.pa = pA;
		else
			throw new IllegalArgumentException("The PA stats must be between " +
				Arme.MIN_PA + " and " + Arme.MAX_PA);
    }

/* ------------------------ Object inherited methods ------------------------ */
	/**
	 * (no-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weapon: " + this.nom + " (" + this.pa + ")" + "\n" +
			this.description;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#equals()
	 */
	@Override
	public boolean equals(Object obj) {
		boolean eval;
		
		if(this == obj)
			eval = true;
		else if(obj == null || obj instanceof Arme)
			eval = false;
		else
		{
			Arme weapon = (Arme)obj;
            eval = this.nom.equals(weapon.nom) &&
                this.description.equals(weapon.description) &&
                this.pa == weapon.pa;
		}
		
		return eval;
	}
}
