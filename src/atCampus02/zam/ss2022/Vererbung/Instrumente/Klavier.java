package atCampus02.zam.ss2022.Vererbung.Instrumente;

public class Klavier  extends Instrument{
    public Klavier() {
        super(19);
    }

    @Override
    public int play() {
        System.out.println("Das Klavier klingt wie eine Miryade Rosen");

        return lautstaerke;
    }
}
