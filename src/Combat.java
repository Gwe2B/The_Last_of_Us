import java.io.*;
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
    public Survivant choixSurvivant(Survivant survivant) throws IOException {
        System.out.println("Choigisez votre Survivant pour le combat (Joel ou Ellie)");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String chaine = in.readLine();
        if (chaine == "Joel"){
            survivant = Personnage.Joel;
        }if(chaine == "Ellie"){
            survivant = survivant.Ellie;
        }else{

        }
        return survivant;
    }
    public void choixArme(Arme arme){

    }
    public void combat() {
        if(personnageChoisie.PA > zombiePersonnage.PV){
            System.out.println("Vous avez gagnez le combat");
        }else{
            zombiePersonnage.PV = zombiePersonnage.PV - personnageChoisie.PA;
            if(personnageChoisie.PV < zombiePersonnage.PA){
                System.out.println(Description.GameOver);
            }else{
                if(personnageChoisie.PA > zombiePersonnage.PV){
                    System.out.println("Vous avez gagnez le combat");
                }
            }
        }
    }
}
