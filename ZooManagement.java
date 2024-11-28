import java.util.Scanner;

public class ZooManagement{
    private int nbrCages = 20;
    private String zooName = "My zoo";

    public ZooManagement(){};

    public ZooManagement(int nbrCages, String zooName){
        this.nbrCages = nbrCages;
        this.zooName = zooName;
    }

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.displayZooDetails();
        zoo.modifyZooDetails();
        zoo.displayZooDetails();
    }

    public void displayZooDetails(){
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

    public void modifyZooDetails(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Donner le nom de votre zoo: ");
            scanner.next();
            System.out.println("Donner le nombres des cages dans votre zoo: ");
            while (!scanner.hasNextInt()){
                System.out.println("Veuillez entrez un nombres valide: ");
                scanner.next();
            }
            nbrCages = scanner.nextInt();
        }
    }
}
