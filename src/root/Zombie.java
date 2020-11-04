import java.util.Scanner;
public class Zombie extends Personnage{
    public Zombie(Sting nom, int pV, int pA, String Description) {
        super(nom, pV, pA, Description);
    }
    Zombie Rodeur = new Zombie("Rodeur", 100, 50, "un rodeurs est un infécter de stade 1, tres désorienté, ne bouge pas a part en cas de bruit");
    Zombie Coureur = new Zombie("Coureur", 110, 60, "un Coureur est un infécter de stade 2, peu désorienté, bouge constament avec un circuit précis, des le moindre bruit il court pour dévorer se qu'il passe");
    Zombie Claqueur = new Zombie("Claqueur", 120, 70, "un Claqueur est un infécter de stade 3, la tête de l'infecter est completement détruite, il a une ouî sur developper. si il vous attrappe vous etes mort");
    Zombie Colosse = new Zombie("Colosse", 130, 100, "un Colosse est un infécter de stade 4, tres désorienté, le colosse immence infecter, si il vous attrape vous serais en bouillie");
}
