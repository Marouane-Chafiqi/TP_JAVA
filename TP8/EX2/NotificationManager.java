package TP8;

public class NotificationManager {
    Notification[] channels = new Notification[3];
    int count = 0;

    public void addChannel(Notification n) {
        if (count == channels.length) {
            Notification[] tmp = new Notification[channels.length * 2];
            for (int i = 0; i < channels.length; i++) {
                tmp[i] = channels[i];
            }
            channels = tmp;
        }
        channels[count] = n;
        count++;
    }

    public void broadcast(String recipient, String message) {
        // Ndiro copie mrtba selon priorite (tri manuel: bubble sort sahel)
        Notification[] sorted = new Notification[count];
        for (int i = 0; i < count; i++) {
            sorted[i] = channels[i];
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (sorted[j].getPriority() < sorted[j + 1].getPriority()) {
                    Notification temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        System.out.println("Broadcast to " + recipient + ":");
        for (int i = 0; i < count; i++) {
            Notification n = sorted[i];
            System.out.print("Channel [" + n.getType() + ", prio=" + n.getPriority() + "]: ");
            n.send(recipient, message);
        }
        System.out.println();
    }
}