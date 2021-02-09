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
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}