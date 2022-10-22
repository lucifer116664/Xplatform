/**
 * Lab 3 package
 */
package KI31.Chaplia.Lab3;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * <code>BoatApp</code> is the class-driver for the boat with oars
 *
 * @author Lucifer116664
 * @version 1.0
 */
public class BoatApp
{
    private static String log = "";
    private static String command = ""; //w - go, a - turn left, d - turn right


    /**
     * Main method
     *
     * @param args terminal args
     */
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        MapAndCompass mac = new MapAndCompass();

        while (!command.equals("q"))
        {
            mac.showPosAndRot();
            rule(mac, cin);
        }

        try(PrintStream fout = new PrintStream("src/KI31/Chaplia/Lab3/log.txt"))
        {
            fout.print(log);
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * Rules the boat according to user`s commands
     *
     * @param mac MapAndCompass object
     * @param cin Scanner object
     */
    public static void rule(MapAndCompass mac, Scanner cin)
    {
        do
        {
            System.out.print("Enter the command (w - go, a - left, d - right, q - quit):\t");
            command = cin.nextLine();
            switch (command)
            {
                case "w":
                    mac.go();
                    break;

                case "a":
                    mac.turnLeft();
                    break;

                case "d":
                    mac.turnRight();
                    break;

                case "q":
                    System.out.println("Good bye!!!");
                    break;

                default:
                    if (command.length() > 1)
                    {
                        System.out.println("You can enter only one symbol. Try again:");
                    }
                    else
                    {
                        System.out.println("You have entered nothing. Try again:");
                    }
                    break;
            }
        }while (command.length() != 1);
        setLog("BoatApp.rule()\n");
    }

    /**
     * Setter for the log field
     *
     * @param log field keeps the program`s log
     */
    public static void setLog(String log)
    {
        BoatApp.log += log;
    }
}
