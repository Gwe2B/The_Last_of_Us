
public class Arme {
    String nom;
    int PA;
    String Description;

    public Arme(String nom, int pA, String Description) {
        this.nom = nom;
        this.Description = Description;
        PA = pA;
    }
    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return Description;
    }
    public int getPA() {
        return PA;
    }
    public void ChoixArme(){
        // System.out.println("Veuillez choisir une arme (pistolet, couteau, arc, fusil):");
        // if (str == "pistolet"){
        //     Joel.PA = Joel.PA + Pistolet.PA;
        // }
        // if(str == "couteau"){
        //     Joel.PA = Joel.PA + Couteau.PA;
        // }
        // if(str == "arc"){
        //     Joel.PA = Joel.PA + Arc.PA;
        // }else{
        //     Joel.PA = Joel.PA + Fusil.PA;
        // }
    }
}
