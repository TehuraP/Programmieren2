package atCampus02.zam.ss2022.Vererbung.Hasen;

public class HasenApp {
    public static void main(String[] args) {
        Osterhase oster= new Osterhase("Bugs");
        Weihnachtshase weihnachtshase = new Weihnachtshase("Snowi");
        Hase manolito = new Hase("manolito");
        manolito.fressen();
        manolito.hoppeln();

        //lets try up and downcasting

        //upcasting osterhase to hase -> specialised type to general type is possible

        Hase hase1 = oster;
        hase1.hoppeln(); //osterhase implementation is used
        //it only offers the methods of the Hase class, not the Osterhase class (we do not know any longer the specific osterhase methods)

        //if we know that there is really a osterhase behind -> downcasten

        Osterhase oster2= (Osterhase) hase1; //downcasting works
        oster2.versteckeOstereier(5);

        //but not always - a weihnachtshase cannot be a osterhase cuz they are missing attributes and methods of an Osterhase
       // oster2 = (Osterhase) weihnachtshase;

        Hasenstall hs = new Hasenstall();
        hs.addHase(oster2);
        hs.addHase(weihnachtshase);

        hs.alleHoppen();
    }




}
