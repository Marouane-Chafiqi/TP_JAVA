package formationjavaTP4biblio;

import java.util.ArrayList;
import java.util.List;
 
public class Auteur {
 
    static int compteur = 0;
 
    int id;
    String nom;
    List<Livre> livres = new ArrayList<>();
 
    public Auteur(String nom) {
        compteur++;
        id = compteur;
        this.nom = nom;
    }
 
    public String getNom() { return nom; }
    public List<Livre> getLivres() { return livres; }
 
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }
 
    public String toString() {
        return "Auteur[id=" + id + ", nom=" + nom + ", nbLivres=" + livres.size() + "]";
    }
 
}
 