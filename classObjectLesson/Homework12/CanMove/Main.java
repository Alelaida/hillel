package Rep.classObjectLesson.Homework12.CanMove;

public class Main {
    public static void main(String[] args) {
        SomeClass obj1 = new SomeClass();
        SomeClass obj2 = new SomeClass();
        System.out.println(obj1.speed());
        System.out.println(obj2.speed(obj1));
    }
}
