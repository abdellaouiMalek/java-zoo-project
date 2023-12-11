import entities.Employe;
import entities.Departement;
import entities.SocieteArrayList;
import entities.DepartementHashSet;
import entities.AffectationHashMap;

public class Main {
    public static void main(String[] args) {
        /* -------------Prosit 9---------------------
        SocieteArrayList S = new SocieteArrayList();
        Employe e1 = new Employe(1, "Dridi", "Khalil", "27", 2);
        Employe e2 = new Employe(2, "Seltana", "Malek", "22", 4);
        Employe e3 = new Employe(3, "titi", "mimi", "A23", 15);

        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println("************** Recherche employé : *************");
        System.out.println(S.rechercherEmploye(e1));
        S.displayEmploye();
        System.out.println("************** Supprimer employé : *************");
        S.supprimerEmploye(e1);
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("titi"));
        System.out.println("************** Tri employé par ID : *************");
        S.trierEmployeParId();
        S.displayEmploye();
        System.out.println("************** Tri employé par Depart et grade : *************");
        S.trierEmployeParNomDepartementEtGrade();
        S.displayEmploye();
    } */
        /* -------------Prosit 10-------------------
        DepartementHashSet Depart = new DepartementHashSet();
        Depart.ajouterDepartement(new Departement(5, "info", 10));
        Depart.ajouterDepartement(new Departement(1, "chimie", 2));
        Depart.ajouterDepartement(new Departement(8, "math", 254));
        System.out.println("************** Affichage départements : *************");
        Depart.displayDepartement();
        System.out.println("************** Recherche département : *************");
        System.out.println(Depart.rechercherDepartement("physique"));
        System.out.println("************** Tri département par ID : *************");
        System.out.println(Depart.trierDepartementById());
    } */
        // ------------------Prosit 11------------------
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        Employe employee1 = new Employe(1, "Dridi", "Khalil", "27", 2);
        Employe employee2 = new Employe(2, "Seltana", "Malek", "22", 4);
        Employe employee3 = new Employe(3, "titi", "mimi", "A23", 15);
        Departement department1 = new Departement(1, "info", 10);
        Departement department2 = new Departement(2, "chimie", 2);

        affectationHashMap.ajouterEmployeDepartement(employee1, department1);
        affectationHashMap.ajouterEmployeDepartement(employee2, department1);
        affectationHashMap.ajouterEmployeDepartement(employee3, department2);
        System.out.println("************** Affichage employés et leurs département : *************");
        affectationHashMap.afficherEmployesEtDepartements();
        affectationHashMap.supprimerEmploye(employee2);
        System.out.println("************** Affichage ID employés : *************");
        affectationHashMap.afficherEmployes();
        System.out.println("************** Affichage départements : *************");
        affectationHashMap.afficherDepartments();
        System.out.println("************** Recherche employé : *************");
        System.out.println(affectationHashMap.rechercherEmploye(employee2));
        System.out.println("************** Recherche département : *************");
        System.out.println(affectationHashMap.rechercherDepartement(department1));
        System.out.println("************** Tri : *************");
        System.out.println(affectationHashMap.trierMap());
        affectationHashMap.supprimerEmployetDepartement(employee3, department2);
        System.out.println("************** Affichage départements + employés aprés suppression : *************");
        affectationHashMap.afficherEmployesEtDepartements();
    }
}