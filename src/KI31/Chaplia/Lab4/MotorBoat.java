/**
 * Lab 4 package
 */
package KI31.Chaplia.Lab4;

/**
 * <code>MotorBoat</code> extends boat and implements ISound
 *
 * @author Lucifer116664
 * @version 1.0
 */
public class MotorBoat extends Boat implements ISound
{
    public MotorBoat()
    {
        rotation = 'N';
        position = new int[]{0, 0};
    }

    /**
     * Overrides go method from Boat
     */
    @Override
    public void go()
    {
        switch (rotation)
        {
            case 'N' -> position[1]+=3;
            case 'W' -> position[0]-=3;
            case 'S' -> position[1]-=3;
            case 'E' -> position[0]+=3;
            default -> System.out.println("Something is wrong, ERROR!!!");
        }
    }

    /**
     * Makes sound when motorboat isn`t moving
     */
    @Override
    public void staySound()
    {
        System.out.println("Tr Tr Tr Tr Tr Tr Tr Tr");
    }

    /**
     * Makes sound when motorboat is moving
     */
    @Override
    public void moveSound()
    {
        System.out.println("Trrrrrrrrrrrrrrrrrrrrrr");
    }
}
