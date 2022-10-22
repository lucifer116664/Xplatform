package KI31.Chaplia.Lab5;

/**
 * <code>Count</code> is counting the equations
 *
 * @author lucifer116664
 * @version 1.0
 */
public class Count
{

    /**
     *
     * @param x is chosen by user
     * @return 1/cos(4x)
     */
    public static double countMyVariant(double x) throws ArithmeticException
    {
        if (Math.cos(4 * x) == 0)
        {
            throw new ArithmeticException();
        }
        return 1 / Math.cos(4 * x);
    }
}
