

public class Employee {

    void calcSalary(String name, double salary) {
        if (salary > 5000) {
            salary = salary - salary * 0.1;
        } else if (salary < 5000) {
            salary = salary + salary * 0.1;
        }
        System.out.println("name employee " + name + " his salary " + salary);
    }
}
