package formationjavaTP5;

public class Motorise extends Vehicule {

    Moteur moteur;
    double niveauCarburant;
    double kmTotal = 0;

    public Motorise(String modele, Moteur moteur, double carburantInitial) {
        super(modele);
        this.moteur = moteur;
        this.niveauCarburant = carburantInitial;
    }

    public void demarrer() {
        System.out.println(toString() + " demarre avec " + niveauCarburant + " unites et moteur " + moteur);
    }

    public void rouler(double km) {
        double conso = km * 0.1;

        if (niveauCarburant >= conso) {
            niveauCarburant = niveauCarburant - conso;
            kmTotal = kmTotal + km;
            System.out.println(modele + " a roule " + km + " km, reste " + niveauCarburant + " unites");
        } else {
            System.out.println("Carburant insuffisant pour " + km + " km sur " + modele + " (reste : " + niveauCarburant + " unites)");
        }
    }

    public void refuel(double quantite) {
        niveauCarburant = niveauCarburant + quantite;
        System.out.println(modele + " ravitaille de " + quantite + " unites (nouveau niveau : " + niveauCarburant + ")");
    }

    public String toString() {
        return super.toString() + " {" + moteur + ", carburant=" + niveauCarburant + "}";
    }

}