package entities;

import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    public static final int NUMBER_OF_AQUATICS = 10; // zid hethi
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    int nbrAquatics = 0;
    Aquatic[] aquaticAnimals; // zid hethi


    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Aquatic[NUMBER_OF_AQUATICS]; // zid hethi
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (searchAnimal(animal) != -1)
            System.out.println("animal non trouvé");
        if(nbrAnimals<NUMBER_OF_CAGES)
        {
            if (animal.getAge() >= 0) {
                animals[nbrAnimals] = animal;
                nbrAnimals++;
                System.out.println("Nombre d'animaux : " + nbrAnimals);
            } else {
                throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
            }
        }
        else {
            throw new ZooFullException("le zoo est plein");
        }

    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }
    // zid men hne lel lekher
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatics < NUMBER_OF_AQUATICS) {
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
//            System.out.println("aquatics : " + nbrAquatics);
        } else {
            System.out.println("Complet !");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxSwimmingDepth = -1;
        for (int i = 0; i < nbrAquatics; i++) {
            if ((aquaticAnimals[i] instanceof Penguin) && (((Penguin) aquaticAnimals[i]).getSwimmingDepth() > maxSwimmingDepth)) {
                maxSwimmingDepth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return maxSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;

        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            } else if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
        }

        System.out.println("Le nombre des dophins = " + nbrDolphins);
        System.out.println("Le nombre des penguins = " + nbrPenguins);
    }
}
