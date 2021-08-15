package Rep.classObjectLesson.Homework12.Birds;

public class Swallow extends Birds{
    public Swallow(String birdName, int birdAge, String species) {
        super(birdName, birdAge, species);
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
    public void swim() {
        System.out.println("I can not swim!");
    }
}
