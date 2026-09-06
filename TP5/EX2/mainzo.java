package formationjavaTP5;

public class mainzo {

    public static void main(String[] args) {

        Zoo monzo = new Zoo();

        monzo.ajouterAnimal(new Mammifere("Lion", 5, "Doree"));
        monzo.ajouterAnimal(new Oiseau("Aigle", 3, 2.3));
        monzo.ajouterAnimal(new Reptile("Crocodile", 12, "Epaisse"));

        monzo.afficherTous();
        System.out.println();

        Animal a1 = new Mammifere("Elephant", 10, "Grise");
        monzo.ajouterAnimal(a1);
        ((Mammifere) a1).allaiter();

        Animal a2 = new Oiseau("Autruche", 6, 1.8);
        monzo.ajouterAnimal(a2);
        ((Oiseau) a2).voler();
    }

}