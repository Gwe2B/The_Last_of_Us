package com;

public abstract class Personnage {
    protected String nom;
    protected int PV;
    protected int PR;
    protected int PA;
    protected String Description;

    /**
     * Constructor
     * @param nom The Personnage's name
     * @param pV Personnage's vital points
     * @param pR Personnage's resistance points
     * @param pA Personnage's attack points
     * @param description Personnage's description
     */
    public Personnage(String nom, int pV, int pR, int pA, String description) {
        this.nom = nom;
        PV = pV;
        PR = pR;
        PA = pA;
        Description = description;
    }

/* -------------------------- Accessors & mutators -------------------------- */
    /**
     * Nom Accessor
     * @return Personnage's name
     */
    public String getNom()
    { return nom; }

    /**
     * Description accessor
     * @return the personnage's description
     */
    public String getDescription()
    { return Description; }

    /**
     * PA accessor
     * @return attack points
     */
    public int getPA() 
    { return PA; }
    
    /**
     * PR accessor
     * @return Resistance points
     */
    public int getPR()
    { return PR; }

    /**
     * PV accessor
     * @return Vital points
     */
    public int getPV()
    { return PV; }

/* ---------------------------- instance methods ---------------------------- */
    /**
     * Hurt the personnage & give damage (decreasing the PV)
     * @param damage The amount of damage
     */
    public void hurt(int damage) { this.PV -= damage; }
}
