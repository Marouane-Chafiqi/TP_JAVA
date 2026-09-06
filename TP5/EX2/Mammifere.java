package formationjavaTP5;

public class Mammifere extends Animal {

    String couleurFourrure;

    public Mammifere(String nom, int age, String couleurFourrure) {
        super(nom, age);
        this.couleurFourrure = couleurFourrure;
    }

    public void allaiter() {
        System.out.println(nom + " allaite ses petits.");
    }

    public String toString() {
        return super.toString() + " {Mammifere, fourrure=" + couleurFourrure + "}";
    }

}