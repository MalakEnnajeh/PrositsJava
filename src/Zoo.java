package src;
public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    int counter=0 ;
    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        if (animals != null) {
            for (int i = 0; i < animals.length && i < nbrCages; i++) {
                this.animals[i] = animals[i];
                this.counter++;
            }
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
        for (int i = 0; i < counter; i++) {
            animals_display.append(animals[i].name).append(" ");
        }

        return "Name: " + name+" | City: " + city+" | NbrCages: " + nbrCages + " | Animal: [" + animals_display+"]";
    }

    public Boolean addAnimal(Animal animal){
        if (counter<nbrCages && searchAnimal(animal)==-1){
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
            if (animals[i].name.equals(animal.name )){
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
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.counter >= z2.counter){
            return z1;
        }
        else
            return z2;
    }
}