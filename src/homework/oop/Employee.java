package homework.oop;

//Задача №2
//
//Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
// Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого
// был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

public class Employee extends Person {

    private double salary;

    @Override
    public String getName() {
        if (getGender().equals("female")) {
            return super.getName().replace("Mrs. ", "");
        }
        return super.getName().replace("Mr. ", "");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        if (employee.getName().equals(Employee.super.getName())) {
            return true;
        } else {
            return false;
        }
    }
}


