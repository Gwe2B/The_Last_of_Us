package com;

/**
 * @author Marion
 * @version 1.0
 */
public class Combat {
    GameDescription DefCombat;
    Personnage personnageChoisie;
    Personnage zombiePersonnage;

    public Combat(GameDescription defCombat, Personnage personnageChoisie, Personnage zombiePersonnage) {
        DefCombat = defCombat;
        this.personnageChoisie = personnageChoisie;
        this.zombiePersonnage = zombiePersonnage;
    }
    public String getDefCombat() {
        return DefCombat.getDescription();
    }
    public Personnage getPersonnageChoisie() {
        return personnageChoisie;
    }
    public Personnage getZombiePersonnage() {
        return zombiePersonnage;
    }
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

    public String toString() {
        return this.getDefCombat();
    }
}
