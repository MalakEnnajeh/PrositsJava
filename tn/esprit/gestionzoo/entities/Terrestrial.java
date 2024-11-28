package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enumerations.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    int nbrLegs;

    public Terrestrial(){
        super();
        this.nbrLegs = 0;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString(){
        return "Terrestrial: " + super.toString() + "\nNumber of Legs: " + nbrLegs;
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " is eating both meat and plants.");
        } else {
            System.out.println(name + " cannot eat this type of food.");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " cannot eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " is eating plants.");
        } else {
            System.out.println(name + " cannot eat this type of food.");
        }
    }
}
