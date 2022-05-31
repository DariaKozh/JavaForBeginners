package homework;

//Задача №2
//
//Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
// Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого
// был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

public class Employee {
   private String name;
   private int age;
   private String gender;
   private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        if (employee.name.equals(Employee.this.name)) {
            return true;
        } else {
            return false;
        }
    }
}


