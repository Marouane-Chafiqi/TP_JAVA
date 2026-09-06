package formationjavaTP4biblio;

public class main {
	 
    public static void main(String[] args) {
 
        Auteur hugo = new Auteur("Victor Hugo");
        Auteur orwell = new Auteur("George Orwell");
 
        Livre m1 = new Livre("Les Miserables", hugo);
        Livre ndp = new Livre("Notre-Dame de Paris", hugo);
        Livre l1984 = new Livre("1984", orwell);
 
        Biblio centrale = new Biblio("Centrale");
        Biblio quartier = new Biblio("Quartier");
 
        centrale.ajouterLivre(m1);
        centrale.ajouterLivre(l1984);
        quartier.ajouterLivre(m1);
        quartier.ajouterLivre(ndp);
 
        System.out.println(hugo);
        for (Livre l : hugo.getLivres()) System.out.println("  - " + l);
 
        System.out.println(orwell);
        for (Livre l : orwell.getLivres()) System.out.println("  - " + l);
 
        System.out.println(centrale);
        for (Livre l : centrale.getCollection()) System.out.println("  - " + l.getTitre());
 
        System.out.println(quartier);
        for (Livre l : quartier.getCollection()) System.out.println("  - " + l.getTitre());
    }
 
}
 