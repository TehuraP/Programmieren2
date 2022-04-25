package atCampus02.zam.ss2022.Vererbung.Customer;

public class CustomerApp {

    public static void main(String[] args) {

        Address a1 = new Address("Fellingergasse 3", "8020", "Graz", "Österreich");
        Address a2 = new Address("Neue Welt 7", "8043", "Graz", "Österreich");
        Customer c1 = new Customer(1,"Hansi1", "Hintersee");
        Customer c2 = new Customer(2, "Hansi2", "Vorneberg");

        c1.addAddress(a1);
        c2.addAddress(a2);

        System.out.println(c1);
        System.out.println(c2);
        c1.eatChocolate();
    }
}
