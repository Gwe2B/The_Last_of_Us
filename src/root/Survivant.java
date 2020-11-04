import java.util.Scanner;
public class Survivant extends Personnage {
    public Survivant(String nom, int pV, int pR, int pA, String Description) {
        super(nom, pV, pR, pA, Description);
    }
    Survivant Joel = new Survivant("Joel", 200, 100, 10, "Un homme d'une cinquantaine d'année, au début de la pandémie il avait 30 ans,", 
                                        "il a donc connu le monde avant le cordiceps. il a perdu sa fille au début de la pandémie.");
    Survivant Ellie = new Survivant("Ellie", 200, 50, 5, "Ellie est une jeune orpheline de 14 ans, elle n'a jamais connu le monde avant la pandémi.", 
                                        "au file du temps elle s'endurcie et lie un lien avec joel qui seras comme son père adoptif");
}
