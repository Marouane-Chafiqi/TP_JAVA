package formationjavaTP5;

public class Vehicule {

    static int compteur = 0;

    int id;
    String modele;

    public Vehicule(String modele) {
        compteur++;
        id = compteur;
        this.modele = modele;
    }

    public String toString() {
        return "Vehicule#" + id + " [" + modele + "]";
    }

}