package formationjavaTP5;

public class Moteur {

    String type;
    int puissance;

    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    public String toString() {
        return type + " " + puissance + "ch";
    }

}