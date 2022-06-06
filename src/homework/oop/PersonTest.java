package homework.oop;

import homework.oop.Person;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Anna", 33, "female");
        Person person2 = new Person("Anton", 30, "male");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1.getName());

        Person[] personArray  = {person1, person2};

        Person personMinAge = Person.getMinAge(personArray);
        System.out.println(personMinAge.getName());
        System.out.println(person1.getName());

    }
}
