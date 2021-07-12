package AllaMaltseva.Lecture8;

import java.util.Arrays;

public class ArraysTask4 {
    public static void main(String[] args) {
        int[] arrayToSort = new int[6];
        System.out.println("Not sorted array: ");
        for (int i = 0; i < 6; i++) {

            int random_int = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
            arrayToSort[i] = random_int;

            System.out.print(random_int + " ");
        }
        System.out.println();
        System.out.println("Sorted array (for): ");
        for (int j = 4; j > 0; j--) {
            for (int i = 5; i > 0; i--) {
                if (arrayToSort[i] > arrayToSort[i - 1]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i - 1];
                    arrayToSort[i - 1] = temp;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array (foreach):");
        for (int customVar : arrayToSort) {

            System.out.print(customVar + " ");
        }
        String inArrayToSortString = Arrays.toString(arrayToSort);
        System.out.println();
        System.out.println("Sorted array (Arrays.toString):");
        System.out.print(inArrayToSortString);
    }
}


