package entities;

public class Terrestres extends Animal{
    private int nbrLegs ;

    public Terrestres(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
