import java.io.*;
import java.util.*;

import com.*;

public class App {

/* ---------------------------- Class Attributes ---------------------------- */
    static Survivant Joel;
    static Survivant Ellie;
    static Arme Pistolet = new Arme("Pistolet", "Description", 100);
    static Arme Couteau = new Arme("Couteau", "Description", 25);
    static Arme Arc = new Arme("Arc", "Description", 50);
    static Arme Fusil = new Arme("Fusil", "Description", 150);


/* ------------------------------ Class methods ----------------------------- */
    /**
     * Initialisation
     */
    public static void init() {
        Inventory buf = new Inventory(); // Inventaire partagée
        App.Joel = new Survivant("Joël", 200, 100, 10, buf, "Un homme d'une cinquantaine d'année, au début de la pandémie il avait 30 ans, il a donc connu le monde avant le cordiceps. il a perdu sa fille au début de la pandémie.");
        App.Ellie = new Survivant("Ellie", 200, 50, 5, buf, "Ellie est une jeune orpheline de 14 ans, elle n'a jamais connu le monde avant la pandémi. au file du temps elle s'endurcie et lie un lien avec joel qui seras comme son père adoptif");
    }

    /**
     * Main function
     * @param args The run variables
     */
    public static void main(String[] args) {
        init();
        Survivant choix;

        Zombie Rodeur = new Zombie("Rodeur", 100, 50, "Un rodeurs est un infécter de stade 1, tres désorienté, ne bouge pas a part en cas de bruit");
        Zombie Coureur = new Zombie("Coureur", 110, 60, "Un Coureur est un infécter de stade 2, peu désorienté, bouge constament avec un circuit précis, des le moindre bruit il court pour dévorer se qu'il passe");
        // Zombie Claqueur = new Zombie("Claqueur", 120, 70, "Un Claqueur est un infécter de stade 3, la tête de l'infecter est completement détruite, il a une ouî sur developper. si il vous attrappe vous etes mort");
        // Zombie Colosse = new Zombie("Colosse", 130, 100, "Un Colosse est un infécter de stade 4, tres désorienté, le colosse immence infecter, si il vous attrape vous serais en bouillie");
    
        System.out.println("1er Combat!");
        choix = choixSurvivant();
        choix.setArme(choixArme());

        Combat Partie1 = new Combat(GameDescription.firstCombat, choix, Rodeur);
        System.out.println(Partie1);
        Partie1.combat();

        clearScreen();
        gotoxy(0, 0);

        System.out.println("2e Combat!");
        choix = choixSurvivant();
        choix.setArme(choixArme());

        Combat Partie2 = new Combat(GameDescription.secondCombat, choix, Coureur);
        System.out.println(Partie2);
        Partie2.combat();

        // Combat Partie3 = new Combat(GameDescription.thirdCombat, choixSurvivant(), Claqueur);
        // Combat Partie4 = new Combat(GameDescription.lastCombat, choixSurvivant(), Colosse);
    }

/* ----------------------------- Inputs methods ----------------------------- */
    /**
     * Permit the user to select the character
     * @return the choisen character
     */
    public static Survivant choixSurvivant() {
        System.out.println("Choisissez votre Survivant pour le combat:\n" +
            "[0] - Joel\n[1] - Ellie\n");
        System.out.print("Votre choix? ");

        Scanner sc = new Scanner(System.in);    //Création du lecteur d'entrée
        Survivant survivant = null;
        int choix = -1;

        try { choix = sc.nextInt(); } //Tentative de premiere entrée
        catch(InputMismatchException e) {
            //! Une chaine de caractere à été saisie
            System.out.println(e.getMessage());
            sc.nextLine();
        }

        do {
            try {
                switch(choix) {
                    case 0:
                        survivant = App.Joel;
                        break;

                    case 1:
                        survivant = App.Ellie;
                        break;

                    default: // Saisie invalide
                        System.out.print("Choix Erronée!\nVotre choix? ");
                        choix = sc.nextInt(); // Nouvelle saisie
                        break;
                }
            } catch(InputMismatchException e) {
                //! Une chaine de caractere à ete saisie
                System.out.println("Erreur:" + e.getMessage());
                sc.nextLine();
            }
        } while(survivant == null);

        return survivant;
    }

    /**
     * Permit to the user to chose the weapon
     * @return the choisen weapon
     */
    public static Arme choixArme() {
        System.out.println("Choisissez votre Arme:");
        System.out.println("[0] - Pistolet\n[1] - Couteau\n" +
            "[2] - Arc\n[3] - Fusil\n");
        System.out.print("Votre choix? ");

        Scanner sc = new Scanner(System.in); // Création du lecteur d'entrée
        Arme arme = null;
        int choix = -1;

        try { choix = sc.nextInt(); } // Premiere entrée
        catch(InputMismatchException e) {
            //! Une chaine de caractere à ete saisie
            System.out.println(e.getMessage());
            sc.nextLine();
        }
        
        do{
            try {
                switch(choix) {
                    case 0:
                        arme = App.Pistolet;
                        break;
                    
                    case 1:
                        arme = App.Couteau;
                        break;

                    case 2:
                        arme = App.Arc;
                        break;

                    case 3:
                        arme = App.Fusil;
                        break;

                    default: // Entrée invalide
                        System.out.print("Choix Erronée!\nVotre choix? ");
                        choix = sc.nextInt(); // Nouvelle entrée
                        break;
                }
            } catch(InputMismatchException e) {
                //! Une chaine de caractere à ete saisie
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while(arme == null);

        return arme;
    }

/* ------------------------- Specific Output methods ------------------------ */
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
            //? Système Windows ou Linux?
            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        }
        catch(IOException | InterruptedException e)
        { System.err.println("Error: " + e.getMessage()); }
    }
}
