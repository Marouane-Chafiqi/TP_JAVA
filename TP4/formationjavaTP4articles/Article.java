package formationjavaTP4articles;

public class Article {
	 
    static int compteur = 0;
 
    int id;
    int code;
    String designation;
    Categorie categorie;
 
    public Article(int code, String designation, Categorie categorie) {
        compteur++;
        id = compteur;
        this.code = code;
        this.designation = designation;
        this.categorie = categorie;
    }
 
    public int getId() { return id; }
    public Categorie getCategorie() { return categorie; }
 
    public String toString() {
        return id + " " + code + " " + designation;
    }
 
}
 