package TP6;

public class Audio extends Media {
    int duree; // f secondes

    public Audio(String titre, int duree) {
        super(titre);
        this.duree = duree;
    }

    public void lire() {
        System.out.println("Lecture audio : " + titre);
    }

    public int getDuree() {
        return duree;
    }
}