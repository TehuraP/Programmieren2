package atCampus02.zam.ss2022;

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


    }
}
