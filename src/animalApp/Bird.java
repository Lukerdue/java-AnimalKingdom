package animalApp;

public class Bird extends Animal
{
    public Bird(String name, int year)
    {
        super(year, name);
    }

    @Override
    public String move(int distance)
    {
        return getName() + " flies "+ distance + " feet!";
    }

    @Override
    public String breathe()
    {
        return getName() + " breathes with their lungs!";
    }

    @Override
    public String reproduce()
    {
        return getName() + " laid an egg!";
    }

    @Override
    public String toString()
    {
        return "Birdie---\nName: " + getName() + "\nYear: "+ getYear() + "\nhas " + getFood() + " food!\n";
    }
}
