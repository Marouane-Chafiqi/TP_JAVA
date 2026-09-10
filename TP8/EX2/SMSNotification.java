package TP8;

public class SMSNotification implements Notification {
    String senderNumber;

    public SMSNotification(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public void send(String recipient, String message) {
        System.out.println("[SMS] From: " + senderNumber + " To: " + recipient + " - " + message);
    }

    public int getPriority() {
        return 2;
    }

    public String getType() {
        return "SMS";
    }
}