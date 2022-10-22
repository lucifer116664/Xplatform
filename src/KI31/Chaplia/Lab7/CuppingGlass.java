package KI31.Chaplia.Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuppingGlass<T extends Thing>
{
    //private T[] things;
    private final List<T> things;

    public CuppingGlass()
    {
        this.things = new ArrayList<T>();
    }

    public void makeEmpty()
    {
        /*for(int i = 0; i < things.size(); i++)
        {
            things.remove(i);
        }*/
        things.removeAll(things);
    }

    public void put(T[] newThings)
    {
        this.things.addAll(Arrays.asList(newThings));
    }
    
    public T findSmallest()
    {
        T smallest = things.get(0);
        for (T thing : things)
        {
            if (thing.getSize() < smallest.getSize())
            {
                smallest = thing;
            }
        }
        return smallest;
    }

    public T findBiggest()
    {
        T biggest = things.get(0);
        for (T thing : things)
        {
            if (thing.getSize() > biggest.getSize())
            {
                biggest = thing;
            }
        }
        return biggest;
    }

    public void showAll()
    {
        if(things.get(1) == null)
            System.out.println("The cupping glass is empty.");
        else
        {
            for (T thing : things)
            {
                thing.getInfo();
            }
        }
    }
}
