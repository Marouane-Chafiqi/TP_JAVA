package formationjavaTP4biblio;

public class Livre {
	 
    static int compteur = 0;
 
    int id;
    String titre;
    Auteur auteur;
 
    public Livre(String titre, Auteur auteur) {
        compteur++;
        id = compteur;
        this.titre = titre;
        this.auteur = auteur;
        auteur.ajouterLivre(this);
    }
 
    public int getId() { return id; }
    public String getTitre() { return titre; }
 
    public String toString() {
        return "Livre[id=" + id + ", titre=" + titre + ", auteur=" + auteur.getNom() + "]";
    }
 
}
 