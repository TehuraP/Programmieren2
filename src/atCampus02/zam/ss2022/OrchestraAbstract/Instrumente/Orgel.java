package atCampus02.zam.ss2022.OrchestraAbstract.Instrumente;

public class Orgel extends Instrument {
    public Orgel() {
        super(26, "Orgel");
    }

    @Override
    public int play() {
        System.out.println("Das Orgel klingt majestätisch durch die leernen Hallen");

        return lautstaerke;
    }

}
