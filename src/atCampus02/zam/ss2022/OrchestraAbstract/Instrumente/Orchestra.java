package atCampus02.zam.ss2022.OrchestraAbstract.Instrumente;

import java.util.ArrayList;

public class Orchestra {
   private ArrayList<Instrument> orchestra;

    public Orchestra() {
        orchestra = new ArrayList<Instrument>();
    }

    public void addInstrument(Instrument i) {
        orchestra.add(i);
    }

    public int playAll() {

        int summe = 0;
        for (Instrument in : orchestra) {
            in.play();
            summe += in.getLautstaerke(); // i.lautstaerke würde hier auch funktionieren weil in gleichen Package
        }
        System.out.println(summe);
        return summe ;
    }

}
