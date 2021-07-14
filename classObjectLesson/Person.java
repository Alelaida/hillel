package Rep.classObjectLesson;

public class Person {

    //1

    String personName;
    int personAge;
    boolean isMarried;

    public Person() {
        personName = "Ivan";
        personAge = 30;
        isMarried = false;
    }

    //2
    public Person(String personName) {
        this.personName = personName;
    }

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public Person(String personName, int personAge, boolean isMarried) {
        this.personName = personName;
        this.personAge = personAge;
        this.isMarried = isMarried;
    }

    //3
    @Override
    public String toString() {
        return "Person name: " + personName + "Person age: " + personAge + " Married:" + isMarried;
    }

    //6
    public void setPersonAge(int setPersonAge) {
        personAge = setPersonAge;
    }


    public static void main(String[] args) {
        //5//7
        Person Person1 = new Person();
        System.out.println("Person1: " + Person1.personAge + " " + Person1.personName + " " + Person1.isMarried);
        Person Person2 = new Person("Alex");
        System.out.println("Person2: " + Person2.personAge + " " + Person2.personName + " " + Person2.isMarried);
        Person Person3 = new Person("Ben", 25);
        System.out.println("Person3: " + Person3.personAge + " " + Person3.personName + " " + Person3.isMarried);
        Person Person4 = new Person("Sam", 40, false);
        System.out.println("Person4 " + Person4.personAge + " " + Person4.personName + " " + Person4.isMarried);

        //6
        Person4.setPersonAge(39);
        System.out.println("Changed age for Person4: " + Person4.personAge);

        //8
        Person[] PersonMass = {Person1, Person2, Person3, Person4};
        for (Person item : PersonMass) {
            System.out.println("Person name " + item.personName);
        }
    }
}
//some comment///