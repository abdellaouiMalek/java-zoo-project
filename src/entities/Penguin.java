package entities;

import enums.Food;
import interfaces.Carnivore;

public non-sealed class Penguin extends Aquatic implements Carnivore<Food> {

    private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("eats meet");
    }
}
