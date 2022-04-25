package atCampus02.zam.ss2022.Vererbung.Hasen;

import java.util.ArrayList;

public class Hasenstall {
    private ArrayList<Hase> hasenliste;

    public Hasenstall() {
        hasenliste = new ArrayList<>();
    }

    public void addHase(Hase hase) {
        hasenliste.add(hase);
    }

    public void alleHoppen() {
        for (Hase h : hasenliste) {
            h.hoppeln();
        }
    }
}
