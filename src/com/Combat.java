package com;

/**
 * @author Marion
 * @version 1.0
 */
public class Combat {

/* --------------------------- Instance Attribute --------------------------- */
    GameDescription DefCombat;
    Personnage personnageChoisie;
    Personnage zombiePersonnage;


    /**
     * Combat constructor
     * @param defCombat The fight description 
     * @param personnageChoisie The personnage choose by the player
     * @param zombiePersonnage The zombie to fight
     */
    public Combat(GameDescription defCombat, Personnage personnageChoisie, Personnage zombiePersonnage) {
        DefCombat = defCombat;
        this.personnageChoisie = personnageChoisie;
        this.zombiePersonnage = zombiePersonnage;
    }

/* -------------------------- Accessors & mutators -------------------------- */
    /**
     * Get the fight Description
     * @return The fight description
     */
    public String getDefCombat() {
        return DefCombat.getDescription();
    }

    /**
     * Get the character choose by the player
     * @return the character
     */
    public Personnage getPersonnageChoisie() {
        return personnageChoisie;
    }

    /**
     * Get the zombie to fight
     * @return The zombie to fight
     */
    public Personnage getZombiePersonnage() {
        return zombiePersonnage;
    }

/* ------------------------ Object inherited methods ------------------------ */
    @Override
    public String toString() {
        return this.getDefCombat();
    }

/* ---------------------------- Instance methods ---------------------------- */
    /**
     * The fight logic (it's very... minimalist ^^')
     */
    public void combat() {
        do {
            zombiePersonnage.hurt(personnageChoisie.getPA());
            
            if(zombiePersonnage.getPV() > 0) {
                personnageChoisie.hurt(zombiePersonnage.getPA());
                if(personnageChoisie.getPV() < 0)
                    System.out.println(GameDescription.gameOver);
            } else
                System.out.println("Vous avez Gagné");
        } while(personnageChoisie.getPV() > 0 && zombiePersonnage.getPV() > 0);
    }
}
