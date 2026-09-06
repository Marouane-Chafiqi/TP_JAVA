package formationjavaTP5;

public class Voitureelectrique extends Motorise {

    public Voitureelectrique(String modele, Moteur moteur, double batterieInitial) {
        super(modele, moteur, batterieInitial);
    }

    public void refuel(double kWh) {
        niveauCarburant = niveauCarburant + kWh;
        System.out.println(modele + " recharge " + kWh + " kWh (niveau=" + niveauCarburant + ")");
    }

    public String toString() {
        String base = super.toString();
        base = base.replace("carburant", "batterie");
        return base + " {Electrique}";
    }

}