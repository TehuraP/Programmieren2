package atCampus02.zam.ss2022.Vererbung.Hasen;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void hoppeln() {
        System.out.println(name +" Hoppelt durch den Schnee like a idk, something");
    }

    public void verteileGeschenke(int geschenke) {
        System.out.println(name + " verteilt " + geschenke + " geschenke");
    }


}
