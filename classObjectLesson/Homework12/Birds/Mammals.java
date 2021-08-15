package Rep.classObjectLesson.Homework12.Birds;

import java.util.Objects;

public abstract class Mammals implements CanEat, CanSwim {
    private String mammalName;
    private int mammalAge;
    private String species;

    public Mammals(String mammalName, int mammalAge, String species) {
        this.mammalName = mammalName;
        this.mammalAge = mammalAge;
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        Mammals mammals = (Mammals) o;
        return mammalAge == mammals.mammalAge && Objects.equals(mammalName, mammals.mammalName) && Objects.equals(species, mammals.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mammalName, mammalAge, species);
    }

    @Override
    public String toString() {

        return String.format("Mammal name: %s. Mammal age: %s.  Species: %s. ", mammalName, mammalAge, species);
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void eat() {
        System.out.println("I need to eat.");
    }
}
