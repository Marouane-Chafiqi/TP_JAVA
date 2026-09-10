package TP6;

public class Media {
    String titre;

    public Media(String titre) {
        this.titre = titre;
    }

    public void lire() {
        System.out.println("Lecture de : " + titre);
    }

    public int getDuree() {
        return 0;
    }
}