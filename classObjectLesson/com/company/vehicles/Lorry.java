package Rep.classObjectLesson.com.company.vehicles;

import Rep.classObjectLesson.com.company.details.Engine;
import Rep.classObjectLesson.com.company.professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String carClass, String marka, int carWeight, Rep.classObjectLesson.com.company.professions.Driver driver, Rep.classObjectLesson.com.company.details.Engine engine, int carrying) {
        super(carClass, marka, carWeight, driver, engine);
        this.carrying = carrying;

    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return String.format("Car class: %s. Car Marka: %s.  Car weight: %s. Driver: %s.Engine: %s. Carrying: %s. ", carClass, marka, carWeight, Driver, Engine, carrying);
    }
}
