package KI31.Chaplia.Lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        int command = 0;
        boolean makeNextLoop = true;
        
        CuppingGlass<Thing> banka = new CuppingGlass<>();

        while (makeNextLoop)
        {
            System.out.println("\tMenu:\n1 - Fill the cupping glass\n2 - Make the cupping glass empty\n3 - Find the biggest one in the cupping glass\n4 - Find the smallest one in the cupping glass\n5 - Show all thi things in the cupping glass\n0 - Quit\n\nEnter the command:\t");
            
            try(Scanner cin = new Scanner(System.in))
            {
                command = cin.nextInt();
            }
            catch (InputMismatchException i)
            {
                System.out.println("ERROR!!! Command you have entered does not exist.");
            }
            
            switch (command)
            {
                case 1 -> //Fill the cupping glass
                {
                    System.out.println("What exactly you wanna put to the cupping glass?\n1 - Tomatoes\n2 - Cucumbers\n0 - Go back\n\nEnter the command:\t");

                    try (Scanner cin = new Scanner(System.in))
                    {
                        command = cin.nextInt();
                    }
                    catch (InputMismatchException i)
                    {
                        System.out.println("ERROR!!! Command you have entered does not exist.");
                    }

                    switch (command)
                    {
                        case 1 -> //Putting in tomatoes
                        {
                            Tomato[] tomatoes = new Tomato[10];
                            for (int i = 0; i < tomatoes.length; i++) {
                                tomatoes[i] = new Tomato();
                            }
                            banka.put(tomatoes);
                        }
                        case 2 -> //Putting in cucumbers
                        {
                            Cucumber[] cucumbers = new Cucumber[10];
                            for (int i = 0; i < cucumbers.length; i++) {
                                cucumbers[i] = new Cucumber();
                            }
                            banka.put(cucumbers);
                        }
                        case 0 -> //Go back;
                            System.out.println();
                        default -> throw new IllegalStateException("Command does not exists: " + command);
                    }
                }
                case 2 -> //Make the cupping glass empty
                        banka.makeEmpty();
                case 3 -> //Find the biggest element of cupping glass
                        System.out.println("The biggest one is " + banka.findBiggest() + "cm long.");
                case 4 -> //Find the smallest element of cupping glass
                        System.out.println("The smallest one is " + banka.findSmallest() + "cm long.");
                case 5 -> //Show all the things in cupping glass
                        banka.showAll();
                case 0 -> //quit
                {
                    System.out.println("See you soon. Have a nice day!");
                    makeNextLoop = false;
                }
                default -> throw new IllegalStateException("Command does not exists: " + command);
            }
        }
    }
}
