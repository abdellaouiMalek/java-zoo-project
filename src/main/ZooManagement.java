package main;

import entities.*;
import enums.Food;
import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        // prosit 1 -> 6
        /*  Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        myZoo.displayAnimals();

        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();

        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();

        System.out.println("-------------------------------------------------------");
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        System.out.println("La profondeur = " + myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();

        System.out.println(dolphin.equals(penguin));
    } */

        // prosit 7

       /* Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal cat = new Animal("Canine", "Bicha", 1, false);
        Animal fish = new Animal("Mammal", "Nemo", -4, false);
        Animal animal = new Animal("Otariidae", "idk", 3, true);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        try {
            myZoo.addAnimal(dog);
            myZoo.addAnimal(cat);
            myZoo.addAnimal(fish);
            myZoo.addAnimal(animal);
            myZoo.addAnimal(penguin);
        }catch(InvalidAgeException | ZooFullException ex){
            System.err.println(ex.getMessage());
        }
    } */
        // prosit 8
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        Food food = Food.MEAT;
        Food plantsAndMeet = Food.BOTH;

        penguin.eatMeat(food);
        terrestrial.eatPlantAndMeet(plantsAndMeet);
    }
    }

