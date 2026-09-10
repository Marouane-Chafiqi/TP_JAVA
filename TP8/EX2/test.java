package TP8;

public class test {
    public static void main(String[] args) {
        NotificationManager mgr = new NotificationManager();

        mgr.addChannel(new EmailNotification("marwan-chafiqi@gmail.com"));
        mgr.addChannel(new SMSNotification("+212642956792"));
        mgr.addChannel(new PushNotification("Marwan.id"));

        mgr.broadcast("said.ch@gmail.com", "Votre commande est expediee.");
        mgr.broadcast("+212648292322", "Votre code de verification est 123456.");
    }
}