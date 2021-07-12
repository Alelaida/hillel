package AllaMaltseva.Lecture8;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTask2 {
    public static void main(String[] args) {

        int[] arrayTask2 = new int[9];
        int summ = 0;
        double averageArrayTask2 = 0;
        int maxNumber = 0;
        int minNumber = 101;
        int counterMin = 0;
        int counterMax = 0;
        int amountOfNumbers = 0;

        for (int i = 0; i < 6; i++) {

            int random_int = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
            arrayTask2[i] = random_int;
            summ += arrayTask2[i];
            System.out.print(random_int + " ");

            if (arrayTask2[i] > maxNumber) {
                maxNumber = arrayTask2[i];
                counterMax = i;
            }
            if (arrayTask2[i] < minNumber) {
                minNumber = arrayTask2[i];
                counterMin = i;
            }
        }

        amountOfNumbers = counterMax - counterMin;
        averageArrayTask2 = summ / arrayTask2.length;

        System.out.println();
        System.out.println("Total average is " + averageArrayTask2);
        System.out.println("Sum of all numbers in array is " + summ);
        System.out.println("Number of elements between max and min is " + (Math.abs(amountOfNumbers) - 1));


    }
}


