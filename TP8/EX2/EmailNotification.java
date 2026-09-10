package TP8;

public class EmailNotification implements Notification {
    String fromAddress;

    public EmailNotification(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void send(String recipient, String message) {
        System.out.println("[Email] From: " + fromAddress + " To: " + recipient + " - " + message);
    }

    public int getPriority() {
        return 1;
    }

    public String getType() {
        return "Email";
    }
}