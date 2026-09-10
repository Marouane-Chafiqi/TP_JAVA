package formationjava;

public class Vendeur extends EmployeSalarie {
    double commission;

    public Vendeur(String nom, String prenom, double salaireMensuel, double commission) {
        super(nom, prenom, salaireMensuel);
        this.commission = commission;
    }

    public double calculerSalaire() {
        return salaireMensuel + commission;
    }
}