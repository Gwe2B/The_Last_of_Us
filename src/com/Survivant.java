package com;

/**
 * @author Gwenael
 * @version 1.0
 */
public class Survivant extends Personnage {
    private Arme m_Arme;
    private Inventory m_Inventory;

    /**
     * @see Personnage constructor
     * @param inventaire The Survivor inventory
     */
    public Survivant(String nom, int pV, int pR, int pA,
    Inventory inventaire, String description) {
        super(nom, pV, pR, pA, description);
        this.m_Inventory = inventaire;
    }

/* -------------------------- Accessors & mutators -------------------------- */
    /**
     * Arme mutator
     * @param arme The new weapon
     */
    public void setArme(Arme arme) { this.m_Arme = arme; }

    public Inventory getInventory() { return this.m_Inventory; }

    @Override
    public int getPA() { return this.PA + this.m_Arme.pa; }

/* --------------------------- Attributes methods --------------------------- */
    /***
     * Heal the Survivor (increase his PV)
     * @param hp Amount of healing point to give
     */
    public void heal(int hp) { this.PV += hp; }
}
