package Rep.classObjectLesson.com.company.vehicles;

import Rep.classObjectLesson.com.company.details.Engine;

import java.util.Objects;


public class Lorry extends Car {


    int carrying;

    public Lorry(String carClass, String marka, int carWeight, int carrying) {
        super(carClass, marka, carWeight);
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
        return String.format("Car class: %s. Car Marka: %s.  Car weight: %s.  Carrying: %s. ", getCarClass(), getMarka(),getCarWeight(), carrying);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lorry)) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return getCarrying() == lorry.getCarrying();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCarrying());
    }
}
