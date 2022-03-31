package atCampus02.zam.ss2022;

public class Osterhase {
    private String name;
    private int anzahlVersteckteEier;

    public Osterhase(String name, int anzahlVersteckteEier) {
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
    }

    public Osterhase(String name) {
        this.name = name;
        this.anzahlVersteckteEier = 0;
    }

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if (anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void aendereAnzahlEier(int anzahlVersteckteEier) {
//
//        //ich kann sicher stellen, dass kein blödsinn gemacht wird
//        if (anzahlVersteckteEier >= 0) {
//            // lokale Variable oder parameter mit gleichen namen werder bevorzugt
//            // anzahlVersteckteEier   --> parameter
//            //this referenz zeigt auf die aktuelle instanz
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//
//    }

    //methoden überladen - unterscheidet sich durch typ/anzahl der parameter
    //hier haben wir eine ohne PArameter -> dann soll osterhase ein Duzend Eier verstecken
//    public void aendereAnzahlEier() {
//        anzahlVersteckteEier = 12;
//        //this.anzahl... wäre möglich aber nicht notwendig, da keine namensgleichheit
//    }
//
//    public int gibtMirAnzahlDerVerstecktenEier() {
//        return anzahlVersteckteEier;
//    }
}
