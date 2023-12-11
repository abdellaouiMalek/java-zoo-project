import entities.Employe;
import entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList S = new SocieteArrayList();
        Employe e1 = new Employe(1, "Dridi", "Khalil", "27", 2);
        Employe e2 = new Employe(2, "Seltana", "Malek", "22", 4);
        Employe e3 = new Employe(3, "titi", "mimi", "A23", 15);

        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);

        System.out.println(S.rechercherEmploye(e1));
        S.displayEmploye();

        S.supprimerEmploye(e1);
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("titi"));

        S.trierEmployeParId();
        S.displayEmploye();

        S.trierEmployeParNomDepartementEtGrade();
        S.displayEmploye();
    }
}