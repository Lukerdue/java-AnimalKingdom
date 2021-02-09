package animalApp;

public class Bird extends Animal
{
    public Bird(String name, int year)
    {
        super(year, name);
    }

    @Override
    public String move()
    {
        return "Flies!";
    }

    @Override
    public String breathe()
    {
        return "Lungs!";
    }

    @Override
    public String reproduce()
    {
        return "Eggs!";
    }

    @Override
    public String toString()
    {
        return "Birdie---\n" + getName() + "\n"+ getYear() + "\n" + move() + "\n "+reproduce()+"\n"+breathe();
    }
}
