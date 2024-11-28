package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Animal {
    private String family;
    protected String name;
    protected int age;
    private boolean isMammal;

    public Animal(){};

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                System.out.println("Enter animal's age:");
                age = scanner.nextInt();
                if (age >=0){
                    this.age = age;
                    break;
                }
                System.out.println("Age cannot be negative, please enter a valid age!");
            }
        }
    }
     
    public void displayAnimal(){
        System.out.println("Nom: "+ name + ", age: " + age + ", Famille: " + family + ", Mammifère: " + isMammal);
    }

}
