package animalApp;

public class Main
{
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda Animal Kingdom!!");

        //mammals
        Mammal panda = new Mammal(1869, "Panda");
        Mammal zebra = new Mammal(1778, "Zebra");
        Mammal koala = new Mammal(1816, "Koala");
        Mammal sloth = new Mammal(1804, "Sloth");
        Mammal armadillo = new Mammal(1758, "Armadillo");
        Mammal racoon = new Mammal(1758, "Racoon");
        Mammal bigfoot = new Mammal(2021, "Bigfoot/Yeti");

        //birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        //Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}