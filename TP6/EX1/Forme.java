package TP6;

public class Forme {
    String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public void dessiner() {
        System.out.println("Forme de couleur " + couleur);
    }
}