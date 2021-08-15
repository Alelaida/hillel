package Rep.classObjectLesson.Homework12.Birds;

public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck("Johny", 2, "duck");
        System.out.println(rubberDuck.toString());
        rubberDuck.beak();
        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.eat();
        System.out.println("I am made of " + rubberDuck.getMaterial());

        RubberDuck rubberDuck1 = new RubberDuck("Bobby", 1, "duck");
        System.out.println("Is it the same birds? " + rubberDuck.equals(rubberDuck1));

        Swallow swallow = new Swallow("Marry", 3, "swallow");
        System.out.println(swallow.toString());
        swallow.beak();
        swallow.fly();
        swallow.swim();
        swallow.eat();

        Swallow swallow1 = new Swallow("Genny", 1, "swallow");
        System.out.println("Is it the same birds? " + swallow.equals(swallow1));

        Swan swan = new Swan("Gerry", 3, "swan");
        System.out.println(swan.toString());
        swan.beak();
        swan.fly();
        swan.swim();
        swan.eat();

        Swan swan2 = new Swan("Gerry", 3, "swan");
        System.out.println("Is it the same birds? " + swan.equals(swan2));

        Platypus platypus= new Platypus("Stive",25,"platypus");
        System.out.println(platypus.toString());
        platypus.beak();
        platypus.swim();
        platypus.eat();

        Platypus platypus2= new Platypus("Duk",20,"platypus");
        System.out.println("Is it the same mammal? " + platypus.equals(platypus2));
    }
}
