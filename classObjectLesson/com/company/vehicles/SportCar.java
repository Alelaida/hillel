package Rep.classObjectLesson.com.company.vehicles;

import Rep.classObjectLesson.com.company.details.Engine;
import Rep.classObjectLesson.com.company.professions.Driver;

public class SportCar extends Car {
    int speed;

    public SportCar(String carClass, String marka, int carWeight, Rep.classObjectLesson.com.company.professions.Driver driver, Rep.classObjectLesson.com.company.details.Engine engine, int speed) {
        super(carClass, marka, carWeight, driver, engine);
        this.speed = speed;
    }
    @Override
    public String toString() {
        return String.format("Car class: %s. Car Marka: %s.  Car weight: %s. Driver: %s.Engine: %s. Speed: %s. ", carClass, marka, carWeight, Driver, Engine, speed);
    }
}
