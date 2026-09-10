package TP6;

public class LiveStream extends Media {
    String url;

    public LiveStream(String titre, String url) {
        super(titre);
        this.url = url;
    }

    public void lire() {
        System.out.println("Demarrage du live : " + titre + " - " + url);
    }

    public int getDuree() {
        return -1; // duree machi ma3rofa
    }
}