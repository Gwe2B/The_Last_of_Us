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
        System.out.println("Choigissez votre Survivant pour le combat (Joel ou Ellie)");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String chaine = in.readLine();
        if (chaine == "Joel"){
            survivant = Survivant.Joel;
        }if(chaine == "Ellie"){
            survivant = Survivant.Ellie;
        }else{
            //mettre une erreur ecrite et renvoyer la methode
        }
        return survivant;
    }
    public Arme choixArme(Arme arme) throws IOException {
        System.out.println("Choigissez votre Arme pour votre survivant (Pistolet, Couteau, Arc, Fusil)");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String chaine = in.readLine();
        if (chaine == "Pistolet"){
            arme = Arme.Pistolet;
        }if(chaine == "Couteau"){
            arme = Arme.Couteau;
        if (chaine == "Arc"){
            arme = Arme.Arc;
        }if(chaine == "Fusil"){
            arme = Arme.Fusil;
        }else{
            //mettre une erreur ecrite et renvoyer la methode
        }
        return arme;
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
