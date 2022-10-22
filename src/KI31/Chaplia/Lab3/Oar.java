/**
 * Lab 3 package
 */
package KI31.Chaplia.Lab3;

/**
 * <code>Oar</code> describes oar subject area
 *
 * @author Lucifer116664
 * @version 1.0
 */
public class Oar
{
    private boolean isRowing;

    public Oar()
    {
        isRowing = false;
        BoatApp.setLog("Oar()\n");
    }

    /**
     * Method <code>startRowing</code>
     * makes the Oar`s object rowing
     */
    public void startRowing()
    {
        isRowing = true;
        BoatApp.setLog("Oar.startRowing()\n");
    }

    /**
     * Makes the Oar`s object stop rowing
     */
    public void stopRowing()
    {
        isRowing = false;
        BoatApp.setLog("Oar.stopRowing()\n");
    }

    public boolean getIsRowing()
    {
        return isRowing;
    }
}
