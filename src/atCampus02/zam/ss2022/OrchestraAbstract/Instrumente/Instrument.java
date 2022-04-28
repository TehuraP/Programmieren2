package atCampus02.zam.ss2022.OrchestraAbstract.Instrumente;
//we made it abstract so that we cant make an object only from an istrument
public abstract class Instrument {
    protected int lautstaerke;
    protected String name;

    public Instrument(int lautstaerke, String name) {
        this.lautstaerke = lautstaerke;
        this.name = name;

    }

    public abstract int play();

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
