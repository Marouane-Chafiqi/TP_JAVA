package formationjavaTP5;

public class Compte {

    static int compteur = 0;

    int numero;
    double solde;

    public Compte(double soldeInitial) {
        compteur++;
        numero = compteur;
        solde = soldeInitial;
    }

    public void deposer(double montant) {
        solde = solde + montant;
        System.out.println("Compte #" + numero + " : depot de " + montant);
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde = solde - montant;
            System.out.println("Compte #" + numero + " : retrait de " + montant);
        } else {
            System.out.println("Compte #" + numero + " : retrait impossible");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte #" + numero + " - solde = " + solde);
    }

}