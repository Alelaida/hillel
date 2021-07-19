package Rep.classObjectLesson.com.company.vehicles;

import Rep.classObjectLesson.Person;
import Rep.classObjectLesson.com.company.details.Engine;
import Rep.classObjectLesson.com.company.professions.Driver;

public class Car {
    String carClass;
    String marka;
    int carWeight;
    Driver Driver;
    Engine Engine;

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

    public Rep.classObjectLesson.com.company.professions.Driver getDriver() {
        return Driver;
    }

    public void setDriver(Rep.classObjectLesson.com.company.professions.Driver driver) {
        Driver = driver;
    }

    public Rep.classObjectLesson.com.company.details.Engine getEngine() {
        return Engine;
    }

    public void setEngine(Rep.classObjectLesson.com.company.details.Engine engine) {
        Engine = engine;
    }


    public Car(String carClass, String marka, int carWeight, Rep.classObjectLesson.com.company.professions.Driver driver, Rep.classObjectLesson.com.company.details.Engine engine) {
        this.carClass = carClass;
        this.marka = marka;
        this.carWeight = carWeight;
        Driver = Driver;
        Engine = Engine;
    }

    public void start() {
        System.out.println("Lets drive");

    }

    public void Stop() {
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

    //4
    @Override
    public int hashCode() {

        return carClass.hashCode() + marka.hashCode() + carWeight + 31;
    }


    public static void main(String[] args) {
        Driver driver1 = new Driver("Sam", 40, true, "Pertrov S.S", 10);
        Engine engine1 = new Engine("Abc", 120);
        Car car1 = new Car("A", "Ferrari", 120, driver1, engine1);
        Car car2 = new Car("A", "Ferrari", 120, driver1, engine1);
        Car car3 = new Car("b", "Volvo", 90, driver1, engine1);
        car1.printInfo();
        System.out.println();

        Lorry lorry1 = new Lorry("A", "Vaz", 350, driver1, engine1, 100);


        SportCar sportCar1 = new SportCar("A", "Vaz", 350, driver1, engine1, 150);


        System.out.println(String.format(String.valueOf(car1)));
        System.out.println(String.format(String.valueOf(lorry1)));
        System.out.println(String.format(String.valueOf(sportCar1)));


        if
        (car1.equals(car2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        if
        (car1.equals(car3)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}