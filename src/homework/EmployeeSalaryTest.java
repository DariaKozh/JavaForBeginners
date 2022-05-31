package homework;

public class EmployeeSalaryTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];


        Employee john = new Employee("John Gerf", 36, "male", 54638.12);
        Employee jane = new Employee("Jane Tu", 33, "female", 35678.69);
        Employee oleg = new Employee("Oleg Mu", 31, "male", 64258.15);

        System.out.println(oleg.isSameName(oleg));
        System.out.println(oleg.isSameName(jane));

        employees[0] = john;
        employees[1] = jane;
        employees[2] = oleg;

        Salary salary = new Salary();
        System.out.println(salary.getSum(employees));
    }
}
