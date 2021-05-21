import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        /**
         * Regular live object
         */
        Person p1 = new Person(111, "Abuav", "Albert", LocalDate.of(1981,11,27));
        System.out.println(p1);

        /**
         * creating live object with builder
         * This object is created by a chine of creation
         */
        Person p2 = Person.builder()
                .lastName("Abuav")
                .firstName("Albert")
                .birth(LocalDate.of(1981,11,27))
                .id(111);
        System.out.println(p2);

    }
}
