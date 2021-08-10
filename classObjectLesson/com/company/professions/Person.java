package Rep.classObjectLesson.com.company.professions;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person full name: %s. Person age: %s  ", fullName, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;

        return (person.fullName.equals(fullName) && person.age == age);
    }

    @Override
    public int hashCode() {

        return fullName.hashCode() + age + 31;

    }
}







