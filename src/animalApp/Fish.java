package animalApp;

public class Fish extends Animal
{
    public Fish(String name, int year)
    {
        super(year, name);
    }

    @Override
    public String move(int distance)
    {
        return super.getName() + " swam " + distance + " feet up the river!";
    }

    @Override
    public String breathe()
    {
        return super.getName() + " breathes through its gills!";
    }

    @Override
    public String reproduce()
    {
        return super.getName() + " had eggs under water!";
    }

    @Override
    public String toString()
    {
        return "Fishy Fishy-----\nName: " + getName() + "\nYear named: " + getYear() + "\nhas " + getFood() + " food!\n";
    }
}
