public abstract class Personnage {
    String nom;
    int PV;
    int PR;
    int PA;
    String Description;

    public Personnage(String nom, int pV, int pR, int pA, String description) {
        this.nom = nom;
        PV = pV;
        PR = pR;
        PA = pA;
        Description = description;
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
    public int getPR() {
        return PR;
    }
    public int getPV() {
        return PV;
    }
}
