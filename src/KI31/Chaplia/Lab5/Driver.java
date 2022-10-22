package KI31.Chaplia.Lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <code>Driver</code> for the Count class
 *
 * @author lucifer116664
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        File file = new File("src/KI31/Chaplia/Lab5/result.txt");
        Scanner cin = new Scanner(System.in);

        try(PrintStream fout = new PrintStream(file); Scanner fin = new Scanner(file))
        {
            System.out.println("This program will count \"y = 1/cos(4x)\"\nEnter x:");
            fout.print(Count.countMyVariant(cin.nextDouble()));
            System.out.println(fin.next());
        }
        catch (FileNotFoundException f)
        {
            System.out.println("File not found exception: " + file + " not found.");
        }
        catch (InputMismatchException i)
        {
            System.out.println("Input mismatch exception: you have entered \"x\" wrong.");
        }
        catch (ArithmeticException a)
        {
            System.out.println("Divide by zero exception: try to print another \"x\", it is not possible to count the equation with this one.");
        }
    }
}
