public class Main {
    public static void main(String[] args) {
        SocieteArrayList S = new SocieteArrayList();
        Employe e1 = new Employe(1, "Jendoubi", "Hafedh", "J24", 16);
        Employe e2 = new Employe(2, "Jendoubi", "Majdi", "G40", 13);
        Employe e3 = new Employe(3, "Klai", "Rayen", "A23", 15);
        Employe e4 = new Employe(4, "Mhamdi", "Ahlem", "A23", 18);

        S.ajouterEmploye(e4); //Add works
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1)); //True, it works
        S.displayEmploye(); //Display works
        System.out.println("\n"); //Display purposes
        S.supprimerEmploye(e1); //Delete works
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("Andolsi")); //False, it works
        System.out.println("\n"); //Display purposes
        S.trierEmployeParId(); //Tri ID works
        S.displayEmploye();
        System.out.println("\n"); //Display purposes
        S.trierEmployeParNomDepartementEtGrade(); //Tri NomDepartement then Grade works
        S.displayEmploye();
    }
}