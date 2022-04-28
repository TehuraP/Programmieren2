package atCampus02.zam.ss2022.OrchestraAbstract.Instrumente;

public class Gitarre extends Instrument {
    public Gitarre(int lautstaerke, String name) {
        super(lautstaerke, name);

    }

    @Override
    public int play() {
        System.out.println("Die Gitarre " + name + " wird gerockt");
        return lautstaerke;
    }

}
