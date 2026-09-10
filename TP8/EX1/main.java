package TP8;

public class main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.addMethod(new CreditCard("1234-5678-9012-3456", "Marouane Chafiqi", 500.0));
        processor.addMethod(new PayPal("mchafiqi69@gmaiL.com", 200.0));
        processor.addMethod(new Bitcoin("Azertry83", 0.10));

        double montant = 100.0;
        processor.processPayments(montant);
    }
}