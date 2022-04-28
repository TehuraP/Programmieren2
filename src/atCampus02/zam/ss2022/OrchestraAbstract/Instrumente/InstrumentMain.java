package atCampus02.zam.ss2022.OrchestraAbstract.Instrumente;

public class InstrumentMain {
    public static void main(String[] args) {
        Orchestra orchestra = new Orchestra();
        Geige geige = new Geige();
        Klavier klavier = new Klavier();
        Gitarre gitarre = new Gitarre(10, "Roberto");
        Orgel orgel = new Orgel();

        //does not work bc abstract class
       // Instrument i = new Instrument() {
       // }

        orchestra.addInstrument(geige);
        orchestra.addInstrument(klavier);
        orchestra.addInstrument(gitarre);
        orchestra.addInstrument(orgel);

        orgel.play();
        geige.play();

        System.out.println("");
        orchestra.playAll();
    }
}
