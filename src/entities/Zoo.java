package entities;

public class Zoo {

    static final int CAGES_NBR = 25;

    Animal[] animals;
    String name, city;

    int animalsNbr;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[CAGES_NBR];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + CAGES_NBR);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[animalsNbr] = animal;
        animalsNbr++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < animalsNbr; i++) {
            animals[i] = animals[i + 1];
            animals[animalsNbr] = null;
            this.animalsNbr--;
        }
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < animalsNbr; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < animalsNbr; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }

    boolean isZooFull(){
        return animalsNbr == CAGES_NBR ;
    }

    public Zoo comparerZoo(Zoo zoo1, Zoo zoo2)
    {
        if (zoo1.animalsNbr > zoo2.animalsNbr)
        {
            System.out.println(" Le zoo " + zoo1.name + " a plus d'animaux");
            return zoo1;
        } else if (zoo1.animalsNbr < zoo2.animalsNbr) {
            System.out.println(" Le zoo " + zoo2.name + " a plus d'animaux");
            return zoo2;
        } else {
            System.out.println("Les deux zoo ont le meme nombre d'animaux");
            return null ;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + CAGES_NBR;
    }
}
