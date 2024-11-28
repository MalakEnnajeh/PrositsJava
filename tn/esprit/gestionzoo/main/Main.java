package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.enumerations.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) throws ZooFullException, InvalidAgeException {
        Zoo myZoo = new Zoo("My zoo ", "Paris ", 25);
        Animal lion = new Animal("Felidae", "Lion", 1, true);
        Zoo zoo = new Zoo("Mini Zoo", "Paris", 3);

        try {
            zoo.addAnimal(new Animal("Felidae", "Lion1", 1, true));
            zoo.addAnimal(new Animal("Bird", "Penguin", 3, false));
            zoo.addAnimal(new Animal("Cetacea", "Dolphin", 8, true));
            zoo.addAnimal(new Animal("Elephantidae", "Elephant", 10, true));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Terrestrial terrestrial = new Terrestrial();

        Dolphin dolphin1 = new Dolphin("Cetacea", "Dolphin1", 12, true, "Ocean", 25.0f);
        Penguin penguin1 = new Penguin("Bird", "Penguin1", 5, false, "Arctic", 20.0f);
//
//        myZoo.addAnimal(lion);
//        myZoo.searchAnimal(lion);
//        myZoo.displayAnimals();
//        myZoo.addAquaticAnimal(dolphin1);
//        myZoo.addAquaticAnimal(penguin1);
//
//        myZoo.aquaticAnimalsSwim();
//
//        dolphin1.swim();
//        penguin1.swim();
        dolphin1.eatMeat(Food.MEAT);
        penguin1.eatMeat(Food.MEAT);

        Terrestrial tiger = new Terrestrial("Felidae", "Tiger", 7, true, 4);
        tiger.eatMeat(Food.MEAT);
        tiger.eatPlant(Food.PLANT);
        tiger.eatPlantAndMeet(Food.BOTH);

        System.out.println("\nDisplay zoo animals:");
        zoo.displayAnimals();

        System.out.println("\nSearch animal:");
        int lionIndex = zoo.searchAnimal(new Animal("Felidae", "Lion1", 1, true));
        System.out.println("Lion found at index: " + lionIndex);

        System.out.println("\nMaximum swimming depth penguins:");
        System.out.println("Max depth: " + zoo.maxPenguinSwimmingDepth() + " meters.");

        System.out.println("\nNumber of aquatic animals by type:");
        zoo.displayNumberOfAquaticsByType();
    }
    }
