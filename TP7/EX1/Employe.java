package formationjava;

public abstract class Employe {
    String nom;
    String prenom;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double calculerSalaire();

    public String toString() {
        return nom + " " + prenom + " -> Salaire = " + calculerSalaire() + " DH";
    }
}