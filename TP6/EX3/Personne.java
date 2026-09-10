package TP6;

public abstract class Personne {
    String nom;
    double salaireBase;

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    // Method abstraite - kolla sous-classe khassha tsawbha b tariqa dyalha
    public abstract double calculerSalaire();

    public void affiche() {
        System.out.println("Ana " + nom + ", salaire = " + calculerSalaire());
    }
}