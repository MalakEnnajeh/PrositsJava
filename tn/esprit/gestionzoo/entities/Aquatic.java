package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enumerations.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic(){
        super();
        this.habitat = "Unknown";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return "Aquatic: " + super.toString() + "\nHabitat: " + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Aquatic aquatic = (Aquatic) obj;
        return this.age == aquatic.age &&
                this.habitat.equals(aquatic.habitat) &&
                this.name.equals(aquatic.name);
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " cannot eat this type of food.");
        }
    }
}
