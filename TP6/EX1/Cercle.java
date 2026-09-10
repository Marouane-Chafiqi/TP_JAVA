package TP6;

public class Cercle extends Forme {
    double rayon;

    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    public void dessiner() {
        System.out.println("Cercle " + couleur + ", rayon = " + rayon);
    }
}