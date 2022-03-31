package atCampus02.zam.ss2022;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account(String owner, String iban, String bic) {
        balance = 0;
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
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

    public double deposit (double wert) {
        if (wert > 0) {
            if (wert < balance) {
                balance = balance - wert;
            }
            else {
                wert = balance;
                balance = 0;
            }
            return wert;
        }
        return 0;
    }

    public double getBalance () {
        return balance;
    }
    public String getOwner () {
        return owner;
    }




}
