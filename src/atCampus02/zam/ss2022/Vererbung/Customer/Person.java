package atCampus02.zam.ss2022.Vererbung.Customer;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void eatChocolate(){
        System.out.println(firstName + " " + lastName + " eats chocolate");
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + firstName + '\'' +
                ", nachname='" + lastName + '\'' +
                '}';
    }
}
