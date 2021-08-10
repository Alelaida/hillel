package Rep.classObjectLesson.com.company;

import Rep.classObjectLesson.com.company.details.Engine;
import Rep.classObjectLesson.com.company.professions.Driver;
import Rep.classObjectLesson.com.company.professions.Person;
import Rep.classObjectLesson.com.company.vehicles.Car;
import Rep.classObjectLesson.com.company.vehicles.Lorry;
import Rep.classObjectLesson.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Petrov V.V", 42);
        Driver driver1 = new Driver("Petrov V.A", 39, 40);
        Engine engine1 = new Engine("Abc", 120);
        Car car1 = new Car("A", "Ferrari", 120, driver1, engine1);
        Car car2 = new Car("A", "Ferrari", 120, driver1, engine1);
        Car car3 = new Car("B", "Volvo", 90, driver1, engine1);
        car1.printInfo();
        System.out.println();

        Lorry lorry1 = new Lorry("A", "Vaz", 350, 100);


        SportCar sportCar1 = new SportCar("A", "Vaz", 350, 150);


        System.out.println(String.valueOf(car1));
        System.out.println(String.valueOf(lorry1));
        System.out.println(String.valueOf(sportCar1));


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

        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();
        car1.printInfo();

    }
}

