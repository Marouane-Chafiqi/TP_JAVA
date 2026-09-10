package TP8;

public class PaymentProcessor {
    PaymentMethod[] methods = new PaymentMethod[3];
    int count = 0;

    public void addMethod(PaymentMethod m) {
        if (count == methods.length) {
            PaymentMethod[] tmp = new PaymentMethod[methods.length * 2];
            for (int i = 0; i < methods.length; i++) {
                tmp[i] = methods[i];
            }
            methods = tmp;
        }
        methods[count] = m;
        count++;
    }

    public void processPayments(double amount) {
        System.out.println("=== Traitement des paiements de " + amount + " ===");
        for (int i = 0; i < count; i++) {
            PaymentMethod m = methods[i];
            System.out.println("-> Via " + m.getName());
            boolean paid = m.pay(amount);
            if (paid) {
                m.refund(amount / 2);
            }
            System.out.println();
        }
    }
}