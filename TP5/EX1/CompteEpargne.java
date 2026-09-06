package formationjavaTP5;

public class CompteEpargne extends Compte {

    double taux;

    public CompteEpargne(double soldeInitial, double taux) {
        super(soldeInitial);
        this.taux = taux;
    }

    public void appliquerInterets() {
        double interets = solde * taux / 100;
        solde = solde + interets;
        System.out.println("CompteEpargne #" + numero + " : interets = " + interets);
    }

    public void afficherDetails() {
        System.out.println("CompteEpargne #" + numero + " - solde = " + solde + ", taux = " + taux);
    }

}