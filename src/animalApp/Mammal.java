package animalApp;

public class Mammal extends Animal
{
    public Mammal(int year, String name)
    {
        super(year, name);
    }

    @Override
    public String move(int distance)
    {
        return getName() + " walked " + distance + "!";
    }

    @Override
    public String breathe()
    {
        return getName() + " breathes with their lungs!";
    }

    @Override
    public String reproduce()
    {
        return getName() + " has a live birth!";
    }

    @Override
    public String toString()
    {
        return "Mammalian---\nName: " + getName() + "\nYear: "+ getYear() + "\n has " + getFood() + " food";
    }
}
