import java.util.Scanner;
public class Combat {
    Description DefCombat;
    Personnage Joel;
    Personnage Ellie;
    Personnage zombiePersonnage;

    public Combat(String defCombat, Personnage joel, Personnage ellie, Personnage zombiePersonnage) {
        DefCombat = defCombat;
        Joel = joel;
        Ellie = ellie;
        this.zombiePersonnage = zombiePersonnage;
    }
    Combat Partie1 = new Combat(DefCombat.PremierCombat, Personnage.Joel, Personnage.Ellie, Personnage.Rodeur);
    Combat Partie2 = new Combat(DefCombat.DeuxièmeCombat, Personnage.Joel, Personnage.Ellie, Personnage.Coureur);
    Combat Partie3 = new Combat(DefCombat.TroisièmeCombat, Personnage.Joel, Personnage.Ellie, Personnage.Claqueur);
    Combat Partie4 = new Combat(DefCombat.DernierCombat, Personnage.Joel, Personnage.Ellie, Personnage.Colosse);
    
    public combat(Combat){
        if(Joel.PA > Zombie.PV){
            system.out.println("Vous avez gagnez le combat");
        }else{
            Zombie.PV = Zombie.PV - Joel.PA;
            if(Joel.PV < Zombie.PA){
                system.out.println(Description.GameOver);
            }else{
                if(Joel.PA > Zombie.PV){
                    system.out.println("Vous avez gagnez le combat");
                }
            }
        }
    }
}
