package atCampus02.zam.ss2022.Vererbung.Hasen;

public class HasenApp {
    public static void main(String[] args) {
        Osterhase oster = new Osterhase("Bugs");
        Weihnachtshase weihnachtshase = new Weihnachtshase("Snowi");
        Hase manolito = new Hase("manolito");
        manolito.fressen();
        manolito.hoppeln();

        //lets try up and downcasting

        //upcasting osterhase to hase -> specialised type to general type is possible

        Hase hase1 = oster;
        hase1.hoppeln(); //osterhase implementation is used
        //it only offers the methods of the Hase class, not the Osterhase class (we do not know any longer the specific osterhase methods)

        //if we know that there is really a osterhase behind -> downcasten

        Osterhase oster2 = (Osterhase) hase1; //downcasting works
        oster2.versteckeOstereier(5);

        //but not always - a weihnachtshase cannot be a osterhase cuz they are missing attributes and methods of an Osterhase
        // oster2 = (Osterhase) weihnachtshase;

        Hasenstall hs = new Hasenstall();
        hs.addHase(oster2);
        hs.addHase(weihnachtshase);

        hs.alleHoppen();


        //try around with up and downcasting
        Osterhase o1 = new Osterhase("Ms. Egg");
        Osterhase o2 = o1;
        Hase h1 = new Hase("Common Rabbit (but cute)");
        Weihnachtshase w1 = new Weihnachtshase("Mrs. Snow");

        Weihnachtshase wh;
        Osterhase oh;

        Hase h;

        //Vererbungshierarchie
        //                     |--> Osterhase
        //Object --> Hase
        //                     | --> Weihnachtshase

        //upcasting : assigning a child class to a reference of its parents class
        //example:
        // THIS IS UPCASTING
        h = o1; // assign from right (child class Osterhase) to left (parents class)
        // what is the difference if I access now my Mrs. Egg via the h Hase reference
        // -> the verstecke ostereier is missing bc we only see attributes and methods
        //the Hase already has ( imagine: we view the Osterhase Mrs. Egg through the lens of a Hase)
        // wy do we do this?
        // but the nice thing is: if we call a method already known to the Hase then the correct implementation
        // (the nearest one) is executed -> so in our case the implementation of Osterhase
        h.hoppeln();
        h1.hoppeln();

        //why do we make this? -> because of polymorphism ( think about arraylist)

        // now what is downcasting?
        //assigning a general type to a more specialized type (ATTENTION - ALARM SIGNAL)
        //this only works if this general reference already refers to a special object instance
        //wh= (Weihnachtshase) h1; //this gives us a ClassCastException
        //but there are special cases when downcasting works ( I will have to upcast before)
        h = w1; // this happened somewhere before ( could be years)
        //but we know that behind this Hase reference is really a Weihnachtshase
        // (we know it from somewhere - next time we will also learn how to check)
        wh = (Weihnachtshase) h;
        h.hoppeln();
        wh.hoppeln();





    }


}
