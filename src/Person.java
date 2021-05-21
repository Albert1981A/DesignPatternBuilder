import java.time.LocalDate;

public class Person {

    /**
     * Builder is a pattern for creating live objects by chine of creation
     * we use the setters for creating the objects and it doesn't mater what we will enter first
     */
    private static int COUNT = 1;

    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birth;

    public static Person builder() {
        return new Person();
    }

    public Person() {
    }

    public Person(int id, String lastName, String firstName, LocalDate birth) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person id(int id) {
        this.setId(id);
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person lastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person firstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Person birth(LocalDate birth) {
        this.setBirth(birth);
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birth=" + DateUtil.formatDate(birth) +
                '}';
    }

}
