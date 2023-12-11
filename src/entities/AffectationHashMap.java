package entities;
import java.util.*;
import entities.Employe;

public class AffectationHashMap {
    private Map<Employe, Departement> details;

    public AffectationHashMap() {
        details = new HashMap<>();
    }

    public AffectationHashMap(Map<Employe, Departement> details) {
        this.details = details;
    }

    public Map<Employe, Departement> getDetails() {
        return details;
    }

    public void setDetails(Map<Employe, Departement> details) {
        this.details = details;
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        e.setNomDepartement(d.getNom());
        details.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : details.entrySet()) {
            Employe Employe = entry.getKey();
            Departement department = entry.getValue();
            System.out.println(Employe.getNom() + ", " + Employe.getPrenom() + ": Department: " + department.getNom());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (details.containsKey(e))
            details.remove(e);
        else
            System.out.println("Employe does not exist.");
    }

    public void supprimerEmployetDepartement(Employe e, Departement d) {
        if (details.containsKey(e) && details.get(e).equals(d))
            details.remove(e);
        else
            System.out.println("Employe or Department does not exist.");
    }

    public void afficherEmployes() {
        System.out.println("Employes IDs:");
        for (Employe Employe : details.keySet()) {
            System.out.println(Employe.getID());
        }
    }

    public void afficherDepartments() {
        System.out.println("Departments: ");
        for (Departement department : new HashSet<>(details.values())) {
            System.out.println(department.getId() + ", " + department.getNom());
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return details.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return new HashSet<>(details.values()).contains(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        Comparator<Employe> comparator = Comparator.comparingInt(Employe::getID);
        TreeMap<Employe, Departement> newDetails = new TreeMap<>(comparator);
        newDetails.putAll(details);
        return newDetails;
    }
}
