package TP6;

public class Triangle extends Forme {
    double base;
    double hauteur;

    public Triangle(String couleur, double base, double hauteur) {
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    public void dessiner() {
        System.out.println("Triangle " + couleur + ", base = " + base + ", hauteur = " + hauteur);
    }
}