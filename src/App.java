import java.io.IOException;

import com.*;
import java.io.*;

public class App {
    static Survivant Joel = new Survivant("Joel", 200, 100, 10, "Un homme d'une cinquantaine d'année, au début de la pandémie il avait 30 ans, il a donc connu le monde avant le cordiceps. il a perdu sa fille au début de la pandémie.");
    static Survivant Ellie = new Survivant("Ellie", 200, 50, 5, "Ellie est une jeune orpheline de 14 ans, elle n'a jamais connu le monde avant la pandémi. au file du temps elle s'endurcie et lie un lien avec joel qui seras comme son père adoptif");
    static Arme Pistolet = new Arme("pistolet", 100, "Description");
    static Arme Couteau = new Arme("couteau", 25, "Description");
    static Arme Arc = new Arme("arc", 50, "Description");
    static Arme Fusil = new Arme("fusil", 150, "Description");
    
    public static Survivant choixSurvivant() throws IOException {
        System.out.println("Choigissez votre Survivant pour le combat (Joel ou Ellie)");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String chaine = in.readLine();
        Survivant survivant = null;
        if (chaine == "Joel"){
            survivant = App.Joel;
        }else if(chaine == "Ellie"){
            survivant = App.Ellie;
        }else{
            //mettre une erreur ecrite et renvoyer la methode
        }
        return survivant;
    }
    public static Arme choixArme() throws IOException {
        System.out.println("Choigissez votre Arme pour votre survivant (Pistolet, Couteau, Arc, Fusil)");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String chaine = in.readLine();
        Arme arme = null;
        if (chaine == "Pistolet"){
            arme = App.Pistolet;
        }else if(chaine == "Couteau"){
            arme = App.Couteau;
        }else if(chaine == "Arc"){
            arme = App.Arc;
        }else if(chaine == "Fusil"){
            arme = App.Fusil;
        }else{
            //mettre une erreur ecrite et renvoyer la methode
        }
        return arme;
    }
    public static void main(String[] args) throws IOException {
        Description introduction = new Description("À l'été 2033, les villes sont désormais abandonnées et la nature a repris ses droits. Infectés et bandits rôdent et les rares zones sécurisées sont sous le contrôle de l’armée ou des Lucioles. Joel est désormais âgé d’environ 50 ans et vit dans une zone militaire de la ville de Boston. Le colis en question n’est autre qu’Ellie, une orpheline de 14 ans. Le duo accepte à contre-cœur l'offre de la cheffe rebelle."); 
        Description PremierCombat = new Description("Après avoir traversé divers passages en surface et en souterrain, ils sont arrêtés dans leur fuite par des militaires, qui procèdent alors à un contrôle d'infectiosité. Lorsque le soldat scanne Ellie, elle se retourne et l'attaque sauvagement. Joel découvre alors que l'adolescente réagit positivement au test d'infection. Le test établit qu'elle est contaminée depuis trois semaines, alors que l’infection se propage normalement au sein d'un hôte en un laps de temps maximum de deux jours. Ellie est donc une porteuse saine, immunisée aux spores. et la un rodeur LE COMBAT COMMENCE");
        Description DeuxièmeCombat = new Description("Apres ce combat Joel et Ellie se rende au Capitol et la toute les lucioles sont morte et decide d'aller rendre visite a tommy le frere de joel car il fesait partie des luciole avant. Mais en route il tombe sur un coureur. LE COMBAT COMMENCE");
        Description TroisièmeCombat = new Description("Apres ces evenement il trouve enfin Tommy et joel lui demande de s'occuper de Ellie et de l'emmener pour lui au luciole. Ellie entend tout et s'enfuit. Apres que joel et Tommy se soit mis a la recherche de l'adolecentes, Ils la touve ,joel commence discuter avec ellie et elle lui avoue que c'est la seule personne qui ne l'avait pas abandonner jusqu'a maintenant. donc joel decide de continuer le voyage avec ellie. en reprennant le voyage Ellie et Joel tombe sur un claqueurs. LE COMBAT COMMENCE");
        Description DernierCombat = new Description("Printemps 2034. Le duo arrive à Salt Lake City par l’interstate 15. Ils y sont notamment médusés à la vue d'un troupeau de girafes se baladant librement en ville. Ils traversent ensuite un tunnel menant à l’hôpital Sainte-Marie, où résident les Lucioles. Les survivants tombe sur le pire des infecter un colosse. LE COMBAT COMMENCE");
        Description DernièrePartie = new Description("Ellie ne sachant pas nager et le tunnel étant inondé, cette dernière se noie. Joel tente alors de lui pratiquer un massage cardiaque lorsque des Lucioles l’accostent. Ce dernier les ignore, mais un des soldats le frappe avec son fusil et il s’évanouit sur le coup. Une fois réveillé, Joel se retrouve dans une salle de l’hôpital, et apprend par le biais de Marlene qu’Ellie est sur le point d’être opérée, afin de fabriquer le vaccin contre l’infection. Cependant, l’opération consiste à déloger le champignon mutant qui se trouve dans, le cerveau de la fille. Le dernier choix arrive aller vous sauver ellie ou la laiser mourir pour faire un vaccins qui ne pourras peut etre pas marcher");
        //Description choix1 = new Description("defScenario"); je me souviens pas pourquoi j'ai ajouter ces deux ligne
        //Description choix2 = new Description("defScenario");
        Description GameOver = new Description("Vous etes mort, C'est un Game over");
       
        Zombie Rodeur = new Zombie("Rodeur", 100, 50, "un rodeurs est un infécter de stade 1, tres désorienté, ne bouge pas a part en cas de bruit");
        Zombie Coureur = new Zombie("Coureur", 110, 60, "un Coureur est un infécter de stade 2, peu désorienté, bouge constament avec un circuit précis, des le moindre bruit il court pour dévorer se qu'il passe");
        Zombie Claqueur = new Zombie("Claqueur", 120, 70, "un Claqueur est un infécter de stade 3, la tête de l'infecter est completement détruite, il a une ouî sur developper. si il vous attrappe vous etes mort");
        Zombie Colosse = new Zombie("Colosse", 130, 100, "un Colosse est un infécter de stade 4, tres désorienté, le colosse immence infecter, si il vous attrape vous serais en bouillie");
    
        
        Combat Partie1 = new Combat(PremierCombat, choixSurvivant(), Rodeur);
        Combat Partie2 = new Combat(DeuxièmeCombat, choixSurvivant(), Coureur);
        Combat Partie3 = new Combat(TroisièmeCombat, choixSurvivant(), Claqueur);
        Combat Partie4 = new Combat(DernierCombat, choixSurvivant(), Colosse);
    }

    /**
     * Move the cursor to the coordinates (x, y)
     * @param x Line number (The first line is 0 on top)
     * @param y Column number (The first column is 0 on left)
     */
    public static void gotoxy(int x, int y)
    { System.out.print(String.format("%c[%d;%df", 0x1B, y, x)); }

    /**
     * Clear the console
     */
    public static void clearScreen()
    {
        try
        {
            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        }
        catch(IOException | InterruptedException e)
        { System.err.println("Error: " + e.getMessage()); }
    }
}
