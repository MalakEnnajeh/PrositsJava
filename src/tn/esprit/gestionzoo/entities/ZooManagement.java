package src.tn.esprit.gestionzoo.entities;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo" ;
    public ZooManagement() {}
    public ZooManagement(int nbrCages, String zooName) {
        this.nbrCages = nbrCages;
        this.zooName = zooName;
    }
    public String toString(){
        return zooName + " comporte "+ nbrCages;
    }
}