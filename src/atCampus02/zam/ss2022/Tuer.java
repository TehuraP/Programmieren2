package atCampus02.zam.ss2022;

public class Tuer {
    private int breite;
    private int hoehe;
    private TuerHimmelRichtungen richtung;

    public Tuer(TuerHimmelRichtungen richtung, int breite, int hoehe) {
        this.richtung = richtung;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public String toString() {
        return "Die Tür hat eine " +
                "breite von " + breite +
                ", eine hoehe von " + hoehe +
                ", und schaut in der Richtung " + richtung;
    }

    public TuerHimmelRichtungen getRichtung() {
        return richtung;
    }

    public void setRichtung(TuerHimmelRichtungen richtung) {
        this.richtung = richtung;
    }
}
