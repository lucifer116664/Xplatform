package KI31.Chaplia.Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <code>CuppingGlass</code> describes the subject area of cupping glass
 *
 * @param <T> any class that extends <code>Thing</code>
 */
public class CuppingGlass<T extends Thing>
{
    private final List<T> things;

    public CuppingGlass()
    {
        this.things = new ArrayList<>();
    }

    /**
     * Removes all things from cupping glass
     */
    public void makeEmpty()
    {
        if (things.isEmpty())
        {
            System.out.println("The cupping glass is already empty.\n");
        }
        else
        {
            things.removeAll(things);
            System.out.println("The cupping glass is empty now.\n");
        }
    }

    /**
     * Puts array of <code>Thing</code> object to the cupping glass
     *
     * @param newThings thing that must be put in
     */
    public void put(T[] newThings)
    {
        if (things.isEmpty())
        {
            this.things.addAll(Arrays.asList(newThings));
        }
        else
        {
            System.out.println("You can not put something in. The cupping glass is already filled.\n");
        }
    }

    /**
     * Shows <code>Thing</code> object with the smallest size
     */
    public void findSmallest()
    {
        if(things.isEmpty())
        {
            System.out.println("The cupping glass is empty.\n");
        }
        else
        {
            T smallest = things.get(0);
            for (T thing : things)
            {
                if (thing.getSize() < smallest.getSize())
                {
                    smallest = thing;
                }
            }
            System.out.println("The smallest one is " + smallest.getSize() + "cm long.\n");
        }

    }

    /**
     * Shows <code>Thing</code> object with the biggest size
     */
    public void findBiggest()
    {
        if(things.isEmpty())
        {
            System.out.println("The cupping glass is empty.\n");
        }
        else
        {
            T biggest = things.get(0);
            for (T thing : things)
            {
                if (thing.getSize() > biggest.getSize())
                {
                    biggest = thing;
                }
            }
            System.out.println("The biggest one is " + biggest.getSize() + "cm long.\n");
        }
    }

    /**
     * Shows all the <code>Thing</code> objects in the cupping glass
     */
    public void showAll()
    {
        if(things.isEmpty())
        {
            System.out.println("The cupping glass is empty.\n");
        }
        else
        {
            System.out.println("Here are characteristics of all the things in the cupping glass:");
            for (T thing : things)
            {
                thing.getInfo();
            }
            System.out.println();
        }
    }
}
