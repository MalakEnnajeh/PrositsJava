package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    int nbrLegs;

    public Terrestrial(){
        super();
        this.nbrLegs = 0;
    }

    public Terrestrial(String family, String name, int age, String city, boolean isMammal, int nbrLegs){
        super(family, name, age, city, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString(){
        return "Terrestrial: " + super.toString() + "\nNumber of Legs: " + nbrLegs;
    }
}
