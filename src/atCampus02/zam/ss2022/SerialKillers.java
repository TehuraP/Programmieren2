package atCampus02.zam.ss2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SerialKillers {

    //als angehender neuer serienkiller*in (damit sind keine bösartigen personen gemeint sondern personen
    // die sehr gerne und sehr viele serien schauen ) möchten sie auch wirklich in die geschiochtbücher
    //eingehen und deshalb wollen wir sicherstellen, dass ihr neuer name auch wirklich eindeutig ist
    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");

        for (String s : serialNicknames) {
            System.out.println(s);
        }
        //ted bundy darf nur einmal eingefügt werden, wenns schon drinnen ist zeig es "false"
        System.out.println(serialNicknames.add("Ted Bundy"));
        System.out.println(serialNicknames.add("Edmund Kemper"));
        System.out.println(serialNicknames.add("Jack the Reaper"));
        for (String s : serialNicknames) {
            System.out.println(s);
        }
        //zweites set nur für amis ( amerikanner*innen)
        HashSet<String> amerikanSerialKiller = new HashSet<>();
        amerikanSerialKiller.add("Ted Bundy");
        amerikanSerialKiller.add("Edmund Kemper");
        amerikanSerialKiller.add("Hannibal Lecter");
        serialNicknames.retainAll(amerikanSerialKiller);
        System.out.println("--------");
        for (String s : serialNicknames) {
            System.out.println(s);
        }
        //hausaufgabe : the it crowd schauen :
        //zurück zu hashmap
        //in einer hasmap möchten wir alle opfer unserer serienkiller speichern
        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        //wenn ich hier (und nicht in the for schleife) die arraylist erzeuge
        //dann habe ich insgesamt nur eine arraylist und würde jedem serialkiller
        //die gleich arraylist zuweisen (das kann doch nicht richtig sein, weil wenn Ted Bundy
        //ein weiteres opfer findet, dann sollen sich doch nicht die opfer bei dein anderen ändern)
        for (String crazyAmerican : amerikanSerialKiller) {
            ArrayList<String> o = new ArrayList<>();
            o.add("opfer 1");
            o.add("opfer 2");
            o.add("opfer 3");

            opfer.put(crazyAmerican, o); // jeder serienkiller hat eine eigene opferliste (die zufällig den gleichen inhalt hat)

        }
        //wie kann ich denn jetzt ein opfer hinzufügen
        //ganz einfach, -> in dem wir ein opfer in der opfer liste hinzufügen, doch nicht so einfach, wie kommen wir zu unsere opferliste?
        //ted bundy soll ein viertes opfer bekommen
        ArrayList<String> opfi = opfer.get("Ted Bundy");

        opfi.add("opfer 4");
    }
}
