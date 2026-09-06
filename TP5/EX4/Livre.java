package formationjavaTP5;

public class Livre extends Document {

    private int nbPages;
    private String editeur;

    public Livre(String titre, String auteur, int nbPages, String editeur) {
        super(titre, auteur);
        this.nbPages = nbPages;
        this.editeur = editeur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String toString() {
        return super.toString() + " {Livre, pages=" + nbPages + ", editeur=" + editeur + "}";
    }

}