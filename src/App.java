import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello World!!");
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
