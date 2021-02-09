package animalApp;

public class Mammal extends Animal
{
    public Mammal(int year, String name)
    {
        super(year, name);
    }

    @Override
    public String move()
    {
        return "Walks!";
    }

    @Override
    public String breathe()
    {
        return "Lungs!";
    }

    @Override
    public String reproduce()
    {
        return "Live birth!";
    }

    @Override
    public String toString()
    {
        return "Mammalian---\n" + getName() + "\n"+ getYear() + "\n" + move() + "\n"+reproduce()+"\n"+breathe();
    }
}
