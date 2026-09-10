package TP6;

public class Video extends Media {
    int duree;
    String resolution;

    public Video(String titre, int duree, String resolution) {
        super(titre);
        this.duree = duree;
        this.resolution = resolution;
    }

    public void lire() {
        System.out.println("Lecture video : " + titre + " [" + resolution + "]");
    }

    public int getDuree() {
        return duree;
    }
}