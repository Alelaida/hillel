package AllaMaltseva.Lecture8;

public class ArraysTask1 {

    public static void main(String[] args) {
        int[] arrayLucky = new int[6];

        for (int i = 0; i < 6; i++)
        {

            int random_int = (int) Math.floor(Math.random() * (9 - 0 + 1) + 0);
            arrayLucky[i] = random_int;
            System.out.print(random_int+" ");
        }

        int sumNumber arrayLucky[0] + arrayLucky[1] + arrayLucky[2];
        int sumSecond = arrayLucky[3] + arrayLucky[4] + arrayLucky[5];
        if (sumFirst == sumSecond) {

            System.out.println("The ticket is lucky : true");
        } else
            System.out.println("No luck");
    }
}