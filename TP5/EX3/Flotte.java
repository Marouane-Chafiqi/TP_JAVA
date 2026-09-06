package formationjavaTP5;

public class Flotte {

    Vehicule[] parc = new Vehicule[5];
    int nb = 0;

    public void ajouter(Vehicule v) {

        if (nb == parc.length) {
            Vehicule[] tmp = new Vehicule[parc.length * 2];

            for (int i = 0; i < parc.length; i++) {
                tmp[i] = parc[i];
            }

            parc = tmp;
        }

        parc[nb] = v;
        nb++;
    }

    public void afficherTous() {
        System.out.println("Flotte (" + nb + " vehicules) :");

        for (int i = 0; i < nb; i++) {
            System.out.println("  - " + parc[i]);
        }
    }

    public double distanceTotale() {
        double sum = 0;

        for (int i = 0; i < nb; i++) {
            if (parc[i] instanceof Motorise) {
                Motorise m = (Motorise) parc[i];
                sum = sum + m.kmTotal;
            }
        }

        return sum;
    }

}