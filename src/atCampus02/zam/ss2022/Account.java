package atCampus02.zam.ss2022;

public class Account {
    // we make it static and it will only initialized once
    private static int uniqueID =1;

    private String owner;
    private String iban;
    private String bic;
    private int accountID;
    private double balance;

    public Account(String owner, String iban, String bic) {
        balance = 0;
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        //it will be erhöht each time the klass is used (aufgeruft)
        uniqueID += 1;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", accountID=" + accountID +
                ", balance=" + balance +
                '}';
    }

    public double add(double wert) {
        balance = balance + wert;
        return balance;
    }

//    public double deposit(double wert) {
//
//       if (balance < wert ) {
//        double howMuchWert = balance;
//           balance = 0;
//           return howMuchWert;
//       }
//       else {
//           balance = balance - wert;
//       }
//        return wert;
//    }

    public double deposit(double wert) {
        if (wert > 0) {
            if (wert < balance) {
                balance = balance - wert;
            } else {
                wert = balance;
                balance = 0;
            }
            return wert;
        }
        return 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }


}
