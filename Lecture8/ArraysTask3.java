package AllaMaltseva.Lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysTask3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter the size of Array");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String newStr = reader.readLine();
        int sizeOfMyArray = Integer.parseInt(newStr);


        int[] MyArray = new int[sizeOfMyArray];
        System.out.println("Please, enter the numbers");
        for (int i = 0; i < sizeOfMyArray; i++) {
            String number = reader.readLine();
            MyArray[i] = Integer.parseInt(number);
        }
        Arrays.sort(MyArray);
        System.out.println("The smallest number is " + MyArray[0]);
    }
}