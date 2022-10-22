/**
 * Lab 4 package
 */
package KI31.Chaplia.Lab4;

import java.util.Scanner;

/**
 * <code>MotorBoatApp</code> is the class-driver for the motorboat
 *
 * @author Lucifer116664
 * @version 1.0
 */
public class MotorBoatApp
{
    private static String command = ""; //w - go, a - turn left, d - turn right

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        MotorBoat mb = new MotorBoat();

        while (!command.equals("q"))
        {
            mb.showPosAndRot();
            rule(mb, cin);
        }
    }

    /**
     * Rules the boat according to user`s commands
     *
     * @param mb MotorBoat object
     * @param cin Scanner object
     */
    public static void rule(MotorBoat mb, Scanner cin)
    {
        do
        {
            System.out.print("Enter the command (w - go, a - left, d - right, q - quit):\t");
            command = cin.nextLine();
            switch (command)
            {
                case "w" ->
                {
                    mb.go();
                    mb.moveSound();
                }
                case "a" ->
                {
                    mb.turnLeft();
                    mb.staySound();
                }
                case "d" ->
                {
                    mb.turnRight();
                    mb.staySound();
                }
                case "q" -> System.out.println("Good bye!!!");
                default ->
                {
                    if (command.length() > 1)
                    {
                        System.out.println("You can enter only one symbol. Try again:");
                    }
                    else
                    {
                        System.out.println("You have entered nothing. Try again:");
                    }
                }
            }
        }while (command.length() != 1);
    }
}
