package tn.esprit.gestionEmployees.main;

import tn.esprit.gestionEmployees.entities.Employe;
import tn.esprit.gestionEmployees.entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe emp1 = new Employe(1, "Bel", "Fady", "Informatique", 3);
        Employe emp2 = new Employe(2, "Sellami", "Salma", "Ressources Humaines", 4);
        Employe emp3 = new Employe(3, "Marroca", "Aiman", "Finance", 2);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        System.out.println("Employees List:");
        societe.displayEmploye();

        System.out.println("\nSearch Employee:");
        System.out.println(societe.rechercherEmploye("Sellami"));

        System.out.println("\nDelete employee Bel :");
        societe.supprimerEmploye(emp1);

        System.out.println("New list of employees:");
        societe.displayEmploye();

        System.out.println("\nSort employees by ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nSort employees by Name, Departement and Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
