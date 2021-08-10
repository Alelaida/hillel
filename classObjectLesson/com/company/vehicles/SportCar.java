package Rep.classObjectLesson.com.company.vehicles;


import java.util.Objects;

public class SportCar extends Car {
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SportCar(String carClass, String marka, int carWeight, int speed) {
        super(carClass, marka, carWeight);
        this.speed = speed;


    }

    @Override
    public String toString() {
        return String.format("Car class: %s. Car Marka: %s.  Car weight: %s. Speed: %s. ", getCarClass(), getMarka(), getCarWeight(), speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return getSpeed() == sportCar.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed());
    }
}
