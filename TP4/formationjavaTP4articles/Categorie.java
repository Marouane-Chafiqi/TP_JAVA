package formationjavaTP4articles;

public class Categorie {
	 
    static int compteur = 0;
 
    int id;
    String libelle;
    String code;
 
    public Categorie(String libelle, String code) {
        compteur++;
        id = compteur;
        this.libelle = libelle;
        this.code = code;
    }
 
    public int getId() { return id; }
    public String getLibelle() { return libelle; }
    public String getCode() { return code; }
 
    public String toString() {
        return "Categorie{id=" + id + ", libelle='" + libelle + "', code='" + code + "'}";
    }
 
}
 