package Rep.classObjectLesson.com.company.professions;

import Rep.classObjectLesson.Person;

public class Driver extends Person {
    String fullName;
    int experience;

    public Driver(String personName, int personAge, boolean isMarried, String fullName, int experience) {
        super(personName, personAge, isMarried);
        this.fullName = fullName;
        this.experience = experience;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Driver's full name: %s. Driving experience: %s. ", fullName, experience);
    }

    public static void main(String[] args) {
        Driver driver1 = new Driver("Sam", 40, true, "Pertrov S.S", 10);

    }
}