package com;

public class Survivant extends Personnage {
    private Arme mArme;

    /**
     * @see Personnage constructor
     */
    public Survivant(String nom, int pV, int pR, int pA, String description)
    { super(nom, pV, pR, pA, description); }

/* -------------------------- Accessors & mutators -------------------------- */
    /**
     * Arme mutator
     * @param arme The new weapon
     */
    public void setArme(Arme arme) { this.mArme = arme; }

    @Override
    public int getPA() { return this.PA + this.mArme.pa; }

/* --------------------------- Attributes methods --------------------------- */
    /***
     * Heal the Survivor (increase his PV)
     * @param hp Amount of healing point to give
     */
    public void heal(int hp) { this.PV += hp; }
}
