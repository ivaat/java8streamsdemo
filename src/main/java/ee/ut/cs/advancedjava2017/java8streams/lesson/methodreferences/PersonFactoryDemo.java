package ee.ut.cs.advancedjava2017.java8streams.lesson.methodreferences;

public class PersonFactoryDemo {
    static class Person {
        String firstName;
        String lastName;

        Person() {}

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    static interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        //matching constructor chosen!
        //demo - DefaultPersonFactory
    }
}
