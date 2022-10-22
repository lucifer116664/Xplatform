package KI31.Chaplia.Lab2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Клас Lab2ChapliaKI31 реалізує програму 6 варіанту до лабораторної роботи N2
 *
 * @author Yurko
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab2ChapliaKI31
{
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     *
     */
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        PrintStream fout = null;
        try
        {
            fout = new PrintStream("src/KI31/Chaplia/Lab2/result.txt");
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }


        int size, min = 0;
        String sym;

        System.out.println("Enter size of the matrix:");
        size = cin.nextInt();
        System.out.println("Enter symbol you want to be used to draw the picture:");
        sym = cin.next();

        while (sym.length() != 1)
        {
            if(sym.length() >1)
            {
                System.out.println("You can enter only one symbol. Try again:");
            }
            else
            {
                System.out.println("You have entered nothing. Try again:");
            }
            sym = cin.next();
        }

        char[][] matrix = new char[size][size];

        size--;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (j > min && j < size || j < min && j > size)
                {
                    matrix[i][j] = ' ';
                }
                else
                {
                    matrix[i][j] = (char) sym.codePointAt(0);
                }
            }
            min++;
            size--;
        }

        for (int i = 0; i< matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
                fout.print(matrix[i][j] + "\t");
            }
            System.out.println();
            fout.println();
        }
    }
}
