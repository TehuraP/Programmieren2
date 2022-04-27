package atCampus02.zam.ss2022.Vererbung.Instrumente;

public class Gitarre extends Instrument {
    public Gitarre() {
        super(7);

    }

    @Override
    public int play() {
        lautstaerke = 10;
        System.out.println("Die Gitarre wird gerockt");
        return lautstaerke;
    }
}
