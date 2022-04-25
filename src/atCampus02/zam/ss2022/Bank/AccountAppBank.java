package atCampus02.zam.ss2022.Bank;

import atCampus02.zam.ss2022.Bank.Account;

import java.util.HashMap;

public class AccountAppBank {
    public static void main(String[] args) {
        Account firstAccount = new Account("Dagobert", "1234566789", " fdg32874369045");
        Account secondAccount = new Account("Daisy", "dfh4380934680", "dfkgjjk3463");
        Account thirdAccount = new Account("Donald", "dsgjh48790", "sdfhj436");

        firstAccount.add(500);
        System.out.println(firstAccount.getBalance());
        secondAccount.add(200);
        thirdAccount.add(600);
        firstAccount.deposit(100);
        System.out.println("*****");

        System.out.println(firstAccount);
        System.out.println(secondAccount);
        System.out.println(thirdAccount);


        Account[] arrayAccount = new Account[]{firstAccount, secondAccount, thirdAccount};
        //for each loop
        for (Account a : arrayAccount) {
            System.out.println(a.getBalance());
        }

        for (int i = 0; i < arrayAccount.length; i++) {
            System.out.println(arrayAccount[i].getOwner());
            System.out.println(arrayAccount[i].getBalance());
        }

        //wir möchten die accounts über den namen der besitzer*innen zugreifen
        //mapping von Dagobert Duck --> Account (....)
        //Degobert Duck ist ein Beispiel für ein schlüßelelement --> String
        //Account (...) ist ein Beispiel für einen Wert -> Account()
        //Achtung: Wenn wir das so machen kann jede person maximal nur einen account haben
        HashMap<String, Account> bank = new HashMap<>();
        bank.put("Dagobert", firstAccount);
        bank.put("Daisy", secondAccount);
        bank.put("Donald", thirdAccount);

        System.out.println(bank.containsKey("Dagobert"));
        //möchten den wert das schlüßel daisy erhalten (also ihr konto)
        System.out.println(bank.get("Daisy"));

        //einmal drüber iterieren -> achtung etwas anders
        for (String owner : bank.keySet()){
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }

    }

}
