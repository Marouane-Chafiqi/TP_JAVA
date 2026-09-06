package formationjavaTP4;

public class Etudiant {
	 
    static int compteur = 0;
 
    int id;
    String nom;
    String prenom;
    Filiere filiere;
 
    public Etudiant(String nom, String prenom) {
        compteur = compteur + 1;
        id = compteur;
        this.nom = nom;
        this.prenom = prenom;
    }
 
    public void setFiliere(Filiere f) {
        filiere = f;
    }
 
    public int getId() {
        return id;
    }
 
    public String getNom() {
        return nom;
    }
 
    public String getPrenom() {
        return prenom;
    }
 
    public Filiere getFiliere() {
        return filiere;
    }
 
    public String toString() {
        String fil = "Aucune";
        if (filiere != null) {
            fil = filiere.getNom();
        }
        return "Etudiant[id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", filiere=" + fil + "]";
    }
 
}