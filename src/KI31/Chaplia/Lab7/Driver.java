package KI31.Chaplia.Lab7;

import java.util.Scanner;

/**
 * <code>Driver</code> is UI for the <code>CuppingGlass</code>
 */
public class Driver
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String command;
        boolean makeNextLoop = true;
        
        CuppingGlass<Thing> banka = new CuppingGlass<>();

        while (makeNextLoop)
        {
            System.out.print("\tMenu:\n1 - Fill the cupping glass\n2 - Make the cupping glass empty\n3 - Find the biggest one in the cupping glass\n4 - Find the smallest one in the cupping glass\n5 - Show all the things in the cupping glass\n0 - Quit\n\nEnter the command:\t");

            command = cin.next();

            switch (command)
            {
                case "1" -> //Fill the cupping glass
                {
                    System.out.print("What exactly you wanna put to the cupping glass?\n1 - Tomatoes\n2 - Cucumbers\n0 - Go back\n\nEnter the command:\t");

                    command = cin.next();

                    switch (command)
                    {
                        case "1" -> //Putting in tomatoes
                        {
                            Tomato[] tomatoes = new Tomato[10];
                            for (int i = 0; i < tomatoes.length; i++)
                            {
                                tomatoes[i] = new Tomato();
                            }
                            banka.put(tomatoes);
                        }
                        case "2" -> //Putting in cucumbers
                        {
                            Cucumber[] cucumbers = new Cucumber[10];
                            for (int i = 0; i < cucumbers.length; i++)
                            {
                                cucumbers[i] = new Cucumber();
                            }
                            banka.put(cucumbers);
                        }
                        case "0" -> //Go back;
                            System.out.println();
                        default -> System.out.println("ERROR!!! Command you have entered does not exist.\n");
                    }
                }
                case "2" -> //Make the cupping glass empty
                        banka.makeEmpty();
                case "3" -> //Find the biggest element of cupping glass
                    banka.findBiggest();

                case "4" -> //Find the smallest element of cupping glass
                    banka.findSmallest();

                case "5" -> //Show all the things in cupping glass
                        banka.showAll();
                case "0" -> //quit
                {
                    System.out.println("See you soon. Have a nice day!");
                    makeNextLoop = false;
                }
                default -> System.out.println("ERROR!!! Command you have entered does not exist.\n");
            }
        }
    }
}
