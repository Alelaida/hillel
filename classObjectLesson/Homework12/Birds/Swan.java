package Rep.classObjectLesson.Homework12.Birds;

public class Swan extends Birds{
    public Swan(String birdName, int birdAge, String species) {
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
    public void eat() {
        System.out.println("I eat grass.");
    }
}
