import java.io.IOException;

public class App {
    public static void main(String[] args)
    {
        System.out.println("=== Program start ===");

        Inventory hInventory = new Inventory();
        hInventory.addItem(new Arme("Arme de merde",
            "Une super arme de merde", 15));
        hInventory.addItem(new HealingItem("Heal de merde", 2, "description"));

        System.out.println(hInventory);

        System.out.println("=== Program stop  ===");
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
