public class Combat {
    Description DefCombat;
    Personnage personnageChoisie;
    Personnage zombiePersonnage;

    public Combat(Description defCombat, Personnage personnageChoisie, Personnage zombiePersonnage) {
        DefCombat = defCombat;
        this.personnageChoisie = personnageChoisie;
        this.zombiePersonnage = zombiePersonnage;
    }
    public Description getDefCombat() {
        return DefCombat;
    }
    public Personnage getPersonnageChoisie() {
        return personnageChoisie;
    }
    public Personnage getZombiePersonnage() {
        return zombiePersonnage;
    }
    public void choixSurvivant(Survivant survivant){

    }
    public void choixArme(Arme arme){

    }
    public void combat() {
        if(personnageChoisie.PA > zombiePersonnage.PV){
            system.out.println("Vous avez gagnez le combat");
        }else{
            zombiePersonnage.PV = zombiePersonnage.PV - personnageChoisie.PA;
            if(personnageChoisie.PV < zombiePersonnage.PA){
                system.out.println(Description.GameOver);
            }else{
                if(personnageChoisie.PA > zombiePersonnage.PV){
                    system.out.println("Vous avez gagnez le combat");
                }
            }
        }
    }
}
