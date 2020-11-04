import java.util.Scanner;
public class Personnage {
    String nom;
    int PV;
    int PR;
    int PA;
    String Description;

    public Personnage(String nom, int pV, int pR, int pA, String Description) {
        this.nom = nom;
        this.Description = Description;
        this.PV = pV;
        this.PR = pR;
        this.PA = pA;
    }
}
