package animalApp;
import java.util.List;
import java.util.ArrayList;


public class Main
{
    private static List<Animal> filterAnimals(List<Animal> theList, testAnimal tester)
    {
        List<Animal> tempList = new ArrayList<>();

        for(Animal v : theList)
        {
            if(tester.test(v))
            {
                tempList.add(v);
            }
        }
        return tempList;
    }
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda Animal Kingdom!!\n\n");

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

        List<Animal> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(racoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        animalList.sort((a1, a2)->a1.getYear()-a2.getYear());
        System.out.println("Animals sorted by year----\n");
        animalList.forEach(a->System.out.println(a));

        System.out.println("\n\nAnimal sorted Alphabetically-----\n");
        animalList.sort((a1, a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(a-> System.out.println(a));

        System.out.println("\n\nAnimals sorted by how the move!----");
        animalList.sort((a1, a2)->a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach(a->System.out.println(a));

        System.out.println("\n\nAnimals that only have lungs---");
        List<Animal> filteredAnimals = filterAnimals(animalList, (a)-> a.breathe()=="Lungs!");
        filteredAnimals.forEach(a->System.out.println(a));

        System.out.println("\n\nAnimals only with lungs, and named in 1758---");
        filteredAnimals = filterAnimals(animalList, (a)->(a.breathe()=="Lungs!")&&(a.getYear()==1758));
        filteredAnimals.forEach(a-> System.out.println(a));

        System.out.println("\n\nAnimals with lungs that lay eggs----");
        filteredAnimals = filterAnimals(animalList, (a)->(a.breathe()=="Lungs!")&&(a.reproduce()=="Eggs!"));
        filteredAnimals.forEach(a-> System.out.println(a));

        System.out.println("\n\nAnimals named in 1758 alphabetically----");
        filteredAnimals = filterAnimals(animalList, a->a.getYear()==1758);
        filteredAnimals.sort((a1, a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals.forEach(a-> System.out.println(a));
        
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}