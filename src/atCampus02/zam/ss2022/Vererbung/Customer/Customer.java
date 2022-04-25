package atCampus02.zam.ss2022.Vererbung.Customer;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;// = new ArrayList<Address>();

    public Customer(int customerNumber, String vorname, String nachname) {
        //super immer an die erste Zeile hinfügen, sonst nimmt es den Default constructor
        super(vorname, nachname);
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public void eatChocolate() {
        super.eatChocolate();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                "first name=" + firstName +
                "last name=" + lastName +
                '}';
    }
}
