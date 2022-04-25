package atCampus02.zam.ss2022.Fraction;

public class FractionApp {
    public static void main(String[] args) {
        // Fraction fraction = new Fraction(2,3);
        Fraction fr1 = new Fraction(2, 4);
        Fraction fr2 = new Fraction(2, 8);
        Fraction fr3 = new Fraction(4, 56);

        Fraction mult = fr1.multiplicate(fr2);
        mult.print();
        System.out.println("*****");

        System.out.println(fr1);
        System.out.println(fr2);
        System.out.println(fr3);


        //um die Methode getNrFractions auf zu rufen brauchen wir zuerst die Klasse mit a punkt schreiben
        System.out.println(Fraction.getNrFractions());

    }
}
