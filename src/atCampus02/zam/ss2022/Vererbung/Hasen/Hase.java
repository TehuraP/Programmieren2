package atCampus02.zam.ss2022.Vererbung.Hasen;

public class Hase {
    public String name;

    public Hase(String n) {
        this.name = n;
    }

    public void schlafen() {
        System.out.println(name + " schläft gemütlich");
    }

    public void hoppeln() {
        System.out.println(name + " hoppelt durch den Wald ");
    }

    public void fressen() {
        System.out.println(name + " frisst genüsslich eine Karotte");
    }
}
