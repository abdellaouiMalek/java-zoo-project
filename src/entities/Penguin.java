package entities;

public class Penguin extends Aquatiques{
    private float swimmingDepth ;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("This Penguin is swimming.");
    }
}
