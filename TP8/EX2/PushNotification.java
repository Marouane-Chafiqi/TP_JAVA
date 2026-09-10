package TP8;

public class PushNotification implements Notification {
    String appId;

    public PushNotification(String appId) {
        this.appId = appId;
    }

    public void send(String recipient, String message) {
        System.out.println("[Push] App: " + appId + " User: " + recipient + " - " + message);
    }

    public int getPriority() {
        return 0;
    }

    public String getType() {
        return "Push";
    }
}