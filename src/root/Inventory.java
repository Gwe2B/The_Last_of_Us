/**
 * @author Gwenael
 * @version 1.0
 * @created 07-nov.-2020 10:56:37
 */

import java.util.ArrayList;

class Inventory {

/* ---------------------------- Object Attributs ---------------------------- */
    private ArrayList<Item> inventaire = new ArrayList<Item>();

    /**
     * Constructor
     */
    public Inventory() {}

/* ------------------------ Object inherited methods ------------------------ */
    /**
	 * (no-Javadoc)
	 * @see java.lang.Object#toString()
	 */
    @Override
    public String toString() {
        String result = "Inventory\n";
        result += "-----------------------------\n";
        
        for(Item el : this.inventaire) {
            result += el.toString() + "\n";
        }

        return result;
    }

    /**
	 * (no-Javadoc)
	 * @see java.lang.Object#equals()
	 */
    @Override
    public boolean equals(Object obj)
    {
        boolean eval;
		
		if(this == obj)
			eval = true;
		else if(obj == null || obj instanceof Inventory)
			eval = false;
		else {
			Inventory buff = (Inventory)obj;
			eval = this.inventaire.equals(buff.inventaire);
		}
		
		return eval;
    }

/* ----------------------------- Object Methods ----------------------------- */
    /**
     * Add an item to the inventory
     * @param toAdd Item to add
    */
    public void addItem(Item toAdd)
    { this.inventaire.add(toAdd); }

    /**
     * Getter of inventaire
     * @return the inventory
     */
    public ArrayList<Item> getInventaire()
    { return this.inventaire; }

    /**
     * Get an Item
     * @param index The index of the desired item
     * @return The desired item
     */
    public Item getItem(int index)
    { return this.inventaire.get(index); }

    /**
     * Remove an item from the inventory
     * @param index The index of the item to remove
     * @return The removed item
     */
    public Item removeItem(int index) {
        Item buff = this.inventaire.get(index);
        this.inventaire.remove(index);
        return buff;
    }

    /**
     * Get the inventory size
     * @return The inventory Size
     */
    public int getInventorySize()
    { return this.inventaire.size(); }
}