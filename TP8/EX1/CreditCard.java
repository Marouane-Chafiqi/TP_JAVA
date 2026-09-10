package TP8;

public class CreditCard implements PaymentMethod {
    String number;
    String holder;
    double balance;

    public CreditCard(String number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("CreditCard (" + holder + ") : paye " + amount + ", reste " + balance);
            return true;
        }
        System.out.println("CreditCard (" + holder + ") : fond insuffisant");
        return false;
    }

    public boolean refund(double amount) {
        balance = balance + amount;
        System.out.println("CreditCard (" + holder + ") : rembourse " + amount + ", solde " + balance);
        return true;
    }

    public String getName() {
        return "CreditCard[" + holder + "]";
    }
}