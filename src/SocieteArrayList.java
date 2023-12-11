import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> Employes = new ArrayList<Employe>();

    public SocieteArrayList(){}

    @Override
    public void ajouterEmploye(Employe employe) {
        Employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe e : Employes){
            if(e.getNom() == nom){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employee) {
        for(Employe e : Employes){
            if(e == employee)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employee) {
        Employes.remove(employee);
    }

    @Override
    public void displayEmploye() {
        System.out.println(Employes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(Employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> NomDepartementCompartor = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };

        Comparator<Employe> GradeCompartor = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };

        Collections.sort(Employes, NomDepartementCompartor.thenComparing(GradeCompartor));
    }
}