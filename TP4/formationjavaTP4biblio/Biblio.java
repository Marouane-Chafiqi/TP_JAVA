package formationjavaTP4biblio;

import java.util.HashSet;
import java.util.Set;
 
public class Biblio {
 
    static int compteur = 0;
 
    int id;
    String nom;
    Set<Livre> collection = new HashSet<>();
 
    public Biblio(String nom) {
        compteur++;
        id = compteur;
        this.nom = nom;
    }
 
    public Set<Livre> getCollection() { return collection; }
 
    public void ajouterLivre(Livre livre) {
        collection.add(livre);
    }
 
    public String toString() {
        return "Biblio[id=" + id + ", nom=" + nom + ", taille=" + collection.size() + "]";
    }
 
}
 