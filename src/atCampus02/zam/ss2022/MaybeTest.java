package atCampus02.zam.ss2022;
//generics
public class MaybeTest {
    public static void main(String[] args) {
        Maybe<Double> gehalt = new Maybe<>(2030.36, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Laura", "AT123456", "2345GHT"),1);
        meinKonto.print();
    }
}
