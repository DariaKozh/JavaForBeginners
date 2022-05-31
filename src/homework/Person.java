package homework;

//Задача №1
//
//Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
// метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

public class Person {

   private String name;
   private int age;
   private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName(){
        if (gender.equals("femail")){
            return "Mrs. "+ name;
        } else {
            return "Mr. " + name;
        }
    }

    public String getName(Person person) {
        if (person.gender.equals("femail")){

            return "Mrs. " + person.name;
        } else if (person.gender.equals("mail")){

            return "Mr. " + person.name;
        } else {

            return person.name;
        }
    }

    static Person getMinAge(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.age > arr[i].age) {
                min = arr[i];
            }
        }

        return min;
    }
}
