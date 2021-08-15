package Rep.classObjectLesson.Homework12.Birds;

import java.util.Objects;

public abstract class Birds implements CanEat, CanFly, CanSwim, HasBeak {
    private String birdName;
    private int birdAge;
    private String species;

    public Birds(String birdName, int birdAge, String species) {
        this.birdName = birdName;
        this.birdAge = birdAge;
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        Birds birds = (Birds) o;
        return birdAge == birds.birdAge && Objects.equals(birdName, birds.birdName) && Objects.equals(species, birds.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birdName, birdAge, species + 31);
    }


    @Override
    public String toString() {

        return String.format("Bird name: %s. Bird age: %s.  Species: %s. ", birdName, birdAge, species);

    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void beak() {
        System.out.println("I have a beak.");
    }

    @Override
    public void eat() {
        System.out.println("I eat bugs.");
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");

    }
}
