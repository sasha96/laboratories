public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phone;

    public void infoAboutPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void infoAboutPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void infoAboutPreson(String gender, int age, int phone) {
        this.gender = gender;
        this.age = age;
        this.phone = phone;
    }

    public void infoAboutPerson(int age, int phone) {
        this.phone = phone;
        this.age = age;
    }

    public void infoAboutPreson(String firstName, String lastName, int age, String gender, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }
}
