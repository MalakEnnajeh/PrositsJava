package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import java.util.Scanner;

public class Zoo {
    private Animal [] animals;
    private Aquatic [] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages=25;
    private int animalCount=0;
    private int aquaticCount=0;

    public Zoo(){}

    public Zoo(String name, String city, int nbrCages){
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                System.out.println("Enter animal's name:");
                name = scanner.nextLine();
                if (name != null){
                    this.name = name;
                    break;
                }
                System.out.println("Name cannot be empty, please enter a valid name!");
            }
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public void addZooInfo(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Donner un nom D'animal: ");
            name = scanner.next();
            System.out.println("Donner un nom de ville: ");
            city = scanner.next();
        }
    }
    
    public void displayZoo(){
        System.out.println("Nom: "+ name + ", Nombres de cages: " + nbrCages + ", Ville: " + city);
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if (aquaticCount < aquaticAnimals.length){
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("Aquatic animals tab is full!");
        }
    }

    public void aquaticAnimalsSwim(){
        for (Aquatic aquatic : aquaticAnimals){
            if (aquatic != null){
                aquatic.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth=0;
        for (Aquatic aquatic : aquaticAnimals){
            if (aquatic instanceof Penguin){
                Penguin penguin = (Penguin) aquatic;
                if (penguin.swimmingDepth > maxDepth){
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals){
            if (aquatic instanceof Penguin){
                penguinCount++;
            } else if (aquatic instanceof Dolphin){
                dolphinCount++;
            }
        }
        System.out.println(penguinCount);
        System.out.println(dolphinCount);
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException{
        if (animal.age < 0) {
            throw new InvalidAgeException("Invalid Age!");
        }

        if (animalCount >= nbrCages) {
            throw new ZooFullException("Zoo is full!");
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++;
                System.out.println("Animal added:" + animal.name);
                System.out.println("Number of animals: " + animalCount);
                return;
            }
        }
    }

    public void displayAnimals(){
        System.out.println("Animals of "+ name +" are: ");

        for (Animal animal : animals){
            if (animal != null){
                animal.displayAnimal();
            }
        }
    }

    public int searchAnimal(Animal animal){
        for (int i=0; i<animals.length; i++){
            if (animals[i] != null && (animals[i].name).equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int size = animals.length;
        for (int i=0; i<size; i++){
            if (animals[i].equals(animal)){
                for (int j=i; j<size -1; j++){
                    animals[j] = animals[j+1];
                }
                animals[--size]=null;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(int animalCount, int nbrCages){
        return animalCount>= nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1 == null && z2 == null) {
            return null;
        }
        if (z1 == null) {
            return z2;
        }
        if (z2 == null) {
            return z1;
        }
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("Both zoos have the same number of animals.");
            return z1;
        }
    }

}
