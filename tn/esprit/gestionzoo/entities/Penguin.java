package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    float swimmingDepth;

    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    public Penguin(String family, String name, int age, String city, boolean isMammal, String habitat, float swimmingDepth){
        super(family, name, age, city, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSwimming Depth: " + swimmingDepth;
    }

    public void swim(){
        System.out.println("This Penguin is swimming in "+ swimmingDepth + " depth!");
    }
}
