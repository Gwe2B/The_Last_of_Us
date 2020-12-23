package com;

public class Combat {
    GameDescription DefCombat;
    Personnage personnageChoisie;
    Personnage zombiePersonnage;

    public Combat(GameDescription defCombat, Personnage personnageChoisie, Personnage zombiePersonnage) {
        DefCombat = defCombat;
        this.personnageChoisie = personnageChoisie;
        this.zombiePersonnage = zombiePersonnage;
    }
    public GameDescription getDefCombat() {
        return DefCombat;
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
}
