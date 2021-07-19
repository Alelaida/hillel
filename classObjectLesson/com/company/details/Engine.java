package Rep.classObjectLesson.com.company.details;

public class Engine {
    String company;
    int power;

    public Engine(String company, int power) {
        this.company = "comp";
        this.power = 100;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Car company: %s. Car Marka: %s.  Car power: %s. ", company, power);
    }

    public static void main(String[] args) {

        Engine engine1 = new Engine("Abc", 120);
    }
}