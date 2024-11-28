package src.tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    final int nbrCages = 25;
    int counter ;
    public Zoo(Animal[] animals, String name, String city) {
        for (int i = 0; i < animals.length; i++) {
            this.animals[i] = animals[i];
        }
        if (name != null) {
            this.name = name;
        }
        else System.out.println(name + " cannot be empty");
        this.city = city;

    }
    public Animal getAnimal (int index) {
        return animals[index];
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public void setName(String newName) {
        if (newName != null) {
            name = newName;
        }
        else System.out.println(name + " cannot be empty");
    }
    public void displayZoo(){
        System.out.println("Name: " + name+" \nCity: " + this.city+" \nNbrCages: " + this.nbrCages);
    }

    public  String toString (){
        return "Name: " + name+" | City: " + city+" | NbrCages: " + nbrCages;
    }

    public Boolean addAnimal(Animal animal){
        if (!isZooFull() && searchAnimal(animal)==-1){
            animals[counter] = animal;
            counter++;
            return true;
        }
        else
            return false;
    }

    Boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if (index != -1){
            for (int i = index; i < counter - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[counter - 1] = null;
            counter -- ;
            return true;
        }
        else
            return false;
    }


    public void countAnimals(){
        for (int i = 0; i< counter ;i++){
            System.out.println(animals[i].toString());
        }
    }
    public int searchAnimal(Animal animal){
        int i = 0 ;
        while (i< counter ){
            if (animals[i].getName().equals(animal.getName()) ){
                break;
            }
            i++;
        }
        if (i== counter){
            return -1;
        }
        else
            return i;
    }
    boolean isZooFull(){
        return counter == 25;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.counter >= z2.counter){
            return z1;
        }
        else
            return z2;
    }
}