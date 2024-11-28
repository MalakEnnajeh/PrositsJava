package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;

    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    public Dolphin(String family, String name, int age, String city, boolean isMammal, String habitat, float swimmingSpeed){
        super(family, name, age, city, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSwimming Speed: " + swimmingSpeed;
    }

    public void swim(){
        System.out.println("This Dolphin is swimming at "+swimmingSpeed + "m/s speed!");
    }
}
