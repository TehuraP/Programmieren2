package atCampus02.zam.ss2022.Vererbung.Dog;

public class DogParty {
    public static void main(String[] args) {
        //first constructor with parameters
        Dog scooby = new Dog ("Scooby Doo", "Black", 40, true);

        System.out.println(scooby);

        scooby.bark();
        // second constructor without parameters
       // Dog hund = new Dog();
        System.out.println("**");
       // hund.bark();
        // new Beagle that inherited methods and attributs from the Parent Class Dog
        Beagle max = new Beagle("Hansi", "blue", 80, true, "Germknödel");
        System.out.println("**");
        System.out.println(max);
    }

}
