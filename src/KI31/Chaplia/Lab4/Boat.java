/**
 * Lab 4 package
 */
package KI31.Chaplia.Lab4;

/**
 * <code>Boat</code> (abstract class) describes boat`s position and movement subject area
 *
 * @author Lucifer116664
 * @version 3.0
 */
public abstract class Boat
{

    protected char rotation; //north, south, east or west
    protected int[] position; // x and y where the boat is

    /**
     * Changes position according to rotation
     */
    public abstract void go();
    /*{
        switch (rotation) 
        {
            case 'N' -> position[1]++;
            case 'W' -> position[0]--;
            case 'S' -> position[1]--;
            case 'E' -> position[0]++;
            default -> System.out.println("Something is wrong, ERROR!!!");
        }
    }*/

    /**
     * Changes rotation counterclockwise
     */
    public void turnLeft()
    {
        switch (rotation)
        {
            case 'N' -> rotation = 'W';
            case 'W' -> rotation = 'S';
            case 'S' -> rotation = 'E';
            case 'E' -> rotation = 'N';
            default -> System.out.println("Something is wrong, ERROR!!!");
        }
    }

    /**
     * Changes rotation clockwise
     */
    public void turnRight()
    {
        switch (rotation)
        {
            case 'N' -> rotation = 'E';
            case 'E' -> rotation = 'S';
            case 'S' -> rotation = 'W';
            case 'W' -> rotation = 'N';
            default -> System.out.println("Something is wrong, ERROR!!!");
        }
    }

    /**
     * Shows (in the terminal) the position and the rotation in current time
     */
    public void showPosAndRot()
    {
        switch (rotation)
        {
            case 'N' -> System.out.println("You are going to the NORTH.");
            case 'W' -> System.out.println("You are going to the WEST.");
            case 'S' -> System.out.println("You are going to the SOUTH.");
            case 'E' -> System.out.println("You are going to the EAST.");
            default -> System.out.println("Something is wrong, ERROR!!!");
        }
        System.out.println("Your position is :\n\tx: " + position[0] + "\n\ty: " + position[1]);
    }
}
