package Rep.classObjectLesson.Homework12.CanMove;

public class SomeClass implements CanFly{
    @Override
    public Double speed() {
        return 3.2;
    }
    @Override
    public Double speed(CanFly fly) {
        return fly.speed()/2;
    }


}
