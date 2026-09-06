package formationjavaTP5;

public class main {

    public static void main(String[] args) {

        Compte c1 = new Compte(1000);
        CompteEpargne ce = new CompteEpargne(500, 3);
        CompteCourant cc = new CompteCourant(200, 300);

        c1.afficherDetails();
        c1.deposer(200);
        c1.retirer(1500);
        c1.afficherDetails();

        ce.afficherDetails();
        ce.appliquerInterets();
        ce.afficherDetails();

        cc.afficherDetails();
        cc.retirer(400);
        cc.afficherDetails();
    }

}