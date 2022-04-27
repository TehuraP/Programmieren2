package atCampus02.zam.ss2022.Vererbung.Instrumente;

import java.util.ArrayList;

public class Orchestra {
    ArrayList<Instrument> orchestra;

    public Orchestra() {
        orchestra = new ArrayList<Instrument>();
    }

    public void addInstrument(Instrument i) {
        orchestra.add(i);
    }

    public int playAll() {

        int lautstärke = 0;
        for (Instrument lol : orchestra) {
            lautstärke += lol.lautstaerke;
            System.out.println(lol.play());
        }
        System.out.println(lautstärke);
        return lautstärke ;
    }

}
