package TP6;

public class Manager extends Personne {
    public Manager(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    public double calculerSalaire() {
        return salaireBase * 1.30; // zyada dyal 30%
    }
}