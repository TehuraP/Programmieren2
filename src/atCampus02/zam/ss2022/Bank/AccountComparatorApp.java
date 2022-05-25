package atCampus02.zam.ss2022.Bank;

import java.util.ArrayList;
import java.util.Collections;

public class AccountComparatorApp {
    public static void main(String[] args) {
        Account a1 = new Account("D", "AT...", "346346");
        Account a2 = new Account("F", "AT...", "234511");
        Account a3 = new Account("E", "AT...", "6334565");
        a1.add(1000);
        a2.add(400);
        a3.add(200);


        ArrayList<Account> allAccounts = new ArrayList<>();
        allAccounts.add(a1);
        allAccounts.add(a2);
        allAccounts.add(a3);

        System.out.println(allAccounts);
        Collections.sort(allAccounts, new AccountBalanceComparator());

        System.out.println(allAccounts);

        Collections.sort(allAccounts);

        System.out.println(allAccounts);

    }
}
