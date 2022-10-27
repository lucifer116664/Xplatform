package KI31.Chaplia.Lab7;

/**
 * <code>Tomato</code> describes tomato`s subject area
 */
public class Tomato extends Thing
{
    private final String color = "Red";

    public Tomato()
    {
        size = (int)(Math.random() * 6 + 1);
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
