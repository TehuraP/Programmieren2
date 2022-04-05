package atCampus02.zam.ss2022;

public class Osterhase {
    //this attribute is static and will be initialized only once because it is static
    private static int haeschenZaehler = 1;
    private String name;
    private int anzahlVersteckteEier;
    private int haeschenNummer;
    private OsterHasenReligion persoenlicheGlaube;

    public Osterhase(String name, int anzahlVersteckteEier, OsterHasenReligion glaube) {
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
        haeschenNummer = haeschenZaehler++;
        persoenlicheGlaube = glaube;
    }

    @Override
    public String toString() {
        return  name + " versteckt " + anzahlVersteckteEier +
               "  Eier und glaubt an: " + persoenlicheGlaube;
    }

    public int getHaeschenNummer() {
        return haeschenNummer;
    }

    public Osterhase(String name) {
        this.name = name;
        this.anzahlVersteckteEier = 0;
        haeschenNummer = haeschenZaehler++; //jeder Osterhase soll ein eigene eindeutige Nummer haben (wegen der Steuer)
        //alternativer Zugriff oder von außen (wens nicht privat wäre)
        //Osterhase.haeschenzaehler

        //der Konstruktor nimmt das als Standardwert.
        persoenlicheGlaube = OsterHasenReligion.LANGEOHRENZEUGEN;
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
