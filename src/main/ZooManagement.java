package main;

import entities.Animal;
import entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Stitch";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Jurasic Park", "Ras Jebel");
        Zoo zoo = new Zoo("Nahli Park", "Ghazela");

        Animal dog = new Animal("Canine", "Sushi", 2, true);
        Animal fish = new Animal("test", "khalil", 2, true);

        zoo.addAnimal(fish);

        System.out.println("myZoo : ");
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println("Ajout d'un animal : ");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Lili", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println("Comparaison des Zoo :");
        System.out.println(myZoo.comparerZoo(myZoo,zoo));
    }
}
