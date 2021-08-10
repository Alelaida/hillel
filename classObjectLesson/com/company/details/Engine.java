package Rep.classObjectLesson.com.company.details;

import Rep.classObjectLesson.com.company.vehicles.Car;

public class Engine {
    String company;
    int power;

    public Engine(String company, int power) {
        this.company = company;
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
        return String.format("Car company: %s. Car power: %s. ", company, power);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Engine engine = (Engine) o;

        return (engine.company.equals(company) && engine.power == power);
    }

    @Override
    public int hashCode() {
        return company.hashCode() +power + 31;
    }

}