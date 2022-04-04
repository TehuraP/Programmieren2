package atCampus02.zam.ss2022;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase("Dieter (aka Hansi)", 77,HasenReligion.ZURHEILIGENKAROTTE);
        Osterhase marla = new Osterhase("Marla");

        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println("*****");
        System.out.println("DIETER NUMMER");
        System.out.println(dieter.getHaeschenNummer());


        System.out.println();

        System.out.println(marla.getName());
        System.out.println(marla.getAnzahlVersteckteEier());
        System.out.println("MARLA NUMMER");
        System.out.println(marla.getHaeschenNummer());

        System.out.println();

//        dieter.setName("Dieter (formerly known as Hansi)");
//        dieter.setAnzahlVersteckteEier(5);
        // System.out.println(dieter.anzahlVersteckteEier);
//        System.out.println(dieter.getName());
//        System.out.println(dieter.getAnzahlVersteckteEier());
        // moechte ein Ei zu der bisherigen summe addieren
        System.out.println("********");
        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1);
        System.out.println(dieter.getAnzahlVersteckteEier());
        //System.out.println(dieter.anzahlVersteckteEier);
        // dieter.anzahlVersteckteEier = -2;
        //System.out.println(dieter.anzahlVersteckteEier);


        //after making the toString method, it looks like this
        System.out.println(dieter);
        System.out.println(marla);
    }
}
