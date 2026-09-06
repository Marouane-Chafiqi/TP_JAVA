package formationjavaTP5;

public class Animal {

    static int compteur = 0;

    int id;
    String nom;
    int age;

    public Animal(String nom, int age) {
        compteur++;
        id = compteur;
        this.nom = nom;
        this.age = age;
    }

    public void seDeplacer() {
        System.out.println(nom + " se deplace.");
    }

    public String toString() {
        return "Animal[id=" + id + ", nom=" + nom + ", age=" + age + "]";
    }

}