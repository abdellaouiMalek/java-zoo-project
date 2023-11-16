package entities;

public class Aquatiques extends Animal {
    private String habitat ;

    public Aquatiques(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    public void swim()
    {
    }
}
