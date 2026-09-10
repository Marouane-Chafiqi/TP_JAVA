package TP6;

public class Rectangle extends Forme {
    double largeur;
    double hauteur;

    public Rectangle(String couleur, double largeur, double hauteur) {
        super(couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void dessiner() {
        System.out.println("Rectangle " + couleur + ", largeur = " + largeur + ", hauteur = " + hauteur);
    }
}