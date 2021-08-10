package Rep.classObjectLesson.com.company.professions;


public class Driver extends Person {
    int experience;
    Person Person;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;

    }





    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Driver's full name: %s. Driving experience: %s. ", getFullName(), experience);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Driver driver = (Driver) o;

        return (driver.getFullName().equals(getFullName()) && driver.experience == experience);
    }

    @Override
    public int hashCode() {
        return getFullName().hashCode() + experience + 31;
    }
}