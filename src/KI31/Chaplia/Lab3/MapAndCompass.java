/**
 * Lab 3 package
 */
package KI31.Chaplia.Lab3;

/**
 * <code>MapAndCompass</code> describes boat`s position and movement subject area
 *
 * @author Lucifer116664
 * @version 2.0
 */
public class MapAndCompass
{

    private char rotation; //north, south, east or west
    private int[] position; // x and y where the boat is
    private final Boat BOAT = new Boat();

    public MapAndCompass()
    {
        rotation = 'N';
        position = new int[]{0, 0};
        BoatApp.setLog("MapAndCompass()\n");
    }

    /**
     * Changes position according to rotation
     */
    public void go()
    {
        BOAT.go();
        if (BOAT.leftOar.getIsRowing() && BOAT.rightOar.getIsRowing())
        {
            switch (rotation) {
                case 'N' -> position[1]++;
                case 'W' -> position[0]--;
                case 'S' -> position[1]--;
                case 'E' -> position[0]++;
                default -> System.out.println("Something is wrong, ERROR!!!");
            }
            BoatApp.setLog("MapAndCompass.go()\n");
        }
        else
        {
            System.out.println("Something is wrong? ERROR!!!");
            BoatApp.setLog("MapAndCompass.go() ERROR!!!\n");
        }
    }

    /**
     * Changes rotation counterclockwise
     */
    public void turnLeft()
    {
        BOAT.turnLeft();
        if (BOAT.leftOar.getIsRowing() && !BOAT.rightOar.getIsRowing())
        {
            switch (rotation) {
                case 'N' -> rotation = 'W';
                case 'W' -> rotation = 'S';
                case 'S' -> rotation = 'E';
                case 'E' -> rotation = 'N';
                default -> System.out.println("Something is wrong, ERROR!!!");
            }
            BoatApp.setLog("MapAndCompass.turnLeft()\n");
        }
        else
        {
            System.out.println("Something is wrong? ERROR!!!");
            BoatApp.setLog("MapAndCompass.go() ERROR!!!\n");
        }
    }

    /**
     * Changes rotation clockwise
     */
    public void turnRight()
    {
        BOAT.turnRight();
        if(!BOAT.leftOar.getIsRowing() && BOAT.rightOar.getIsRowing())
        {
            switch (rotation) {
                case 'N' -> rotation = 'E';
                case 'E' -> rotation = 'S';
                case 'S' -> rotation = 'W';
                case 'W' -> rotation = 'N';
                default -> System.out.println("Something is wrong, ERROR!!!");
            }
            BoatApp.setLog("MapAndCompass.turnRight()\n");
        }
        else
        {
            System.out.println("Something is wrong? ERROR!!!");
            BoatApp.setLog("MapAndCompass.go() ERROR!!!\n");
        }
    }

    /**
     * Shows (in the terminal) the position and the rotation in current time
     */
    public void showPosAndRot()
    {
        switch (rotation) {
            case 'N' -> System.out.println("You are going to the NORTH.");
            case 'W' -> System.out.println("You are going to the WEST.");
            case 'S' -> System.out.println("You are going to the SOUTH.");
            case 'E' -> System.out.println("You are going to the EAST.");
            default -> System.out.println("Something is wrong, ERROR!!!");
        }
        System.out.println("Your position is :\n\tx: " + position[0] + "\n\ty: " + position[1]);
        BoatApp.setLog("MapAndCompass.showPosAndRot()\n");
    }
}
