package com;

/**
 * @author Gwenael
 * @version 1.0
 * @created 07-nov.-2020 10:56:37
 */
public abstract class Item {

/* ---------------------------- Object constants ---------------------------- */
	public final String nom;
	public final String description;

/* ------------------------------ Constructors ------------------------------ */
	/**
	 * Constuctor
	 * @param name Item's name
	 * @param description Item's description
	 */
	public Item(String name, String description) {
		this.nom = name;
		this.description = description;
	}

/* ------------------------ Object inherited methods ------------------------ */
	/**
	 * (no-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{ return "Undefined: " + this.nom + "\n" + this.description; }

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#equals()
	 */
	@Override
	public boolean equals(Object obj)
	{
		boolean eval;
		
		if(this == obj)
			eval = true;
		else if(obj == null || obj instanceof Item)
			eval = false;
		else {
			Item item = (Item)obj;
			eval = this.nom.equals(item.nom) &&
				this.description.equals(item.description);
		}
		
		return eval;
	}
}