package Rep.classObjectLesson;

public class Person {

    //1
    String personName;
    private int personAge;
    boolean isMarried;

    //10
    //getters and setters
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    //2
    public Person() {
        personName = "Ivan";
        personAge = 30;
        isMarried = false;
    }

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
        return String.format("Person name: %s. Person age: %s  Married: %s", personName, personAge, isMarried);
    }

    //4
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;

        if (person.personAge != personAge) return false;
        if (person.isMarried != isMarried) return false;

        return (person.personName.equals(personName));
    }

    //4
    @Override
    public int hashCode() {
        int m = 0;
        if (isMarried = true) {
            m = 1;
        } else
            m = 0;
        return personName.hashCode() + m + 31;
    }

    //6
    public void setPersonAge(int setPersonAge) {
        personAge = setPersonAge;
    }


    //9
    public int Anniversary() {
        int ann = personAge / 10;
        return ann;
    }

    public char initial() {
        char f = personName.charAt(0);
        return f;
    }


    public static void main(String[] args) {
        //5//7
        Person person1 = new Person();
        System.out.println("person1: " + person1.personAge + " " + person1.personName + " " + person1.isMarried);
        Person person2 = new Person("Alex");
        System.out.println("person2: " + person2.personAge + " " + person2.personName + " " + person2.isMarried);
        Person person3 = new Person("Ben", 25);
        System.out.println("person3: " + person3.personAge + " " + person3.personName + " " + person3.isMarried);
        Person person4 = new Person("Sam", 40, false);
        System.out.println("person4 " + person4.personAge + " " + person4.personName + " " + person4.isMarried);
        Person person5 = new Person();

        //6
        person4.setPersonAge(39);
        System.out.println("Changed age for person4: " + person4.personAge);

        //8
        Person[] PersonMass = {person1, person2, person3, person4};
        for (Person item : PersonMass) {
            System.out.println("Person name " + item.personName);
        }

        System.out.println(String.format(String.valueOf(person4)));;


        //4
        if
        (person1.equals(person4)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        if
        (person1.equals(person5)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println(person1.hashCode());
        System.out.println(person4.hashCode());

//9
        System.out.println("The person had " + person1.Anniversary() + " anniversaries");
        System.out.println("Fist letter of the name is " + person1.initial());
    }
}
