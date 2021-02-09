package animalApp;

public abstract class Animal {
    private static int maxId = 0;
    private int id;
    private int year;
    private String name;
    private int food;

    public Animal(int year, String name)
    {
        maxId++;
        id = maxId;
        this.year = year;
        this.name = name;
    }

    abstract String move(int distance);
    abstract String breathe();
    abstract String reproduce();

    String eat(int food)
    {
        this.food = this.food + food;
        return name + " ate " + food + " food!";
    }

    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    int getYear()
    {
        return year;
    }
    
    int getFood()
    {
        return food;
    }
}
