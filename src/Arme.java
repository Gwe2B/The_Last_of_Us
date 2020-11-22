
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
}
