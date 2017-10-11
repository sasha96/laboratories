import java.util.Date;

final class Person {
    private final String name;
    private final int age;
    private final Date dateBirthey;

    Person(String name, int age, Date dateBirthey) {
        this.name = name;
        this.age = age;
        this.dateBirthey = new Date(dateBirthey.getTime());
        ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateBirthey() {
        return new Date(dateBirthey.getTime());
    }

}