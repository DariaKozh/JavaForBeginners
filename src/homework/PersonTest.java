package homework;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Anna", 33, "femail");
        Person person2 = new Person("Anton", 30, "mail");

        System.out.println(person1.getName(person1));
        System.out.println(person2.getName(person2));
        System.out.println(person1.getName(person2));

        Person[] personArray  = {person1, person2};

        Person personMinAge = Person.getMinAge(personArray);
        System.out.println(personMinAge.getName());

    }
}
