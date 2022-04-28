package atCampus02.zam.ss2022.OrchestraAbstract.Instrumente;

public class Geige extends Instrument {
    public Geige() {
        super(10, "Geige");
    }

    @Override
    public int play() {
        System.out.println("Die Geige wird gestrichen");
        return lautstaerke;
    }
}
