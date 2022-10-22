package KI31.Chaplia.Lab6;

import KI31.Chaplia.Lab5.Count;

import java.io.*;
import java.util.Scanner;

/**
 *<code>FileInOut</code> groups all the methods related with file input and output
 *
 * @author lucifer116664
 * @version 1.0
 */
public class FileInOut
{
    private File file = new File("src/KI31/Chaplia/Lab6/result.txt");
    private File binFile = new File("src/KI31/Chaplia/Lab6/result.bin");

    /**
     * File output
     * @param x for 1/cos(4x)
     * @throws FileNotFoundException
     */
    public void fileOut(double x) throws FileNotFoundException
    {
        PrintWriter fout = new PrintWriter(file);
        fout.print(Count.countMyVariant(x));
        fout.close();
    }

    /**
     * File input
     * @throws FileNotFoundException
     */
    public void fileIn() throws FileNotFoundException
    {
        Scanner fin = new Scanner(file);
        System.out.println(fin.next() + " - result from .txt file");
        fin.close();
    }

    /**
     * Binary file output
     * @param x for 1/cos(4x)
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binaryOut(double x) throws FileNotFoundException, IOException
    {
        DataOutputStream binFout = new DataOutputStream(new FileOutputStream(binFile));
        binFout.writeDouble(Count.countMyVariant(x));
        binFout.close();
    }


    /**
     * Binary file input
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binaryIn() throws FileNotFoundException, IOException
    {
        DataInputStream binFin = new DataInputStream(new FileInputStream(binFile));
        System.out.println(binFin.readDouble() + " - result from .bin file");
        binFin.close();
    }

    /**
     *
     * @return file path
     */
    public String getFilePath()
    {
        return file.getPath();
    }
}
