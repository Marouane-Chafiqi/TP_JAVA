package formationjava;

public class EmployeHoraire extends Employe {
    double tauxHoraire;
    double heuresTravaillees;

    public EmployeHoraire(String nom, String prenom, double tauxHoraire, double heuresTravaillees) {
        super(nom, prenom);
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}