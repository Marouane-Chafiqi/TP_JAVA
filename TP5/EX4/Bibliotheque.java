package formationjavaTP5;

public class Bibliotheque {

    private Document[] documents;
    private int capacite;
    private int nbDocuments;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        documents = new Document[capacite];
        nbDocuments = 0;
    }

    public boolean ajouter(Document doc) {

        if (nbDocuments == capacite) {
            return false;
        }

        documents[nbDocuments] = doc;
        nbDocuments++;
        return true;
    }

    public boolean supprimer(Document doc) {

        int index = -1;

        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i] == doc) {
                index = i;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbDocuments - 1; i++) {
            documents[i] = documents[i + 1];
        }

        documents[nbDocuments - 1] = null;
        nbDocuments--;
        return true;
    }

    public Document document(int numEnrg) {

        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }

        return null;
    }

    public void afficherDocuments() {
        System.out.println("La bibliotheque contient " + nbDocuments + " document(s) :");

        for (int i = 0; i < nbDocuments; i++) {
            System.out.println("  - " + documents[i]);
        }
    }

    public void afficherAuteurs() {
        System.out.println("Auteurs :");

        for (int i = 0; i < nbDocuments; i++) {
            String auteur = documents[i].getAuteur();

            if (auteur != null) {
                System.out.println("  - " + auteur);
            }
        }
    }

}