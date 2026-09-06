package formationjavaTP5;

public class CompteCourant extends Compte {

    double decouvert;

    public CompteCourant(double soldeInitial, double decouvert) {
        super(soldeInitial);
        this.decouvert = decouvert;
    }

    public void retirer(double montant) {
        if (solde + decouvert >= montant) {
            solde = solde - montant;
            System.out.println("CompteCourant #" + numero + " : retrait de " + montant);
        } else {
            System.out.println("CompteCourant #" + numero + " : retrait impossible");
        }
    }

    public void afficherDetails() {
        System.out.println("CompteCourant #" + numero + " - solde = " + solde + ", decouvert = " + decouvert);
    }

}