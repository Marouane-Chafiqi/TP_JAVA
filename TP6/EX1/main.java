package TP6;

public class main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[4];
        formes[0] = new Cercle("Rouge", 5.0);
        formes[1] = new Rectangle("Bleu", 4.0, 3.0);
        formes[2] = new Triangle("Vert", 6.0, 2.5);
        formes[3] = new Forme("Noir");

        for (int i = 0; i < formes.length; i++) {
            formes[i].dessiner();
        }
    }
}