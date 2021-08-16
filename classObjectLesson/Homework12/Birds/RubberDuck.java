package Rep.classObjectLesson.Homework12.Birds;

public class RubberDuck extends Birds implements CanSwim, HasBeak {
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String material = "rubber";

    public RubberDuck(String birdName, int birdAge, String species) {
        super(birdName, birdAge, species);
        this.material = "rubber";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void eat() {
        System.out.println("I don't eat");
        ;
    }

    @Override
    public void fly() {
        System.out.println("I don't fly.");
    }
}
