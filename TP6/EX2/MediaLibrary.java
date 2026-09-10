package TP6;

public class MediaLibrary {
    Media[] items = new Media[4];
    int count = 0;

    public void add(Media m) {
        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            items = tmp;
        }
        items[count] = m;
        count++;
    }

    public void playAll() {
        System.out.println("=== Lecture de la bibliotheque ===");
        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    public int totalDuration() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();
            if (d > 0) {
                sum = sum + d;
            }
        }
        return sum;
    }
}