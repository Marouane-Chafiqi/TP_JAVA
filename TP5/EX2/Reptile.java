package formationjavaTP5;

public class Reptile extends Animal {

    String typeEcailles;

    public Reptile(String nom, int age, String typeEcailles) {
        super(nom, age);
        this.typeEcailles = typeEcailles;
    }

    public void seChauffer() {
        System.out.println(nom + " se chauffe au soleil.");
    }

    public String toString() {
        return super.toString() + " {Reptile, ecailles=" + typeEcailles + "}";
    }

}