package src;

public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        for (int i = 0; i < nbrCages; i++) {
            this.animals[i] = animals[i];
        }
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("Name: " + name+" \nCity: " + this.city+" \nNbrCages: " + this.nbrCages);
    }

    public  String toString (){
        StringBuilder animals_display= new StringBuilder();
        for (int i = 0; i < nbrCages; i++) {
            animals_display.append(animals[i].name).append(" ");
        }

        return "Name: " + name+" | City: " + city+" | NbrCages: " + nbrCages + " | Animal: [" + animals_display+"]";
    }
}
