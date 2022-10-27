package KI31.Chaplia.Lab7;

/**
 * <code>Cucumber</code> describes cucumber`s subject area
 */
public class Cucumber extends Thing
{
    private final String color = "Green";

    public Cucumber()
    {
        size = (int)(Math.random() * 10 + 1);
    }

    /**
     * Shows all the info about cucumber
     */
    @Override
    public void getInfo()
    {
        System.out.println("\t" + color + ", " + size + "cm");
    }
}
