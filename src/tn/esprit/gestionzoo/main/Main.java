package src.tn.esprit.gestionzoo.main;

import java.util.Scanner;
import  src.tn.esprit.gestionzoo.entities.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbtCages = sc.nextInt();
        String zooName = sc.nextLine();
        System.out.println(new ZooManagement(nbtCages, zooName));
        Animal lion = new Animal("Felidae", "lion", 5, true);
        Animal girafe = new Animal("Giraffidae", "girafe", 8, true);
        Animal crocodile = new Animal("reptiles", "crocodile", 95, false);
        Animal eagle = new Animal("birds", "eagle", 12, false);
        Animal[] animals = new Animal[25];
        Zoo zoo = new Zoo(animals , zooName , "Nice" );

        System.out.println(zoo.addAnimal(lion));
        System.out.println(zoo.addAnimal(lion));
        System.out.println(zoo.addAnimal(girafe));
        System.out.println(zoo.addAnimal(crocodile));
        System.out.println(zoo.addAnimal(eagle));


        Zoo myZoo = new Zoo(animals, "myZoo", "USA");
        myZoo.displayZoo();

        System.out.println(myZoo);

        System.out.println(lion);
        zoo.countAnimals();

        System.out.println(zoo.searchAnimal(lion));

        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        Terrestrial terrestrial = new Terrestrial();
        Aquatic aquatic = new Aquatic();

        Aquatic dodo = new Dolphin("aquatic","dolphin",8,true,"ocean",35);
        Aquatic pengo = new Penguin("aquatic","penguin",9,false,"ice",10);
        Terrestrial atsushi = new Terrestrial("terrestrial","tiger",18,true,4);
        System.out.println(dodo);
        System.out.println(pengo);
        System.out.println(atsushi);

        aquatic.swim();
        dodo.swim();
        pengo.swim();
    }
}