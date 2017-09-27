public class Window {
    public static void main(String[] args) {
        Employee employee = new Employee("Vadim","Yrchenko",
                "student", 444332);
        Employee employee2 = new Employee("Sasha","Bondar",
                "green men", 12321);
        Employee employee3 = new Employee("Sergo","Gvozd",
                "amako", 83452);
        System.out.println(Employee.getNumberOfEmployee());
    }
}
