package src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom du zoo");
        String zooName = sc.nextLine();
        System.out.println("Entrer le nombre de cage");
        int nbCage = sc.nextInt();
        ZooManagement default_zoo = new ZooManagement();
        ZooManagement zoo_management = new ZooManagement(nbCage , zooName);

        System.out.println(default_zoo);
        System.out.println(zoo_management);

        Animal lion = new Animal("Felidae", "lion", 5, true);
        Animal girafe = new Animal("Giraffidae", "girafe", 8, true);
        Animal crocodile = new Animal("reptiles", "crocodile", 95, false);
        Animal eagle = new Animal("birds", "eagle", 12, false);
        //constructors are more simple
        Animal[] animals = new Animal[] {lion, girafe, crocodile, eagle};

        Zoo zoo = new Zoo(animals , zooName , "Nice" , nbCage);
        System.out.println(zoo);
        //System.out.println(myZoo.toString());
        //the output is the same

        System.out.println(lion);

        sc.close();

    }
}