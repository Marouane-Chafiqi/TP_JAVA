package formationjavaTP5;

public class Document {

    static int compteur = 0;

    private int numEnreg;
    private String titre;
    private String auteur;

    public Document(String titre, String auteur) {
        compteur++;
        numEnreg = compteur;
        this.titre = titre;
        this.auteur = auteur;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String toString() {
        String s = "Document[numEnreg=" + numEnreg + ", titre=" + titre;
        if (auteur != null) {
            s = s + ", auteur=" + auteur;
        }
        s = s + "]";
        return s;
    }

}