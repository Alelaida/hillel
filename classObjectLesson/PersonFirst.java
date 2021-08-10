package Rep.classObjectLesson;

public class PersonFirst {

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
    public PersonFirst() {
        personName = "Ivan";
        personAge = 30;
        isMarried = false;
    }

    public PersonFirst(String personName) {
        this.personName = personName;
    }

    public PersonFirst(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public PersonFirst(String personName, int personAge, boolean isMarried) {
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
        PersonFirst personFirst = (PersonFirst) o;

        if (personFirst.personAge != personAge) return false;
        if (personFirst.isMarried != isMarried) return false;

        return (personFirst.personName.equals(personName));
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
        PersonFirst personFirst1 = new PersonFirst();
        System.out.println("person1: " + personFirst1.personAge + " " + personFirst1.personName + " " + personFirst1.isMarried);
        PersonFirst personFirst2 = new PersonFirst("Alex");
        System.out.println("person2: " + personFirst2.personAge + " " + personFirst2.personName + " " + personFirst2.isMarried);
        PersonFirst personFirst3 = new PersonFirst("Ben", 25);
        System.out.println("person3: " + personFirst3.personAge + " " + personFirst3.personName + " " + personFirst3.isMarried);
        PersonFirst personFirst4 = new PersonFirst("Sam", 40, false);
        System.out.println("person4 " + personFirst4.personAge + " " + personFirst4.personName + " " + personFirst4.isMarried);
        PersonFirst personFirst5 = new PersonFirst();

        //6
        personFirst4.setPersonAge(39);
        System.out.println("Changed age for person4: " + personFirst4.personAge);

        //8
        PersonFirst[] personFirstMasses = {personFirst1, personFirst2, personFirst3, personFirst4};
        for (PersonFirst item : personFirstMasses) {
            System.out.println("Person name " + item.personName);
        }

        System.out.println(String.format(String.valueOf(personFirst4)));;


        //4
        if
        (personFirst1.equals(personFirst4)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        if
        (personFirst1.equals(personFirst5)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println(personFirst1.hashCode());
        System.out.println(personFirst4.hashCode());

//9
        System.out.println("The person had " + personFirst1.Anniversary() + " anniversaries");
        System.out.println("Fist letter of the name is " + personFirst1.initial());
    }
}
