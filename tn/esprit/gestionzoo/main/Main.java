package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) throws ZooFullException {
        Zoo myZoo = new Zoo("My zoo ", "Paris ", 25);
        Animal lion = new Animal("Felidae", "Lion", 1, true);
        Zoo zoo = new Zoo("Mini Zoo", "Paris", 3);

        try {
            zoo.addAnimal(new Animal("Felidae", "Lion1", 1, true));
            zoo.addAnimal(new Animal("Bird", "Penguin", 3, false));
            zoo.addAnimal(new Animal("Cetacea", "Dolphin", 8, true));
            zoo.addAnimal(new Animal("Elephantidae", "Elephant", 10, true));
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        Terrestrial terrestrial = new Terrestrial();

        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        myZoo.addAnimal(lion);
        myZoo.searchAnimal(lion);
        myZoo.displayAnimals();
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);

        myZoo.aquaticAnimalsSwim();

        dolphin1.swim();
        penguin1.swim();
    }
}
