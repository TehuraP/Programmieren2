package atCampus02.zam.ss2022;

public class WrapperDemo {
    public static void main(String[] args) {
        //aufgrunf von autoboxing können int und Integer stellvertretend verwenden werden
        Integer i = 22;
        int j = new Integer(27); // durchgestrichen da deprecated- einfach ohne Integer Konstruktor machen.
        Integer k = null;

        System.out.println(i);
        int l = Integer.parseInt("16"); //für kommazahl bei Double schauen
        System.out.println("16" +2);
        System.out.println(16 + 2);

    }
}
