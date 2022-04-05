package atCampus02.zam.ss2022;

public class AccountAppBank {
    public static void main(String[] args) {
        Account firstAccount = new Account("Hansi", "1234566789", " fdg32874369045");
        Account secondAccount = new Account("Fluffy", "dfh4380934680", "dfkgjjk3463");
        Account thirdAccount = new Account("Manolito", "dsgjh48790", "sdfhj436");

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
        for (Account a: arrayAccount) {
            System.out.println(a.getBalance());
        }

        for (int i = 0; i < arrayAccount.length; i++) {
            System.out.println(arrayAccount[i].getOwner());
            System.out.println(arrayAccount[i].getBalance());
        }
    }

    public static class HimmelRichtungEnum {

    }
}
