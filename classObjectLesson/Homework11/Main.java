package Rep.classObjectLesson.Homework11;

import java.util.Arrays;

import static Rep.classObjectLesson.Homework11.Candy.count;


public class Main {

    public static void main(String[] args) {
        
        Candy candy1 = new Candy("Cow", 10, 0.5);
        Candy candy2 = new Candy("Jelly", 10, 0.3);
        Candy candy3 = new Candy("Bee", 5, 0.5);

        Chocolate chocolate1 = new Chocolate("Milka", 30, 0.5);
        Chocolate chocolate2 = new Chocolate("Corona", 50, 0.3);
        Chocolate chocolate3 = new Chocolate("Millenium", 50, 0.4);


        Toffee toffe1 = new Toffee("Toffeta", 10, 0.2);
        Toffee toffe2 = new Toffee("Toff", 30, 0.3);
        Toffee toffe3 = new Toffee("Toffer", 50, 0.4);

        System.out.println(count);

        Candy[] candies = new Candy[Candy.count];
        candies[0] = candy1;
        candies[1] = candy2;
        candies[2] = candy3;
        candies[3] = chocolate1;
        candies[4] = chocolate2;
        candies[5] = chocolate3;
        candies[6] = toffe1;
        candies[7] = toffe2;
        candies[8] = toffe3;
        System.out.println(Arrays.toString(candies));
    }
}
