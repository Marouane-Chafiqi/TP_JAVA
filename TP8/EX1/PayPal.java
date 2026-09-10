package TP8;

public class PayPal implements PaymentMethod {
    String email;
    double balance;

    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("PayPal (" + email + ") : paye " + amount + ", reste " + balance);
            return true;
        }
        System.out.println("PayPal (" + email + ") : fond insuffisant");
        return false;
    }

    public boolean refund(double amount) {
        balance = balance + amount;
        System.out.println("PayPal (" + email + ") : rembourse " + amount + ", solde " + balance);
        return true;
    }

    public String getName() {
        return "PayPal[" + email + "]";
    }
}