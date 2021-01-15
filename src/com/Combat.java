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
        if(personnageChoisie.PA > zombiePersonnage.PV){
            System.out.println("Vous avez gagnez le combat");
        }else{
            zombiePersonnage.PV = zombiePersonnage.PV - personnageChoisie.PA;
            if(personnageChoisie.PV < zombiePersonnage.PA){
                System.out.println(GameDescription.gameOver);
            }else{
                if(personnageChoisie.PA > zombiePersonnage.PV){
                    System.out.println("Vous avez gagnez le combat");
                }
            }
        }
    }

    public String toString() {
        return this.getDefCombat();
    }
}
