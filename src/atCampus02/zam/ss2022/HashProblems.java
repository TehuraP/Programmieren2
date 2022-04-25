package atCampus02.zam.ss2022;

import atCampus02.zam.ss2022.Bank.Account;

import java.util.HashSet;

public class HashProblems {
    public static void main(String[] args) {
        //zeigen, dass theoretisch unterschiedliche objekte gleiche hashcode haben können
        String s1 = "VII";
        String s2 = "Ugh";
        //wichtig beide ibans gleich, rest egal
        Account firstAccount = new Account("Hansititoitotito", "1234566789", " fdg32874369045");
        Account secondAccount = new Account("Hansi", "1234566789", " fdg32874369045");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //erzeugen eine menge (in matematischen sinne)
        //warum eine menge? weil diese hat die spezielle eigenschaft
        //dass jedes objekt nur einmal darein sein darf
        //wie etscheide ich ob es schon drinnen ist oder nicht?
        // die collection verwendet intern dafür der methode hashcode (und falls wirklich gleich ist danach noch equals)
        //das wird automatisch beim hinzufügen überprüft

        HashSet<Account> bank = new HashSet<>();
        System.out.println(bank.add(firstAccount));
        System.out.println(bank.add(secondAccount));


    }
}
