package formationjavaTP5;

public class Moto extends Motorise {

    double cylindree;

    public Moto(String modele, Moteur moteur, double carburant, double cylindree) {
        super(modele, moteur, carburant);
        this.cylindree = cylindree;
    }

    public void faireWheelie() {
        System.out.println(modele + " fait un wheelie !");
    }

    public String toString() {
        return super.toString() + " {Moto, cylindree=" + cylindree + " cm3}";
    }

}