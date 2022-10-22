/**
 * Lab 3 package
 */
package KI31.Chaplia.Lab3;

/**
 * <code>Boat</code> describes boat subject area
 *
 * @author Lucifer116664
 * @version 1.0
 */
public class Boat
{
    protected Oar leftOar = new Oar();
    protected Oar rightOar = new Oar();

    public Boat()
    {
        BoatApp.setLog("Boat()\n");
    }

    /**
     * Makes the Boat`s object go
     */
    public void go()
    {
        leftOar.startRowing();
        rightOar.startRowing();
        BoatApp.setLog("Boat.go()\n");
    }

    /**
     * Makes the Boat`s object turn left
     */
    public void turnLeft()
    {
        leftOar.startRowing();
        rightOar.stopRowing();
        BoatApp.setLog("Boat.turnLeft()\n");
    }

    /**
     * Makes the Boat`s object turn right
     */
    public void turnRight()
    {
        leftOar.stopRowing();
        rightOar.startRowing();
        BoatApp.setLog("Boat.turnRight()\n");
    }
}
