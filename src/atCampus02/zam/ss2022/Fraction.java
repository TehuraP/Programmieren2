package atCampus02.zam.ss2022;

public class Fraction {
    private static int nrFractions = 0;
    private int numerator;
    private int denominator;

    //make a constructor that is called like the class
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        //++ nrFractions
        nrFractions += 1;
    }

    public static int getNrFractions() {
        return nrFractions;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public double toDecimal() {
        //we write double bc num and den are integers but dividing them gives a double number
        return (double) numerator / denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction multiplicate(Fraction b2) {
        Fraction erg = new Fraction(numerator, denominator);

        erg.numerator = erg.numerator * b2.numerator;
        erg.denominator = erg.denominator * b2.denominator;
        return erg;
    }
}
//    public int getNumbers(int zaehler, int nenner) {
//        return zaehler;
//
//    }
//
//    public double toDecimal() {
//        return zaehler / nenner;
//    }
//
//    public void print() {
//        System.out.println(zaehler + "/" + nenner);
//    }
//
//    public Fraction multiplicate(Fraction b2) {
//
//
//        return b2;
//    }

