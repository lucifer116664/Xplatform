package KI31.Chaplia.Lab7;

/**
 * Abstract class <code>Thing</code> describes the subject area of any thing which can be put to the cupping glass
 */
public abstract class Thing
{
    protected int size;

    public abstract void getInfo();

    /**
     * @return size
     */
    public int getSize()
    {
        return size;
    }
}
