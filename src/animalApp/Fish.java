package animalApp;

public class Fish extends Animal
{
    public Fish(String name, int year)
    {
        super(year, name);
    }

    @Override
    public String move()
    {
        return "Swims!";
    }

    @Override
    public String breathe()
    {
        return "Gills!";
    }

    @Override
    public String reproduce()
    {
        return "Eggs!";
    }

    @Override
    public String toString()
    {
        return "Fishy Fishy-----\n" + getName() + "\n" + getYear() + "\n" + move() + "\n"+reproduce()+"\n"+breathe();
    }
}
