package Rep.classObjectLesson.com.company.vehicles;

import Rep.classObjectLesson.com.company.details.Engine;
import Rep.classObjectLesson.com.company.professions.Driver;

public class Car {
    private String carClass;
    private String marka;
    private int carWeight;
    private Driver Driver;
    private Engine Engine;

    public Car(String carClass, String marka, int carWeight, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.marka = marka;
        this.carWeight = carWeight;
        this.Driver = driver;
        this.Engine = engine;
    }

    public Car(String carClass, String marka, int carWeight) {
        this.carClass = carClass;
        this.marka = marka;
        this.carWeight = carWeight;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public Engine getEngine() {
        return Engine;
    }

    public void setEngine(Rep.classObjectLesson.com.company.details.Engine engine) {
        Engine = engine;
    }

    @Override
    public String toString() {
        return String.format("Car class: %s. Car Marka: %s.  Car weight: %s. Driver: %s.Engine: %s. ", carClass, marka, carWeight, Driver, Engine);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;

        return (car.carClass.equals(carClass) && car.marka.equals(marka) && car.carWeight == carWeight);
    }


    @Override
    public int hashCode() {

        return carClass.hashCode() + marka.hashCode() + Driver.hashCode() + Engine.hashCode() + carWeight + 31;
    }


    public void start() {
        System.out.println("Lets drive");

    }

    public void stop() {
        System.out.println("Stop");

    }

    public void turnRight() {
        System.out.println("Turn to the right");

    }

    public void turnLeft() {
        System.out.println("Turn to the left");

    }

    public void printInfo() {

        System.out.println(carClass);
        System.out.println(marka);
        System.out.println(carWeight);
        System.out.println(Driver);
        System.out.println(Engine);


    }





}