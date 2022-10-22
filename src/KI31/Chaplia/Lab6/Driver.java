package KI31.Chaplia.Lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <code>Driver</code> for the Count and FileInOut classes
 *
 * @author lucifer116664
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        double x;
        Scanner cin = new Scanner(System.in);
        FileInOut finout = new FileInOut();

        System.out.print("This program will count \"y = 1/cos(4x)\"\nEnter x: ");

        try
        {
            x = cin.nextDouble();
            finout.fileOut(x);
            finout.binaryOut(x);
            finout.fileIn();
            finout.binaryIn();
        }
        catch (FileNotFoundException f)
        {
            System.out.println("File not found exception: " + finout.getFilePath() + " not found.");
        }
        catch (InputMismatchException i)
        {
            System.out.println("Input mismatch exception: you have entered \"x\" wrong.");
        }
        catch (ArithmeticException a)
        {
            System.out.println("Divide by zero exception: try to print another \"x\", it is not possible to count the equation with this one.");
        }
        catch (IOException io)
        {
            System.out.println("Input output exception: wrong data in binary file.");
        }
    }
}


