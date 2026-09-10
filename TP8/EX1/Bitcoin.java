package TP8;

public class Bitcoin implements PaymentMethod {
    String walletAddress;
    double balance;

    public Bitcoin(String walletAddress, double balance) {
        this.walletAddress = walletAddress;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Bitcoin (" + walletAddress + ") : paye " + amount + " BTC, reste " + balance);
            return true;
        }
        System.out.println("Bitcoin (" + walletAddress + ") : fond insuffisant");
        return false;
    }

    public boolean refund(double amount) {
        balance = balance + amount;
        System.out.println("Bitcoin (" + walletAddress + ") : rembourse " + amount + " BTC, solde " + balance);
        return true;
    }

    public String getName() {
        return "Bitcoin[" + walletAddress + "]";
    }
}