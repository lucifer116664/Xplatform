package KI31.Chaplia.Lab7;

public class Tomato extends Thing
{
    private final String color = "Red";

    public Tomato()
    {
        size = (int)(Math.random() * (10 - 2) + 1);
    }

    @Override
    public void getInfo()
    {
        System.out.println(color + ", " + size + "cm");
    }
}
