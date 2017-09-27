public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    private static int numberOfEmployee;

    public Employee(String firstName, String lastName, String occupation,
                    int telephone) {
        setFirstName(firstName);
        setLastName(lastName);
        setOccupation(occupation);
        setTelephone(telephone);
        numberOfEmployee++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        Employee.numberOfEmployee = numberOfEmployee;
    }
}
