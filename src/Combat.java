public class Combat {
    Description DefCombat;
    Personnage Joel;
    Personnage Ellie;
    Personnage zombiePersonnage;

    public Combat(Description defCombat, Personnage joel, Personnage ellie, Personnage zombiePersonnage) {
        DefCombat = defCombat;
        Joel = joel;
        Ellie = ellie;
        this.zombiePersonnage = zombiePersonnage;
    }
    public Description getDefCombat() {
        return DefCombat;
    }
    public Personnage getEllie() {
        return Ellie;
    }
    public Personnage getJoel() {
        return Joel;
    }
    public Personnage getZombiePersonnage() {
        return zombiePersonnage;
    }
    
    // //public combat(Combat){
    //     if(Joel.PA > Zombie.PV){
    //         system.out.println("Vous avez gagnez le combat");
    //     }else{
    //         Zombie.PV = Zombie.PV - Joel.PA;
    //         if(Joel.PV < Zombie.PA){
    //             system.out.println(Description.GameOver);
    //         }else{
    //             if(Joel.PA > Zombie.PV){
    //                 system.out.println("Vous avez gagnez le combat");
    //             }
    //         }
    //     }
    // }
}
