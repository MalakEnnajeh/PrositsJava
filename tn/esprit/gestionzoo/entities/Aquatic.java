package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(){
        super();
        this.habitat = "Unknown";
    }

    public Aquatic(String family, String name, int age, String city, boolean isMammal, String habitat){
        super(family, name, age, city, isMammal);
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
}
