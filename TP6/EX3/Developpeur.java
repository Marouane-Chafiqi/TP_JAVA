package TP6;

public class Developpeur extends Personne {
    public Developpeur(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    public double calculerSalaire() {
        return salaireBase * 1.10; // zyada dyal 10%
    }
}