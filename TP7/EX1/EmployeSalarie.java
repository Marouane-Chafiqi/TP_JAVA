package formationjava;

public class EmployeSalarie extends Employe {
    double salaireMensuel;

    public EmployeSalarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    public double calculerSalaire() {
        return salaireMensuel;
    }
}