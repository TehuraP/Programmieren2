package atCampus02.zam.ss2022.Vererbung.Instrumente;

public class Orgel extends Instrument {
    public Orgel() {
        super(26);
    }

    @Override
    public int play() {
        System.out.println("Das Orgel klingt majestätisch");

        return lautstaerke;
    }
}
