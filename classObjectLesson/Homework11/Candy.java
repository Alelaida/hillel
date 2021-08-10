package Rep.classObjectLesson.Homework11;

public class Candy {
    String candyName;
    private int candyWeight;
    private double candyPrice;
    static int count;


    public Candy(String candyName, int candyWeight, double candyPrice) {
        this.candyName = candyName;
        this.candyWeight = candyWeight;
        this.candyPrice = candyPrice;
        this.count ++;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public int getCandyWeight() {
        return candyWeight;
    }

    public void setCandyWeight(int candyWeight) {
        this.candyWeight = candyWeight;
    }

    public double getCandyPrice() {
        return candyPrice;
    }

    public void setCandyPrice(double candyPrice) {
        this.candyPrice = candyPrice;
    }


    @Override
    public String toString() {
        return  String.format("Candy name: %s. Candy weight: %s.  Candy price: %s.   ", candyName, candyWeight,candyPrice);
    }
}
