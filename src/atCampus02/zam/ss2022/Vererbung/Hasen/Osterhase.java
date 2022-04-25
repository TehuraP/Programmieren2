package atCampus02.zam.ss2022.Vererbung.Hasen;

public class Osterhase extends Hase {

    public Osterhase(String n) {
        super(n);
    }

    public void versteckeOstereier(int anzahlEier) {
        System.out.println(name + " versteckt " + anzahlEier + " nachhaltige regionale Ostereier");
    }

    @Override
    public void hoppeln() {

        System.out.println("Osterhase " + name + " springt durch die Luft und versteckt Eier");
    }
}
