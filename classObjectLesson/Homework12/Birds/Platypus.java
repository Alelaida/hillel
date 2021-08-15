package Rep.classObjectLesson.Homework12.Birds;

public class Platypus extends Mammals implements HasBeak {
    public Platypus(String mammalName, int mammalAge, String species) {
        super(mammalName, mammalAge, species);
    }

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

    @Override
    public void eat() {
        System.out.println("I eat bugs.");
    }

    @Override
    public void beak() {
        System.out.println("I have a beak.");
    }
}
