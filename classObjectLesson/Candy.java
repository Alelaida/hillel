package Rep.classObjectLesson;


public class Candy {
    String candyName;
    private int candyWeight;
    private double candyPrice;

    public Candy(String candyName, int candyWeight, double candyPrice) {
        this.candyName = candyName;
        this.candyWeight = candyWeight;
        this.candyPrice = candyPrice;
    }

    public int getCandyWeight() {
        return candyWeight;
    }

    public void setCandyWeight(int candyWeight) {
        this.candyWeight = candyWeight;
    }


    public static void main(String[] args) {
        //Candy.totalCandyWeight();
        Candy candy1 = new Candy("Cow", 10, 0.5);
        Candy candy2 = new Candy("Jelly", 10, 0.3);
        Candy candy3 = new Candy("Bee", 5, 0.5);

        Chocolate chocolate1 = new Chocolate("Milka", 100, 30);
        Chocolate chocolate2 = new Chocolate("Korona", 100, 20);
        Chocolate chocolate3 = new Chocolate("Millenium", 100, 25);

        Candy[] candies = {candy1, candy2, candy3, chocolate1, chocolate2, chocolate3};

        int totalCandyWeight = 0;
        for (Candy c : candies) {
            totalCandyWeight += c.candyWeight;
        }
        System.out.println(totalCandyWeight);

    }
}
