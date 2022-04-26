package atCampus02.zam.ss2022.Vererbung.Hasen;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void hoppeln() {
        System.out.println(name +" wälzt sich durch den Schnees und bringt Geschenke");
    }

    public void verteileGeschenke(int geschenke) {
        System.out.println(name + " verteilt " + geschenke + " geschenke");
    }


}
