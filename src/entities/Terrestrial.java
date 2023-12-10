package entities;

import enums.Food;
import interfaces.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(Object meat) {
        System.out.println("eats MEAT");
    }

    @Override
    public void eatPlant(Object plant) {
        System.out.println("eats Plant");
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("eats Plant and Meet");
    }
}
