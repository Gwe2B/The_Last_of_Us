import java.util.Scanner;
public class Arme {
    String nom;
    int PA;
    String Description;

    public Arme(String nom, int pA, String Description) {
        this.nom = nom;
        this.Description = Description;
        PA = pA;
    }
    Scanner saisieUtilisateur = new Scanner(System.in);
    Arme Pistolet = new Arme("pistolet", 100, Description);
    Arme Couteau = new Arme("couteau", 25, Description);
    Arme Arc = new Arme("arc", 50, Description);
    Arme Fusil = new Arme("fusil", 150, Description);

    public void ChoixArme(){
        System.out.println("Veuillez choisir une arme (pistolet, couteau, arc, fusil):");
        String str = saisieUtilisateur.next();
        if (str == "pistolet"){
            Joel.PA = Joel.PA + Pistolet.PA;
        }
        if(str == "couteau"){
            Joel.PA = Joel.PA + Couteau.PA;
        }
        if(str == "arc"){
            Joel.PA = Joel.PA + Arc.PA;
        }else{
            Joel.PA = Joel.PA + Fusil.PA;
        }
    }
}
