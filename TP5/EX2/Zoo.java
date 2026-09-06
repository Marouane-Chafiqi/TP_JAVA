package formationjavaTP5;

public class Zoo {

    Animal[] animaux;
    int nbAnimaux;

    public Zoo() {
        animaux = new Animal[5];
        nbAnimaux = 0;
    }

    public void ajouterAnimal(Animal a) {

        if (nbAnimaux == animaux.length) {
            Animal[] tmp = new Animal[animaux.length * 2];

            for (int i = 0; i < animaux.length; i++) {
                tmp[i] = animaux[i];
            }

            animaux = tmp;
        }

        animaux[nbAnimaux] = a;
        nbAnimaux++;
    }

    public void afficherTous() {
        System.out.println("Le zoo contient " + nbAnimaux + " animaux :");

        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println("  - " + animaux[i]);
        }
    }

}