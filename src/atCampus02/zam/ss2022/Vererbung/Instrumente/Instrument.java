package atCampus02.zam.ss2022.Vererbung.Instrumente;

public class Instrument {
    int lautstaerke;

    public Instrument(int lautstaerke) {
        this.lautstaerke = 0;
    }

    public int play() {
        return lautstaerke;
    }
}
